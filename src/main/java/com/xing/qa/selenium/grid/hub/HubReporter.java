package com.xing.qa.selenium.grid.hub;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.influxdb.InfluxDB;
import org.influxdb.dto.Point;
import org.openqa.grid.internal.GridRegistry;

import com.xing.qa.selenium.grid.BaseSeleniumReporter;

public class HubReporter extends BaseSeleniumReporter {

    private final GridRegistry registry;

    public HubReporter(String remoteHostName, InfluxDB influxdb, String database, GridRegistry registry) {
        super(remoteHostName, influxdb, database);
        this.registry = registry;
    }

    @Override
    protected void report() {
        log.log(Level.INFO, "Reporting: hub measure");
        Point point = Point.measurement("hub.measure").time(System.currentTimeMillis(), TimeUnit.MILLISECONDS)
                .field("session.active", registry.getActiveSessions().size()).build();
        write(point);
    }

}

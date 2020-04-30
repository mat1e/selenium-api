package com.xing.qa.selenium.grid.hub;

import org.influxdb.InfluxDB;

import com.xing.qa.selenium.grid.BaseSeleniumReporter;

public class HubReporter extends BaseSeleniumReporter {

    public HubReporter(String remoteHostName, InfluxDB influxdb, String database) {
        super(remoteHostName, influxdb, database);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void report() {
        // TODO Auto-generated method stub
        
    }

}

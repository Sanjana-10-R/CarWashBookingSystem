package com.wipro.cws.entity;

public class ServiceCenter {
    private String centerId;
    private String centerName;
    private String location;

    public ServiceCenter(String centerId, String centerName, String location) {
        this.centerId = centerId;
        this.centerName = centerName;
        this.location = location;
    }

    public String getCenterId() {
        return centerId;
    }

    public String getCenterName() {
        return centerName;
    }

    public String getLocation() {
        return location;
    }
}
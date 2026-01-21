package com.wipro.cws.entity;

public class PackageInfo {
    private String packageId;
    private String packageName;
    private double price;

    public PackageInfo(String packageId, String packageName, double price) {
        this.packageId = packageId;
        this.packageName = packageName;
        this.price = price;
    }

    public String getPackageId() {
        return packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public double getPrice() {
        return price;
    }
}
package com.wipro.cws.entity;


public class Booking {
    private String bookingId;
    private String userId;
    private String centerId;
    private String packageId;
    private String date;
    private String timeSlot;
    private double totalFare;

    public Booking(String bookingId, String userId, String centerId,
                   String packageId, String date, String timeSlot, double totalFare) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.centerId = centerId;
        this.packageId = packageId;
        this.date = date;
        this.timeSlot = timeSlot;
        this.totalFare = totalFare;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getUserId() {
        return userId;
    }

    public String getCenterId() {
        return centerId;
    }

    public String getPackageId() {
        return packageId;
    }

    public String getDate() {
        return date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public double getTotalFare() {
        return totalFare;
    }
}
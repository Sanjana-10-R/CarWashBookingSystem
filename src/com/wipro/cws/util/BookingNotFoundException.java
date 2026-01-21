package com.wipro.cws.util;

public class BookingNotFoundException extends Exception {
    public String toString() {
        return "Booking ID Not Found!";
    }
}
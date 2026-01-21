package com.wipro.cws.main;

import java.util.ArrayList;
import com.wipro.cws.entity.*;
import com.wipro.cws.service.BookingService;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("U001", "Vikram", "9876543210"));

        ArrayList<ServiceCenter> centers = new ArrayList<>();
        centers.add(new ServiceCenter("C101", "Sparkle Wash", "Chennai"));

        ArrayList<PackageInfo> packages = new ArrayList<>();
        packages.add(new PackageInfo("P001", "Premium Wash", 600));

        ArrayList<Booking> bookings = new ArrayList<>();

        BookingService service = new BookingService(users, centers, packages, bookings);

        try {
            Booking b = service.bookService("U001", "C101", "P001",
                    "2025-09-20", "10 AM - 11 AM");
            System.out.println("Booking Successful: " + b.getBookingId());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
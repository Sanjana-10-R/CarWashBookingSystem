package com.wipro.cws.service;


import java.util.ArrayList;
import com.wipro.cws.entity.*;
import com.wipro.cws.util.*;

public class BookingService {

    private ArrayList<User> users;
    private ArrayList<ServiceCenter> centers;
    private ArrayList<PackageInfo> packages;
    private ArrayList<Booking> bookings;

    public BookingService(ArrayList<User> users,
                          ArrayList<ServiceCenter> centers,
                          ArrayList<PackageInfo> packages,
                          ArrayList<Booking> bookings) {
        this.users = users;
        this.centers = centers;
        this.packages = packages;
        this.bookings = bookings;
    }

    public boolean validateUser(String userId) throws InvalidUserException {
        for (User u : users) {
            if (u.getUserId().equals(userId))
                return true;
        }
        throw new InvalidUserException();
    }

    public ServiceCenter findCenter(String centerId) throws CenterNotFoundException {
        for (ServiceCenter c : centers) {
            if (c.getCenterId().equals(centerId))
                return c;
        }
        throw new CenterNotFoundException();
    }

    public PackageInfo findPackage(String packageId) throws BookingOperationException {
        for (PackageInfo p : packages) {
            if (p.getPackageId().equals(packageId))
                return p;
        }
        throw new BookingOperationException();
    }

    public boolean checkSlotAvailability(String centerId, String date, String timeSlot)
            throws SlotUnavailableException {
        for (Booking b : bookings) {
            if (b.getCenterId().equals(centerId) &&
                b.getDate().equals(date) &&
                b.getTimeSlot().equals(timeSlot)) {
                throw new SlotUnavailableException();
            }
        }
        return true;
    }

    public Booking bookService(String userId, String centerId, String packageId,
                               String date, String timeSlot) throws Exception {

        validateUser(userId);
        findCenter(centerId);
        PackageInfo pkg = findPackage(packageId);
        checkSlotAvailability(centerId, date, timeSlot);

        String bookingId = "B" + (bookings.size() + 1);
        double fare = pkg.getPrice();

        Booking booking = new Booking(bookingId, userId, centerId,
                packageId, date, timeSlot, fare);

        bookings.add(booking);
        return booking;
    }

    public void cancelBooking(String bookingId) throws BookingNotFoundException {
        for (Booking b : bookings) {
            if (b.getBookingId().equals(bookingId)) {
                bookings.remove(b);
                return;
            }
        }
        throw new BookingNotFoundException();
    }

    public void printUserBookings(String userId) {
        for (Booking b : bookings) {
            if (b.getUserId().equals(userId)) {
                System.out.println(b.getBookingId() + " " +
                        b.getDate() + " " + b.getTimeSlot());
            }
        }
    }
}
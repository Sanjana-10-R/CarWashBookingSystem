package com.wipro.cws.util;

public class SlotUnavailableException extends Exception {
    public String toString() {
        return "Selected Slot is Unavailable!";
    }
}
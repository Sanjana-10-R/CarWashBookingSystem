package com.wipro.cws.util;

public class InvalidUserException extends Exception {
    public String toString() {
        return "Invalid User ID!";
    }
}
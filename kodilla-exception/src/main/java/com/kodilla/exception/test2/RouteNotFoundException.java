package com.kodilla.exception.test2;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(final String message) {
        super(message);
    }
}

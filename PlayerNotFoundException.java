package com.codegnan.cricket.exceptions;

// Custom exception thrown when the requested player is not found in the system.

public class PlayerNotFoundException extends Exception {

    public PlayerNotFoundException() {
        super();
    }

    public PlayerNotFoundException(String message) {
        super(message);
    }
}

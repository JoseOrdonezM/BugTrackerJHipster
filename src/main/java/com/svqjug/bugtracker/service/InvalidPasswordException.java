package com.svqjug.bugtracker.service;

public class InvalidPasswordException extends RuntimeException {

    public InvalidPasswordException() {
        super("Incorrect password");
    }

}

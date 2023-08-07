package com.example.springDemo.Student;

import org.antlr.v4.runtime.RuntimeMetaData;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long studentId) {
        super("Could not found the user with id: " + studentId);
    }
}

package com.backend.crud.exception;

import org.bson.types.ObjectId;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id) {
        super("Could not found the user with id " + id);
    }
}

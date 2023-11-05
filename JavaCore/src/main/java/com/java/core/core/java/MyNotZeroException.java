package com.java.core.core.java;

public class MyNotZeroException extends RuntimeException {

    @Override
    public String getMessage() {
        return "This is Message set from My Exception";
    }
}

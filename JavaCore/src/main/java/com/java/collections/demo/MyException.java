package com.java.collections.demo;

public class MyException extends java.lang.Exception {

    private static final int errorNo = 1000;
    private static final String errorMsg = "My File Not Found Exception";


    public int getErrorNo() {
        return errorNo;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

}

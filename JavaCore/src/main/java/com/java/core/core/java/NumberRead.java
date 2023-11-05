package com.java.core.core.java;

public class NumberRead {


    public void getMyDrive(int i) throws MyNotZeroException {
        if (i == 0)
            throw new MyNotZeroException();
    }
}

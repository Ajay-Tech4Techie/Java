package com.java.collections.demo;

public class ReadMyFileInput {

    String filePath = null;

    public String getFilePath() throws MyException, MtZeroValueException {
        if (filePath == null) throw new MyException();
        if (filePath.isEmpty() == false) throw new MtZeroValueException();
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


}

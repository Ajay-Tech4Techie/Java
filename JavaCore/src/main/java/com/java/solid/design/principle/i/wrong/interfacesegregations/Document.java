package com.java.solid.design.principle.i.wrong.interfacesegregations;

public class Document {
    private String text;
    private int pageNo;

}
//use absolute minimum amount of code into an interface so that at no point does a developer
//No point do they have to implement a certain methods which they don't need to all
interface Printer{
    void print(Document d);
}

interface Scanner{
    void scan(Document d);
}

interface Faxing{
    void fax(Document d);
}

interface MultiFunctionDevice extends Printer, Scanner{}

class MultiFunctionPrinter implements Printer, Scanner, Faxing{
    @Override
    public void print(Document d) {

    }

    @Override
    public void scan(Document d) {

    }

    @Override
    public void fax(Document d) {

    }
}

class OldFashionedPrinter implements Printer{
    @Override
    public void print(Document d) {

    }
}

// YAGNI = You are not going to need it
package com.java.solid.design.principle.i.correct.interfacesegregation;

public class Document {

}

interface Machine{
    void print(Document d);
    void fax(Document d) throws Exception;
    void scan(Document d);
}

class MultiFunctionPrinter implements Machine{
    @Override
    public void print(Document d) {

    }

    @Override
    public void fax(Document d) {

    }

    @Override
    public void scan(Document d) {

    }
}
//we are breaking the interface segregation principle , becouse we are saying
//that even though somebody is interested in just making ordinary printer , they are still forced to
//implement the fax and the scan methods, env though it's entirely unclear what
//what those methods should do.
//segregation basically menas putting a part of putting into separate categories
class OldFashionedPrinter implements Machine{
   //old fashioned printer only support Normal Printing
    @Override
    public void print(Document d) {

    }
    //Old fashioned Printer does not support Faxing
    //as we implement Machine we have to provide implementation for fax and scan
    //another approach is to throw Exception for fax and scan method.
    @Override
    public void fax(Document d) throws Exception {
    //another option is to throw exception
        throw new Exception();
    }
    //Old fashioned Printer does not support scan
    @Override
    public void scan(Document d) {

    }
}
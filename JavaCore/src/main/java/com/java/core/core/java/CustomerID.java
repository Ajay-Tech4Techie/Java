package com.java.core.core.java;

import java.util.HashMap;
import java.util.Map;

public class CustomerID {
    private long customerId;
    private int nameSpace;

    public CustomerID(long crmID, int nameSpace) {
        super();
        this.customerId = crmID;
        this.nameSpace = nameSpace;
    }

    @Override
    public int hashCode() {
        System.out.println("inside hascode");
        return (int) (customerId + 17);
    }

    public boolean equals(Object obj) {
        //null instanceof Object will always return false
        if (!(obj instanceof CustomerID))
            return false;
        if (obj == this)
            return true;
        return this.customerId == ((CustomerID) obj).customerId &&
                this.nameSpace == ((CustomerID) obj).nameSpace;
    }

    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(new CustomerID(2345891234L, 0), "Jeff Smith");
        System.out.println(m.get(new CustomerID(2345891234L, 0)));
    }

}
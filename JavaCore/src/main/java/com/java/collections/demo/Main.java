package com.java.collections.demo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
/*		Emp e1= new Emp(1,"Vijay");
		Emp e2= new Emp(2,"Singh");
		
		List<Emp> al= new ArrayList<Emp>();
		al.add(e1);
		al.add(e2);

		System.out.println("get "+al.get(0));
		System.out.println("contains "+al.contains(e1));
		System.out.println(System.lineSeparator());
		System.out.println(al.contains(new Emp(1,"Vijay")));
*/
        Emp e1 = new Emp(1, "Vijay");
        Emp e2 = new Emp(2, "Singh");

        Set<Emp> set = new HashSet<Emp>();
        set.add(e1);
        set.add(e2);

        Collections.synchronizedSet(set);

        System.out.println(set.contains(e1));
        System.out.println(System.lineSeparator());
        System.out.println(set.contains(new Emp(1, "Vijay")));

        //Class.forName(className)
    }

}

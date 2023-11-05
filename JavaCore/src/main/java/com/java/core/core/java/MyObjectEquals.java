package com.java.core.core.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyObjectEquals {

    int num;
    String words;

    public MyObjectEquals(int num, String words) {
        this.num = num;
        this.words = words;
    }
/*	
	@Override
	public boolean equals(Object obj){
		if( (obj instanceof MyObjectEquals) && (((MyObjectEquals)obj).num==this.num) )
			return true;
		else 
			return false;
	}
	
	@Override
	public int hashCode(){
		final int hashNum = this.num+17;
		return hashNum;
	}*/

    public String toString() {

        return "MyObject text -> Num :" + this.num + ", word :" + this.words;
    }

    // equals method , = int , float , double
    public static void main(String[] args) {

        MyObjectEquals myObj1 = new MyObjectEquals(2, "Vijay");
        MyObjectEquals myObj2 = new MyObjectEquals(1, "Vijay");

        if (myObj1.equals(myObj2))
            System.out.println("true");
        else
            System.out.println("false");

        Object obj1 = new Object();
        Object obj2 = new Object();

        if (obj1.equals(obj2))
            System.out.println(">true");
        else
            System.out.println(">false");

        Map<MyObjectEquals, String> tm = new HashMap<MyObjectEquals, String>();
        tm.put(myObj1, "Singh");
        tm.put(myObj2, "Chandel");
        System.out.println("---> " + tm.get(myObj1));

        Set hs = new HashSet();

        hs.add(myObj1);
        hs.add(myObj2);
        hs.add(myObj1);
        hs.add(myObj1);

        System.out.println(hs);
        System.out.println("Is HashSet empty? " + hs.isEmpty());
        hs.remove(myObj1);
        System.out.println(hs);
        System.out.println("Size of the HashSet: " + hs.size());
        System.out.println("Does HashSet contains first element? " + hs.contains(myObj1));


        System.out.println("HashSet " + hs.size());

        System.out.println("hs.contains(myObj1) " + hs.contains(myObj1));

        System.out.println("TreeMap tm.containsKey(Vijay) " + tm.get("Vijay"));

        System.out.println("TreeMap " + tm.size());
        System.out.println("TreeMap " + tm.entrySet());

        Set<Entry<MyObjectEquals, String>> set = tm.entrySet();
		
/*		
		for(Entry<String, String> items: set){
			System.out.println("Items "+items);
		}	*/
    }
}

package com.java.collections.demo;

import java.util.HashSet;
import java.util.Set;

import com.java.core.core.java.Employee;

public class SetDemos {
    public static Employee emp1;

    public static void main(String agr[]) {

        ////set contract gurentee that its itration will traverse the set in asending elemet order
        Set<Employee> set = new HashSet<Employee>();

        //new Employee(1,"Vijay");
        Employee emp2 = new Employee(2, "Bana");
        Employee emp3 = new Employee(2, "Cana");

        set.add(emp1);
        set.add(emp2);
        set.add(emp3);

        System.out.println(" set.size() : " + set);

        System.out.println("Check for Employee(1,Vijay) :" + set.contains(new Employee(1, "Vijay")));
        System.out.println("Check for Employee(1,Vijay) :" + set.contains(emp1));

        //System.out.println(" Set "+set.first());
        //System.out.println(" Set "+set.last());
        //System.out.println(" Set "+set.headSet('c'));
        //System.out.println(" Set "+set.tailSet('c'));
		
		/*ReadMyFileInput rmfi =  new ReadMyFileInput();
		
		try {
			rmfi.getFilePath();
		} catch (MtZeroValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyException e) {
			System.out.println("My Exception occurred "+e.getErrorMsg());
			e.printStackTrace();
		}*/


    }


}

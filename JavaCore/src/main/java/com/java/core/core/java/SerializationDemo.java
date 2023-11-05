package com.java.core.core.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String args[]) throws IOException, ClassNotFoundException {

        //1. Create an object e of Emloyee Class and set the values of its member values
        Employee employee1 = new Employee(1, "Vijay");
        Employee employee2 = new Employee(2, "Vijay2");
        Employee employee3 = new Employee(3, "Vijay3");
        Employee employee4 = new Employee(4, "Vijay4");
        //employee1.setEmployeeNumber(1);
        //employee1.setEmployeeName( "Vijay" );


        //  Now we have our employee1 object which contains data in its member variables
        //  employeeNumber and employeeName


        //2. Writing our object into a file using Serialization
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\JAVA\\emp.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee1);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();
        //   Our object is serialized and saved as a file Employee1 (in the folder D:/objects)


        //3. Retrieve the object from the file D:/objects/Employee1
        FileInputStream fileIutputStream = new FileInputStream("D:\\JAVA\\emp.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileIutputStream);

        Employee retrievedEmployee = (Employee) objectInputStream.readObject();
        objectInputStream.close();
        fileIutputStream.close();


        //4. Displaying values from the object retrieved
        System.out.println("Employee Number Retreived : " + retrievedEmployee.getUserID());
        System.out.println("Employee Name Retreived : " + retrievedEmployee.getEmployeeName());

        //during deserializing static block is called
        ///////////////////////////////////////
        ////////////Static Block///////////////
        /////Employee Number Retreived : 0/////
        //Employee Name Retreived : Employee1//
        ///////////////////////////////////////

    }

}
package com.java.core.core.java;

import java.util.*;

class Prime {
    public static void main(String args[]) {
        int n, i, res;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a No.");
        n = scan.nextInt();
        System.out.println("n/2  " + n / 2); // gives diviser

        for (i = 2; i <= n / 2; i++) {
            res = n % i;
            System.out.println("n%i " + n + " % " + i + " = " + n % i); // gives reminder
            if (res == 0) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println(n + " is Prime Number");
        else
            System.out.println(n + " is not Prime Number");
    }
}
      
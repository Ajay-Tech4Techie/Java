package com.java.core.core.java;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Rotational {
    public static void main(String[] arg) {

        String s1pool = "ssvijay";

        String s2pool = "abcdefghijk";


        StringBuilder sbch = new StringBuilder();

        for (int i = s2pool.length() - 1; i >= 0; i--)
            sbch.append(s2pool.charAt(i));

        System.out.println("reverse " + sbch);


        //    toCharArray.toString().charAt();


        //   while(toCharArray.length)
	  /*  
	    for(char cha:toCharArray)
	    	System.out.println(cha);
	    
	    for(int i=toCharArray.length-1;i>=0;i--){
	    	sbch.append(toCharArray);
	    }
	    
	    System.out.print("reverse "+sbch);*/
	    /*
	    for(char ch: toCharArray)
	    	System.out.println(ch);
	     String s3pool = "chandel";
	     
	     String s1Obj = new String("vijay");
		 
	     String s2Obj = "singh";
	     
	     String s3Obj = "chandel";
	     
	     */
        // boolean isTrue = s1pool==s2pool;

        //  System.out.println(s1pool==s2pool);
        // System.out.println(s1pool.equals(s2pool));

        //
        //String inPool=s1Obj.intern();
	     /*A pool of strings, initially empty, is maintained privately by the class String. 

		When the intern method is invoked, if the pool already contains a string equal to this String object
		as determined by the equals(Object) method, then the string from the pool is returned.
		Otherwise, this String object is added to the pool and a reference to this 
		String object is returned. 

		It follows that for any 
		two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true. 
	    
	     System.out.println(s2pool==s1Obj.intern());
	    // String str=s1Obj.intern();
	     System.out.println(s2pool==s1Obj.intern());
	     
	     
	     
	     
	/*     

		 StringBuilder sbr1 =new StringBuilder("Vijay");
		 
	     StringBuilder sbr2 = new StringBuilder(" Singh");
	     
	     sbr1.append(sbr2);
	     
	     System.out.println("sbr1 "+sbr1);
	        
	   //  System.out.println("Check Rotational String "+checkRotationalString(s1,s2));
	
	     String[] stringArray = {"vijay","Singh","chandel"};
	     List<String> list= new LinkedList<String>();
	     
	     for(String singleString:stringArray)
	    	 list.add(singleString);
	     
	     
	     System.out.println("Reverse List : "+reverseList(list));
	     
	*/
    }

    private static List<String> reverseList(List<String> listArg) {
        ListIterator<String> listIterater = listArg.listIterator(listArg.size());
        List<String> reverseListArg = new LinkedList<String>();

        while (listIterater.hasPrevious())
            reverseListArg.add(listIterater.previous());

        return reverseListArg;
    }

    public static boolean checkRotationalString(String arg1, String arg2) {
        String str3 = arg1.concat(arg1);
        //check if two strings does not have same length
        if (arg1.length() != arg2.length()) {
            return false;
        } else {
            if (str3.contains(arg2))
                return true;
            return false;
        }
    }

    public static boolean rotation(String s1, String s2) {

        boolean isFlag = false;
        if (s1.length() != s2.length())
            return false;

        String combine = s1.concat(s2);

        if (s2.contentEquals(new StringBuffer(combine)))
            return true;
		/*	for(int i=0;i<s1.length()-1;i++){
				if(s1.charAt(i)!=s2.charAt(i+1)){
					isFlag=false;
				}
			}*/
        return isFlag;
    }
}



package com.java.core.core.java;

import java.util.*;

public class DuplicateCharsInString {

    public void findDuplicateChars(String str) {
        //Map dupMap2 = new HashMap();
        Map<Character, Integer> dupMap = new TreeMap<Character, Integer>();
        char[] chars = str.toCharArray();
        //looping from first to last chars
        for (Character ch : chars) {
            //check if map key contains Character
            if (dupMap.containsKey(ch)) {
                //if map key is already available then it will override it with updated value
                dupMap.put(ch, dupMap.get(ch) + 1);
            } else {
                dupMap.put(ch, 1);
            }
        }

        //  Set set = dupMap.entrySet();

        System.out.println("result :->" + dupMap);
        
        
        
       /* Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
           // if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
           // }
        }*/
    }

    public static void main(String a[]) {
        //DuplicateCharsInString dcs = new DuplicateCharsInString();
        //dcs.findDuplicateChars("abbcccdddd");
        // findCharsCount("VViijjAyyy");

        new DuplicateCharsInString().findDuplicateChars("ffaskkssdfvvfvveccceertttllccnnwwoo");

        findFreq("ffaskkssdfvvfvveccceertttllccnnwwoo");
    }

    public static int findFreq(String text) {
        char[] charArray = text.toCharArray();
        List<Character> charList = new ArrayList<>();
        
        
        Set<Character> charSet = new TreeSet<>();
        for (char c : charArray) {
            boolean add = charList.add(c);
            charSet.add(c);

        }

        for(char ch :charSet) {
            System.out.println("Char " + ch + " No of times : " + Collections.frequency(charList, ch));
        }
        return 0;
    }

    public static void findCharsCount(String str) {

        Map<Character, Integer> duplicateHashMap = new HashMap<Character, Integer>();

        char charArray[] = str.toCharArray();

        for (char ch : charArray) {
            if (duplicateHashMap.containsKey(ch)) {
                duplicateHashMap.put(ch, duplicateHashMap.get(ch) + 1);
            } else {
                duplicateHashMap.put(ch, 1);
            }
        }

        Set<Character> setNames = duplicateHashMap.keySet();

        for (Character c : setNames) {
            System.out.println("All Chars with frequncy of duplicates " + c + " count " + duplicateHashMap.get(c));

        }

    }


}
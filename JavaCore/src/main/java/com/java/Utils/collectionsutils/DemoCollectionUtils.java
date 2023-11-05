package com.java.Utils.collectionsutils;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.SetUtils;
import org.apache.commons.lang3.StringEscapeUtils;

import java.util.*;


public class DemoCollectionUtils {
    public static void main(String[] args) {


        List<String> list1 = Arrays.asList("One", "Two", "Three","Four");
        List<String> list2 = Arrays.asList("One","Five","Six","Seven");

        System.out.println(" union : " + CollectionUtils.union(list1, list2));
        System.out.println(" intersection : " + CollectionUtils.intersection(list1, list2));
        System.out.println(" disjunction : " + CollectionUtils.disjunction(list1, list2));
        System.out.println(" subtract : " + CollectionUtils.subtract(list1, list2));

        Map<String,String> map = new HashMap();
        map.put("1","one");
        map.put("4","four");
        map.put("2","two");
        map.put("3","three");


        printOutput("MapUtils.isNotEmpty ", MapUtils.isEmpty(new HashMap<>()));
        printOutput("MapUtils.emptyIfNull ",MapUtils.emptyIfNull(new HashMap<>()));
        printOutput("MapUtils.invertMap ",MapUtils.invertMap(map)); //swap key to value and value to key respectively
        //printOutput("MapUtils.isNotEmpty ",MapUtils.fixedSizeSortedMap(map));
        printOutput("MapUtils.orderedMap ",MapUtils.orderedMap(map));
        printOutput("MapUtils.size ",MapUtils.size(map));
        printOutput("MapUtils.size ",MapUtils.size(map));


        List<String> list = null;
        List<String> defaultList = new ArrayList<>();
        defaultList.add("Default value");
        System.out.println("ListUtils.defaultIfNull :"+ ListUtils.defaultIfNull(list, defaultList));

        Set<String> setOne = new HashSet<>();
        setOne.add("one");
        Set<String> setTwo = new HashSet<>();
        setTwo.add("two");
        setTwo.add("three");
        setTwo.add("one");
        printOutput("SetUtils.disjunction ",SetUtils.disjunction(setOne,setTwo));
        printOutput("SetUtils.union ",SetUtils.union(setOne,setTwo));
        printOutput("SetUtils.intersection ",SetUtils.intersection(setOne,setTwo));
        printOutput("SetUtils.difference ",SetUtils.difference(setOne,setTwo));

    }

    private static void printOutput(String name, Object obj){
        System.out.printf("method used : %s =  %s",name, obj +"\n");
    }
}

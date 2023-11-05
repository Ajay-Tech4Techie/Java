package com.java.generics;

import com.java.collection.generics.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class DemoGenerics {
	public static void main(String[] args) {
		Pair<String,Date> pairObj = new Pair<>();
		
		pairObj.setK("Today");
		pairObj.setV(new Date());
		
		System.out.println("Pair "+pairObj.getK() +"  "+pairObj.getV());
		
		
		Pair<Date,String> pairObj2 = new Pair<Date,String>();
		pairObj2.setK(new Date());
		pairObj2.setV("Yesterday");
		
		System.out.println("Pair "+pairObj2.getK() +"  "+pairObj2.getV());
		
		List<Integer> ints = Arrays.asList(1,2,3);
		int s=0;
		for(int n:ints)
		{
			s+=n;
		}
		
		//List<Number> numbers = ints; //compile time error : Type mismatch: cannot convert from List<Integer> to List<Number>
		assert s==6 : "Not Valid" ;
		
		List<Number> nums = new ArrayList<Number>();
		List<Double> doubles = Arrays.asList(1.2,3.1,4.5);
		
		nums.add(2);
		nums.add(3);
		//assert nums.toString()==("[2,3]");
		
		//List<Integer> integers = nums; //compile time error : Type mismatch: cannot convert from List<Integer> to List<Number>
		
		
//	List<In> list=new List<? extends Number>();	
		System.out.println("Summ(ints)    "+summ(ints));
		System.out.println("Summ(nums)    "+summ(nums));
		System.out.println("Summ(doubles) "+summ(doubles));
	}
	
	//whenever you use as iterator , you get values out of the structure , so use an extends wild card
	public static double summ(Collection<? extends Number> nnums){
		double ss=0.0;
		for(Number num: nnums)
			ss+=num.doubleValue();
		return ss;
	}
	
	//whenever you use to add method, you put values into a structure, so use a super wild card
	public static void count(Collection<? super Integer> intsNums,int n){
		for(int i=0;i<n;i++) intsNums.add(i);
	}

}

package com.mywork.java8;

import java.util.List;
import java.util.function.Predicate;

class PredicateInterfaceExample1
{
	public static Predicate<String> hasLengthOf10=new Predicate<String>() {

		@Override
		public boolean test(String t) {
			// TODO Auto-generated method stub
			return t.length()>10;
		}
	};
	public static void predicate_or()
	{
		Predicate<String> containsLetterA=p->p.contains("A");
		String containsA="And";
		boolean outcome=hasLengthOf10.or(containsLetterA).test(containsA);
		System.out.println(outcome);
	}
	static void pred(int number,Predicate<Integer> predicate)
	{
		if(predicate.test(number))
		{
			System.out.println("number.."+number);
		}
	}
	public static void main(String[] args) {
		Predicate<Integer> lesserthan=i->(i<18);
		
		System.out.println(lesserthan.test(10));
		
		Predicate<Integer> greaterthan=(i)->i>1;
		Predicate<Integer> lowerthan =(i)->i<20;
		boolean result=greaterthan.and(lowerthan).test(15);
		System.out.println(result);
		
		//calling predicate method
		boolean result2=greaterthan.and(lowerthan).negate().test(15);
		System.out.println(result2);
		
		
		pred(10, (i)->i>11);;
		pred(10, (i)->i>7);
		System.out.println("or predicate...");
		predicate_or();
		
		
		//
	}
		
	
}
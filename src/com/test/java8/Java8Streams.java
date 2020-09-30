package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class Java8Streams {
	
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		number.stream().filter(n -> n%2 == 0).map(x-> (x * x)).forEach(y->System.out.println(y));
		
		
		int even = number.stream().filter(x->x%2==0).map( y -> y * y).reduce(0,(ans,i)-> ans+i);
		
		System.out.println(even);
		
//		List<Integer> numbers = new ArrayList<Integer>();
//
//		int n=1;
//		do {
//			numbers.add((int) Math.random());
//			n++;
//		}while(n != 15);
//		
//		
//		int ss = numbers.stream().map( nn -> { System.out.println(nn);
//												});
//		
//		
//		
//	
//		List<String> myList =
//			    Arrays.asList("a1", "a2", "b1", "c2", "c1");
//
//			myList
//			    .stream()
//			    .filter(s -> s.startsWith("c"))
//			    .map(String::toUpperCase)
//			    .sorted()
//			    .forEach(System.out::println);
//		
//		
//		List numberss = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//
//		IntSummaryStatistics stats = numberss.stream().mapToInt((x) -> x).summaryStatistics();
//
//		System.out.println("Highest number in List : " + stats.getMax());
//		System.out.println("Lowest number in List : " + stats.getMin());
//		System.out.println("Sum of all numbers : " + stats.getSum());
//		System.out.println("Average of all numbers : " + stats.getAverage());
//		
//		
	}

}

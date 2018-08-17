package com.mywork.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface FunctionalInterface {
	// An abstract function
	void opr(int a, int b);

	// A non-abstract (or default) function
	default void show(String msg) {
		System.out.println(msg);
	}
}

interface frunctional2 {
	int opr1(int x, int y);
}

public class FunctionalInterfaceeg {
	private int opr(int a, int b, frunctional2 f1) {
		return f1.opr1(a, b);
	}

	static long sumparallel(long n) {
		return Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce(0L, Long::sum);
	}

	public static void main(String[] args) {
		// lambda expression to implement above
		// functional interface. This interface
		// by default implements abstractFun()
		int n = 10;
		FunctionalInterface fobj = (a, b) -> System.out.println(a * b + b / a);
		// This calls above lambda expression and prints .
		fobj.opr(5, 10);
		fobj.show("called..");

		ArrayList<String> names = new ArrayList<>();
		names.add("Rupa");
		names.add("Divya");
		names.add("saranshi");
		names.add("Akshay");
		names.add("Birendra");
		names.add("Biurendras");
		names.forEach(s -> {
			if (n % 2 == 0)
				System.out.println(s);
		});

		names.forEach(System.out::println);

		frunctional2 fintrobj2 = (a1, b1) -> (a1 * b1);
		FunctionalInterfaceeg f2 = new FunctionalInterfaceeg();
		System.out.println("......." + f2.opr(5, 4, fintrobj2));

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> square = numbers.stream().map(x -> x * x).collect(Collectors.toList());
		square.forEach(s -> System.out.println("......" + s));

		List<String> filterednames = names.stream().filter(s -> s.startsWith("D")).collect(Collectors.toList());
		filterednames.forEach(s -> System.out.println(".....filtered names.." + s));

		List<String> sortednames = names.stream().sorted().map(s -> s.concat(" ")).collect(Collectors.toList());
		sortednames.forEach(System.out::print);
		sortednames.forEach(s -> System.out.print(s));

		Set s = names.stream().map(x -> x.substring(0, 3)).collect(Collectors.toSet());
		s.forEach(System.out::println);

		numbers.parallelStream().map(x -> x).forEach(System.out::print);
		System.out.println("...........");
		numbers.stream().map(x -> x).forEach(System.out::print);

		// Driver code
		long c = sumparallel(10);
		System.out.println("sum is.." + c);

		// reduce
		List<Integer> nums = Arrays.asList(2, 3, 4, 5);
		int even = nums.stream().reduce(0, (ans, i) -> ans +i );
		System.out.println("even reduce result is..." + even);
	}
}

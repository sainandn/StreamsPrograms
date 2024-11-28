package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingUsingNames {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("sai", "kumar", "krishna", "abhi", "madhu", "ram");
		System.out.println("sorted Order:");
		names.stream().sorted().forEach(e -> System.out.print(e + ", "));
		System.out.println(" ");
		System.out.println("Reversed sorted Order:");
		names.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + ", "));

	}

}

package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortingUsingSal {

	public static void main(String[] args) {
		List<Emp> empobj = Arrays.asList(new Emp(1, "sai", "it", 8000L), new Emp(1, "sri", "it", 4000L),
				new Emp(1, "sal", "it", 6000L), new Emp(1, "vamsi", "hr", 8000L), new Emp(1, "kumar", "hr", 3000L),
				new Emp(1, "rajja", "hr", 7000L), new Emp(1, "madhu", "admin", 6000L),
				new Emp(1, "mani", "admin", 4000L), new Emp(1, "gani", "admin", 5000L));

		Stream<Emp> sortsal = empobj.stream().sorted(Comparator.comparingLong(Emp::getSal));
		System.out.println("Sorting Emp based on Salary");
		sortsal.forEach(e -> System.out.println(e.getName() + "::" + e.getSal()));
		
		System.out.println("Reverse Sorting Emp based on Salary");
		Stream<Emp> revsort = empobj.stream().sorted(Comparator.comparingLong(Emp::getSal).reversed());
		revsort.forEach(e -> System.out.println(e.getName() + "::" + e.getSal()));
	}

}

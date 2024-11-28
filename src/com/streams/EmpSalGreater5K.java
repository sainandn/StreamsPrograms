package com.streams;

import java.util.Arrays;
import java.util.List;

public class EmpSalGreater5K {

	public static void main(String[] args) {
		List<Emp> empobj = Arrays.asList(new Emp(1, "sai", "it", 8000L), new Emp(1, "sri", "it", 4000L),
				new Emp(1, "sal", "it", 6000L), new Emp(1, "vamsi", "hr", 8000L), new Emp(1, "kumar", "hr", 3000L),
				new Emp(1, "rajja", "hr", 7000L), new Emp(1, "madhu", "admin", 6000L),
				new Emp(1, "mani", "admin", 4000L), new Emp(1, "gani", "admin", 5000L));
		System.out.println("Emp salary, who has geater than 5000 :");
		empobj.stream().filter(e -> e.getSal() > 5000)
				.forEach(e -> System.out.println(e.getName() + "::" + e.getSal()));

	}

}

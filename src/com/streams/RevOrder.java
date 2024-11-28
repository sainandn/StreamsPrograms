package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class RevOrder {

	public static void main(String[] args) {
		List<String> li = Arrays.asList("sai","mani","kumar","madhu","sri","gani","vamsi");

		li.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.println(e));
	
		List<Emp> empobj = Arrays.asList(new Emp(1, "sai", "it", 8000L), new Emp(1, "sri", "it", 4000L),
				new Emp(1, "sal", "it", 6000L), new Emp(1, "vamsi", "hr", 8000L), new Emp(1, "kumar", "hr", 3000L),
				new Emp(1, "rajja", "hr", 7000L), new Emp(1, "madhu", "admin", 6000L),
				new Emp(1, "mani", "admin", 4000L), new Emp(1, "gani", "admin", 5000L));
		 empobj.stream().sorted(Comparator.comparing(Emp::getName).reversed()).forEach(e->System.out.println(e.getName()+":"+e.getSal()));
		
	
	}

}

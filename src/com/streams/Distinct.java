package com.streams;

import java.util.Arrays;
import java.util.List;

public class Distinct {

	public static void main(String[] args) {
		List<String> li = Arrays.asList("sai","sai","kumar","madhu","kumar","madhu","sai");
		
		li.stream().distinct().forEach(e->System.out.println(e));
	}

}

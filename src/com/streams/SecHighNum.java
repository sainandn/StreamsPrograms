package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecHighNum {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,3,8,5,7,9,4,2,6);
		
		System.out.println("second highest Number in List:");
		System.out.println(li.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst());

	}

}

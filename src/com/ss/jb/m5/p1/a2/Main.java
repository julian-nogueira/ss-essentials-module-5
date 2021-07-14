package com.ss.jb.m5.p1.a2;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		FuncImp obj = new FuncImp();
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String stringNumbersEvenOdd = obj.buildString(numbers);
		System.out.println(stringNumbersEvenOdd);
	}
}

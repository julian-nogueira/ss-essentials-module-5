package com.ss.jb.m5.p2.a3;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		PerformOperationLambdas obj = new PerformOperationLambdas();
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		List<Integer> listMultiplyByTwo;
	
		listMultiplyByTwo = obj.multiplyByTwo(list);
		listMultiplyByTwo.stream().forEach((integer) -> System.out.println(integer));
	}
}

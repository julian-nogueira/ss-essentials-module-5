package com.ss.jb.m5.p2.a2;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		PerformOperationLambdas obj = new PerformOperationLambdas();
		List<Integer> list = Arrays.asList(1, 22, 93, 104);
		List<Integer> listRightMostDigits;
	
		listRightMostDigits = obj.getRightMostDigits(list);
		listRightMostDigits.stream().forEach((integer) -> System.out.println(integer));
	}
}

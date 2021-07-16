package com.ss.jb.m5.p2.a4;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		PerformOperationLambdas obj = new PerformOperationLambdas();
		List<String> list = Arrays.asList("xxax", "abc", "xxx", "");
	
		List<String> listStripFromStringX = obj.stripFromStringX(list);
		listStripFromStringX.stream().forEach((string) -> System.out.println(string));
	}
}

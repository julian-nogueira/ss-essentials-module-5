package com.ss.jb.m5.p2.a5;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		GroupSum obj = new GroupSum();
		List<Integer> list = Arrays.asList(2, 4, 4, 8);
		Integer target = 10;
		
		System.out.println(obj.groupSum(list, target));
	}
}

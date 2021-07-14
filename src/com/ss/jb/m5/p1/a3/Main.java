package com.ss.jb.m5.p1.a3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		FuncImp obj = new FuncImp();
		List<String> strings = Arrays.asList("Aaa", "aaa", "ccc", "abcd", "ee", "abb");
		
		List<String> stringsListFiltered = obj.filterStringList(strings);
		System.out.println("Original list: " + strings);
		System.out.println("Filtered list: " + stringsListFiltered);
	}
}

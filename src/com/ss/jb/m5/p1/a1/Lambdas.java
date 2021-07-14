package com.ss.jb.m5.p1.a1;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {
	
	public List<String> mapToUppercase(List<String> target) {
		List<String> result = target.stream().map(item -> item.toUpperCase()).collect(Collectors.toList());
		return result;
	}
	
	public void sortByLengthAsc(List<String> target) {
		Collections.sort(target, (str1, str2) -> (str1.length() - str2.length()));
	}
	
	public void sortByLengthDesc(List<String> target) {
		Collections.sort(target, (str1, str2) -> (str2.length() - str1.length()));
	}
	
	public void sortByAlphaFirstChar(List<String> target) {
		Collections.sort(target, (str1, str2) -> (str1.charAt(0) - str2.charAt(0)));
	}
	
	public void sortByStringContainingE(List<String> target) {
		Collections.sort(target, (str1, str2) -> {
			if(str1.contains("e") && !str2.contains("e")) {
				return -1;
			} else if(str2.contains("e") && !str1.contains("e")) {
				return 1;
			} else {
				return 0;
			}
		});
	}
	
	public static int staticSortByStringContainingE(String str1, String str2) {
		if(str1.contains("e") && !str2.contains("e")) {
			return -1;
		} else if(str2.contains("e") && !str1.contains("e")) {
			return 1;
		} else {
			return 0;
		}
	}
}

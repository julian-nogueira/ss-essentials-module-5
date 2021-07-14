package com.ss.jb.m5.p1.a2;

import java.util.List;

public class FuncImp implements FuncInterface {

	public String buildString(List<Integer> target) {
		StringBuilder result = new StringBuilder();
		target.stream().forEach(num -> {
			if(num % 2 == 0) {
				result.append('e'); // Even number if it divides by 2 without remainder.
			} else {
				result.append('o'); // Otherwise, odd.
			}
			result.append(num);
			result.append(',');
		});
		result.deleteCharAt(result.length() - 1); // Delete the trailing ',' in the string.
		return result.toString();
	}
}

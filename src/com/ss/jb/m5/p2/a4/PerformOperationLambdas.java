package com.ss.jb.m5.p2.a4;

import java.util.List;
import java.util.stream.Collectors;

public class PerformOperationLambdas {
	
	public List<String> stripFromStringX(List<String> list) {
		PerformOperation stripFromStringX = (stringList) -> {
			List<String> result = stringList.stream().map((string) -> {
				// Replace 'x' with ''.
				return string.replace("x", "");
			}).collect(Collectors.toList());
			return result;
		};
		return stripFromStringX.result(list);
	}
}

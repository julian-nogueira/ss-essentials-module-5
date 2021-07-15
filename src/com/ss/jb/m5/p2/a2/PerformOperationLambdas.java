package com.ss.jb.m5.p2.a2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PerformOperationLambdas {
	
	public List<Integer> getRightMostDigits(List<Integer> list){
		PerformOperation getRightMostDigits = (integerList) -> {
			List<Integer> result = new ArrayList<Integer>();
			// The right most digit is obtained by getting the remainder after
			// dividing by 10.
			result = integerList.stream().map((integer) -> integer % 10).collect(Collectors.toList());
			return result;
		};
		return getRightMostDigits.result(list);
	}
}
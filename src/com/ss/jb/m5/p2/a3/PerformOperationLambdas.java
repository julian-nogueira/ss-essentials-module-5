package com.ss.jb.m5.p2.a3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PerformOperationLambdas {
	
	public List<Integer> multiplyByTwo(List<Integer> list){
		PerformOperation multiplyByTwo = (integerList) -> {
			List<Integer> result = new ArrayList<Integer>();
			result = integerList.stream().map((integer) -> integer * 2).collect(Collectors.toList());
			return result;
		};
		return multiplyByTwo.result(list);
	}
}

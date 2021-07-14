package com.ss.jb.m5.p1.a3;

import java.util.List;
import java.util.stream.Collectors;

public class FuncImp implements FuncInterface {
	
	public List<String> filterStringList(List<String> source){
		List<String> result = source.stream().filter(str -> {
			// Check if string starts with an 'a' and is of length 3.
			if(str.charAt(0) == 'a' && str.length() == 3) {
				return true;
			} else {
				return false;
			}
		}).collect(Collectors.toList());
		return result;
	}
}

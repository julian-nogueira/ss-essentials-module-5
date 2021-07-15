package com.ss.jb.m5.p2.a3tests;

import com.ss.jb.m5.p2.a3.PerformOperationLambdas;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class PerformOperationLambdasTest {
	
	PerformOperationLambdas obj = new PerformOperationLambdas();
	List<Integer> list = Arrays.asList(10, 20, 30, 40);
	List<Integer> listMultiplyByTwo = Arrays.asList(20, 40, 60, 80);

	@Test
	public void multiplyByTwo() {
		assertEquals(listMultiplyByTwo, obj.multiplyByTwo(list));
	}
}

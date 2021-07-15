package com.ss.jb.m5.p2.a2tests;

import com.ss.jb.m5.p2.a2.PerformOperationLambdas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class PerformOperationLambdasTest {

	PerformOperationLambdas obj = new PerformOperationLambdas();
	List<Integer> list = Arrays.asList(1, 22, 303, 4004);
	List<Integer> listRightMostDigits = Arrays.asList(1, 2, 3, 4);
	List<Integer> listNotRightMostDigits = Arrays.asList(1, 2, 3, 5);
	
	@Test
	public void getRightMostDigits() {
		//
		assertEquals(listRightMostDigits, obj.getRightMostDigits(list));
		assertNotEquals(listNotRightMostDigits, obj.getRightMostDigits(list));
	}
}

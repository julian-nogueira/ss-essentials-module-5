package com.ss.jb.m5.p2.a4tests;

import com.ss.jb.m5.p2.a4.PerformOperationLambdas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class PerformOperationLambdasTest {
	
	PerformOperationLambdas obj = new PerformOperationLambdas();
	List<String> list = Arrays.asList("xxjxx", "xaxxxxx", "v", "xxxxxxxxxxxa");
	List<String> listStripFromStringX = Arrays.asList("j", "a", "v", "a");
	List<String> listNotStripFromStringX = Arrays.asList("j", "a", "v", "x");

	@Test
	public void stripFromStringX() {
		assertEquals(listStripFromStringX, obj.stripFromStringX(list));
		assertNotEquals(listNotStripFromStringX, obj.stripFromStringX(list));
	}
}

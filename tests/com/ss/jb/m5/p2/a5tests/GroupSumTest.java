package com.ss.jb.m5.p2.a5tests;

import com.ss.jb.m5.p2.a5.GroupSum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class GroupSumTest {
	
	GroupSum obj = new GroupSum();
	List<Integer> list = Arrays.asList(1, 2, 4, 4, 8);
	List<Integer> listRecursive = Arrays.asList(1, 2, 4, 8);
	Integer targetTrue = 11;
	Integer targetFalse = 14;
	Integer targetRecursive = 15;

	@Test
	public void groupSum() {
		assertEquals(true, obj.groupSum(list, targetTrue));
		assertNotEquals(true, obj.groupSum(list, targetFalse));
		assertEquals(true, obj.groupSum(listRecursive, targetRecursive, 0));
	}
}

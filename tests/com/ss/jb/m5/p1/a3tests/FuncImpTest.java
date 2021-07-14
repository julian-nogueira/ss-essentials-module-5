package com.ss.jb.m5.p1.a3tests;

import com.ss.jb.m5.p1.a3.FuncImp;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FuncImpTest {
	
	FuncImp obj = new FuncImp();
	List<String> strings = Arrays.asList("ABC", "abc", "abcd");
	List<String> stringsListFilteredTrue = Arrays.asList("abc");
	List<String> stringsListFilteredFalse = Arrays.asList("ABC", "abc");

	@Test
	public void filterStringList() {
		assertEquals(stringsListFilteredTrue, obj.filterStringList(strings));
		assertNotEquals(stringsListFilteredFalse, obj.filterStringList(strings));
	}
}

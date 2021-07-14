package com.ss.jb.m5.p1.a2tests;

import com.ss.jb.m5.p1.a2.FuncImp;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FuncImpTest {
	
	FuncImp obj = new FuncImp();
	List<Integer> numbers = Arrays.asList(1, 100, 2, 200);
	String stringNumbersEvenOddTrue = "o1,e100,e2,e200";
	String stringNumbersEvenOddFalse = "o1,o100,e2,e200";

	@Test
	public void buildString() {
		assertEquals(stringNumbersEvenOddTrue, obj.buildString(numbers));
		assertNotEquals(stringNumbersEvenOddFalse, obj.buildString(numbers));
	}
}

package com.ss.jb.m5.p1.a1tests;

import com.ss.jb.m5.p1.a1.Lambdas;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LambdasTest {
	
	Lambdas lambdas = new Lambdas();
	
	List<String> arr = Arrays.asList("Smoothstack", "Essentials", "Module 5");
	List<String> arrMapToUppercase = Arrays.asList("SMOOTHSTACK", "ESSENTIALS", "MODULE 5");
	List<String> arrSortByLengthAsc = Arrays.asList("Module 5", "Essentials", "Smoothstack");
	List<String> arrSortByLengthDesc = Arrays.asList("Smoothstack", "Essentials", "Module 5");
	List<String> arrSortByAlphaFirstChar = Arrays.asList("Essentials", "Module 5", "Smoothstack");
	List<String> arrSortByStringContainingE = Arrays.asList("Essentials", "Module 5", "Smoothstack");
	List<String> arrStaticSortByStringContainingE = Arrays.asList("Essentials", "Module 5", "Smoothstack");

	@Test
	public void mapToUppercase() {
		assertEquals(arrMapToUppercase, lambdas.mapToUppercase(arr));
	}
	
	@Test
	public void sortByLengthAsc() {
		lambdas.sortByLengthAsc(arr);
		assertTrue(arr.equals(arrSortByLengthAsc));
	}
	
	@Test
	public void sortByLengthDesc() {
		lambdas.sortByLengthDesc(arr);
		assertTrue(arr.equals(arrSortByLengthDesc));
	}

	@Test
	public void sortByAlphaFirstChar() {
		lambdas.sortByAlphaFirstChar(arr);
		assertTrue(arr.equals(arrSortByAlphaFirstChar));
	}
	
	@Test
	public void sortByStringContainingE() {
		lambdas.sortByStringContainingE(arr);
		assertTrue(arr.equals(arrSortByStringContainingE));
	}
	
	@Test
	public void staticSortByStringContainingE() {
		Collections.sort(arr, (str1, str2) -> Lambdas.staticSortByStringContainingE(str1, str2));
		assertTrue(arr.equals(arrStaticSortByStringContainingE));
	}
}

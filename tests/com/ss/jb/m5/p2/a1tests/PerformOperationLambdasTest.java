package com.ss.jb.m5.p2.a1tests;

import com.ss.jb.m5.p2.a1.PerformOperationLambdas;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PerformOperationLambdasTest {
	
	PerformOperationLambdas obj = new PerformOperationLambdas();
	Integer oddInteger = new Integer(3);
	Integer primeInteger = new Integer(5);
	Integer notPrimeInteger = new Integer(15);
	Integer palindromeInteger = new Integer(808);
	Integer notPalindromeInteger = new Integer(1234);

	@Test
	public void isOdd() {
		assertEquals("ODD", obj.isOdd(oddInteger));
	}
	
	@Test
	public void isPrime() {
		assertEquals("PRIME", obj.isPrime(primeInteger));
		assertNotEquals("PRIME", obj.isPrime(notPrimeInteger));
	}
	
	@Test
	public void isPalindrome() {
		assertEquals("PALINDROME", obj.isPalindrome(palindromeInteger));
		assertNotEquals("PALINDROME", obj.isPalindrome(notPalindromeInteger));
	}
}

package com.ss.jb.m5.p2.a1;

public class PerformOperationLambdas {
	
	public String isOdd(int number) {
		PerformOperation isOdd = (num) -> {
			if(num % 2 == 0) {
				return "EVEN";
			} else {
				return "ODD";
			}
		};
		return isOdd.result(number);
	}
	
	public String isPrime(int number) {
		PerformOperation isPrime = (num) -> {
			// Negative numbers and zero are neither prime nor composite.
			if(num < 0) {
				return "NEGATIVE NUMBER";
			} else if (num == 0) {
				return "ZERO";
			} else if(num == 1) {
				return "PRIME";
			} else {
				for(int i = 2; i < num; i++) {
					// If the passed number is divisible by any number greater
					// than 1 and less than the number itself, it is composite.
					if(num % i == 0) {
						return "COMPOSITE";
					}
				}
				// Otherwise, it is prime.
				return "PRIME";
			}
		};
		return isPrime.result(number);
	}
	
	public String isPalindrome(int number) {
		PerformOperation isPalindrome = (num) -> {
			if(num < 0) {
				return "NEGATIVE NUMBER";
			} else {
				String numString = String.valueOf(num);
				for(int i = 0; i < numString.length(); i++) {
					if(numString.charAt(i) != numString.charAt(numString.length() - 1 - i)) {
						return "NOT PALINDROME";
					}
				}
				return "PALINDROME";
			}
		};
		return isPalindrome.result(number);
	}
	
	public void performOperations(String input) {
		PerformOperationLambdas obj = new PerformOperationLambdas();
		String[] lines = input.split("\n");
		String[] line;
		Integer numberOfTestCases = Integer.parseInt(lines[0]);
		Integer condition;
		Integer number;
		System.out.println("\n Number         Result");
		System.out.println("-------------------------------");
		for(int i = 1; i < numberOfTestCases + 1; i++) {
			// Each line will contain two numbers separated by a space. The
			// first number represents the test condition. The second is
			// the number itself.
			line = lines[i].split(" ");
			condition = Integer.parseInt(line[0]);
			number = Integer.parseInt(line[1]);
			if(condition == 1) {
				// isOdd.
				System.out.printf(" %-10s  :  %s\n", number, obj.isOdd(number));
			} else if(condition == 2) {
				// isPrime.
				System.out.printf(" %-10s  :  %s\n", number, obj.isPrime(number));
			} else {
				// isPalindrome.
				System.out.printf(" %-10s  :  %s\n", number, obj.isPalindrome(number));
			}
		}
	}
}

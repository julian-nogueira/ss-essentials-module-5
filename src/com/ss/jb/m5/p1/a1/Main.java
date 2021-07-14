package com.ss.jb.m5.p1.a1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Lambdas lambdas = new Lambdas();
		
		List<String> islands = Arrays.asList("Ni'ihau", "Kauai", "O'ahu", "Moloka'i", "Lanai", "Maui", "Kaho'olawe", "Big Island");
		
		// Sort by length in ascending order.
		lambdas.sortByLengthAsc(islands);
		System.out.println("\nSort by length in ascending order:");
		islands.forEach(island -> System.out.println(island));

		// Sort by length in descending order.
		lambdas.sortByLengthDesc(islands);
		System.out.println("\nSort by length in descending order:");
		islands.forEach(island -> System.out.println(island));
		
		// Sort alphabetically by the first character only.
		lambdas.sortByAlphaFirstChar(islands);
		System.out.println("\nSort by alpha first letter in ascending order:");
		islands.forEach(island -> System.out.println(island));
		
		// Sort by strings with an 'e' char first.
		lambdas.sortByStringContainingE(islands);
		System.out.println("\nSort by string contains 'e' in ascending order:");
		islands.forEach(island -> System.out.println(island));
		
		// Sort by strings with an 'e' char first.
		Collections.sort(islands, (str1, str2) -> (Lambdas.staticSortByStringContainingE(str1, str2)));
		System.out.println("\nSort by string contains 'e' in ascending order, using static helper function:");
		islands.forEach(island -> System.out.println(island));
	}
}

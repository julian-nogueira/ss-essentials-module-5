package com.ss.jb.m5.p1.dt;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		DateTime obj = new DateTime();
		Integer year = new Integer(2020);
		Integer month = new Integer(9);
		LocalDate date = LocalDate.of(2021, 8, 13);
		Boolean isFridayTheThirteenth;
		
		// Get the lengths of months for the given year in an array.
		Integer[] lengthsOfMonths = obj.getLengthsOfMonths(year);

		// Print the lengths of months for the given year formatted.
		obj.printLengthsOfMonths(lengthsOfMonths, year);
		System.out.println("\n");
		
		// Print all the Mondays in a given month of the current year.
		System.out.println("All Mondays in " + LocalDate.of(LocalDate.now().getYear(), month, 1).getMonth() + " " + LocalDate.now().getYear() + ":");
		obj.getMondaysInMonthOfCurrentYear(month);
		System.out.println("\n");
		
		// Check if a given date occurs on Friday the 13th.
		isFridayTheThirteenth = obj.checkIfDateOccursOnFridayTheThirteenth(date);
		System.out.println(date + " occurs on Friday the 13th: " + isFridayTheThirteenth.toString());
		System.out.println("\n");
	}
}

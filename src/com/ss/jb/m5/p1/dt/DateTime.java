package com.ss.jb.m5.p1.dt;

import java.time.DateTimeException;
import java.time.LocalDate;

public class DateTime {

	// Get the length of each month in a given year.
	public Integer[] getLengthsOfMonths(Integer year) {
		Integer[] result = new Integer[12];
		try {
			for(int i = 0; i < 12; i++) {
				result[i] = LocalDate.of(year, i + 1, 1).lengthOfMonth();
			}
		} catch(DateTimeException e) {
			//
		}
		return result;
	}

	// Print the length of each month in the given year with a readable format.
	public void printLengthsOfMonths(Integer[] lengthsOfMonths, Integer year) {
		try {
			System.out.println("Month/Year    Days");
			System.out.println("------------------");
			for(int month = 1; month < 13; month++) {
				String result = String.format("%2s/%4s    :   %2s", month, year, lengthsOfMonths[month - 1]);
				System.out.println(result);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			//
		}
	}

	public void getMondaysInMonthOfCurrentYear(Integer month) {
		try {
			Integer year = LocalDate.now().getYear();
			Integer day = new Integer(1);
			Integer weekday = LocalDate.of(year, month, day).getDayOfWeek().getValue();
			Integer daysInMonth = LocalDate.of(year, month, day).lengthOfMonth();
	
			// Loop through as many days there are in the month. Check if each
			// weekday is a Monday. If so, print the date.
			for(day = 1; day < daysInMonth + 1; day++) {
				LocalDate currentDate = LocalDate.of(year, month, day);
				weekday = currentDate.getDayOfWeek().getValue();
				if(weekday == 1) {
					System.out.println(currentDate);
				}
			}
		} catch(DateTimeException e) {
			//
		}
	}

	public boolean checkIfDateOccursOnFridayTheThirteenth(LocalDate date) {
		Boolean result = false;
		try {
			Integer day = date.getDayOfMonth();
			Integer weekDay = date.getDayOfWeek().getValue();
			// Weekday 5 represents a Friday. Therefore, if the day number is
			// 13 and the weekday number is 5, the date is a Friday the
			// thirteenth. Return true.
			if(day == 13 && weekDay == 5) {
				result = true;
			}
		} catch(DateTimeException e) {
			//
		}
		return result;
	}
}

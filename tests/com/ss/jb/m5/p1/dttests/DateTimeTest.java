package com.ss.jb.m5.p1.dttests;

import com.ss.jb.m5.p1.dt.DateTime;
import java.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class DateTimeTest {
	
	DateTime obj = new DateTime();
	LocalDate date = LocalDate.of(2021, 8, 13);
	Integer currentYear = new Integer(2021);
	Integer july = new Integer(7);
	Integer[] lengthsOfMonthsInCurrentYear = {
			31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};
	String mondaysInJulyOfCurrentYear = "2021-07-05\n2021-07-12\n2021-07-19\n2021-07-26";
	Boolean dateOccursOnFridayTheThirteenth = new Boolean(true);

	@Test
	public void getLengthsOfMonths() {
		assertArrayEquals(lengthsOfMonthsInCurrentYear, obj.getLengthsOfMonths(currentYear));
	}

	@Test
	public void checkIfDateOccursOnFridayTheThirteenth() {
		assertEquals(dateOccursOnFridayTheThirteenth, obj.checkIfDateOccursOnFridayTheThirteenth(date));
	}
}

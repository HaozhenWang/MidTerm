package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;


public class Staff_Test {
	static ArrayList<Staff> staff = new ArrayList<Staff>(5);
	public static Date date(int year, int month, int day) {
		Calendar date = Calendar.getInstance();
		date.set(year, month, day);
		return date.getTime();
		}
	private static Staff stundet1,stundet2,stundet3,stundet4,stundet5;
	
	@BeforeClass
	public static void setup() throws PersonException {
		stundet1= new Staff("Lucy", "Lotte", "New", date(1994,06,24),"108 E Main St, Newark, DE",
				"(302) 302-1111", "UD1@udel.edu","1 to 2", 1, 1000, date(2016,01,02), eTitle.MRS );
		stundet2= new Staff("Luck", "Lotta", "New", date(1995,06,24), "109 E Main St, Newark, DE",
				"(302) 302-2222", "UD2@udel.edu","2 to 3", 2, 2000, date(2016,01,02), eTitle.MRS );
		stundet3= new Staff("Lucky", "Lot", "New", date(1996,06,24), "110 E Main St, Newark, DE", 
				"(302) 302-3333", "UD3@udel.edu","3 to 2", 3, 3000, date(2016,01,02), eTitle.MR );
		stundet4= new Staff("Luk", "Lot", "New", date(1997,06,24), "111 E Main St, Newark, DE",
				"(302) 302-4444", "UD4@udel.edu","2 to 1", 4, 4000, date(2016,01,02), eTitle.MR );
		stundet5= new Staff("Luky", "Lot", "New", date(1998,06,24), "112 E Main St, Newark, DE",
				"(302) 302-5555", "UD5@udel.edu","1 to 2", 5, 5000, date(2016,01,02), eTitle.MR );
	
		 staff.addAll(Arrays.asList(stundet1,stundet2,stundet3,stundet4,stundet5));
		}
	

	@Test
	public void testAverageSalary() {
		double sum = 0.0;
		int count = 0;
		for (Staff s : staff) {
			count++;
			sum += s.getSalary();
			}
		assertEquals(sum / (double) count, 3000.0, 0.001);
		}
	@Test
	public void phoneNumberExceptionTest() throws PersonException {
		Staff s = new Staff("Luky", "Lot", "New", date(1998,06,24), "", "123-4567", "", "",
							0, 0, date(2016,01,02), eTitle.MR);
	}
	@Test
	public void dobExceptionTest() throws PersonException {
		Staff s = new Staff("Lucky", "Lot", "New", date(1997, 06, 24), "112 E Main St, Newark, DE", "(302) 302-5555",
				"UD5@udel.edu", "1 to 2", 5, 5000, date(2016, 01, 02), eTitle.MR);
	}
	}	


package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	private static ArrayList<Course>course = new ArrayList<Course>(3);
	private static ArrayList<Semester>semester = new ArrayList<Semester>(2);
	private static ArrayList<Section>sections = new ArrayList<Section>(2);
	private static ArrayList<Student>students = new ArrayList<Student>(10);
	private static ArrayList<Enrollment>enrollment = new ArrayList<Enrollment>(2);
	private static Student stundent1,stundent2,stundent3,stundent4,stundent5,stundent6,stundent7,stundent8,stundent9,stundent10;
	
	public static Date date(int year, int month, int day) {
		Calendar date = Calendar.getInstance();
		date.set(year, month, day);
		return date.getTime();
		}

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}
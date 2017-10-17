package com.cisc181.core;
import java.util.UUID;

public class Course {
	
	private UUID CourseID;
	private String CourseName;
	private int gradePoints;
	
	public UUID getCourseID() {
		return CourseID;
		}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
		}
	public String getCourseName() {
		return CourseName;
		}
	public void setCourseName(String courseName) {
		CourseName = courseName;
		}
	public int getGradePoints() {
		return gradePoints;
		}
	public void setGradePoints(int gradePoints) {
		gradePoints = gradePoints;
		}
	public Course(UUID CourseID,String CourseName, int gradepoints){
		this.CourseName = CourseName;
		this.gradePoints = gradePoints;
		this.CourseID = CourseID;
		}
	
	
}

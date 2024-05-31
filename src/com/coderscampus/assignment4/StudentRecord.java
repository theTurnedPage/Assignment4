package com.coderscampus.assignment4;

public class StudentRecord implements Comparable<StudentRecord>{
	//This class isn't really used yet until I figure out processing the arrays
	private String studentName;
	private String studentId;
	private String studentCourse;
	private Integer studentGrade;
	
	//constructor
	public StudentRecord(String studentName, String studentId, String studentCourse, Integer studentGrade) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentCourse = studentCourse;
		this.studentGrade = studentGrade;
	}
	

	//getters and setters
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public Integer getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(Integer studentGrade) {
		this.studentGrade = studentGrade;
	}

	@Override
	public int compareTo(StudentRecord that) {

		if(this.studentGrade.compareTo(that.studentGrade) == 0) {
			return that.studentName.compareTo(this.studentName);
		} else
		{//this to that is ascending order
			//that to this is descending order
			return that.studentGrade.compareTo(this.studentGrade);							
		}				
	}	
}

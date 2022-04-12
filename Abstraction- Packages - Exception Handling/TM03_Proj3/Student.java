package com.mile1.bean;

public class Student {
	String name,grade;
	int marks[];
	public  Student()
	{
		
	}
	public Student(String name,int marks[])
	{
		this.marks = marks;
		this.name  = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String getGrade()
	{
		return grade;
	}
}

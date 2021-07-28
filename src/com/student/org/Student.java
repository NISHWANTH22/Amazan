package com.student.org;

public class Student {// Class Name

	
	
	
	
	public void studentName() {// Method Name
		System.out.println("Student name is Arun");
	}

	public void studentId() {
		System.out.println("Student id is 22");
	}

	public static void main(String[] args) {//Main Method
		// className objectName = new className();
		Student s = new Student();
		s.studentName();
		s.studentId();

	}
}

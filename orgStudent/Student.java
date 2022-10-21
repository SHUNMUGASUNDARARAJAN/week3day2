package orgStudent;

import orgDepartment.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Shunmuga");
		
	}
	public void studentDept() {
		System.out.println("Non IT-IT");
		
	}
	public void studentId() {
		System.out.println("710");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		System.out.println("college details");
		
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		System.out.println("Department details");
		s.departmentName();
		System.out.println("Student details");
		s.studentName();
		s.studentDept();
		s.studentId();
		
		
		
		
	}

}

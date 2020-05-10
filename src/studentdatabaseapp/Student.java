package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String fname;
	private String lname;
	private String studentId;
	private String courses = null;
	private int tuitionBalance = 0;
	private int grdyear;
	private static int costOfCourse =600;
	private static int id = 1000;
	
	//Constructor:propmt user to enter name and year of student
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student first name:" );
		this.fname = sc.nextLine();
		
		System.out.println("Enter student last name:" );
		this.lname = sc.nextLine();
		
		System.out.println("1 -Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student Class Level: " );
		this.grdyear = sc.nextInt();
		
		setStudentId();
		
		System.out.println(fname + " " + lname + " " + grdyear + " " + studentId);
		
		
		
		
	}
	//Generate an ID
	private void setStudentId() {
		//Grade level +Id 
		id++;
		this.studentId = grdyear + "" + id;
		
		
	}
	//Enroll in Courses
	public void enroll() {
		//Get inside a loop,user hits 0
		do{
			System.out.println("Enter course to enroll (Q to quit): ");
		
		Scanner sc = new Scanner(System.in);
		String course =sc.nextLine();
		if(!course.equals ("Q")) {
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else {
			System.out.println("BREAK!");
			break;
		}
		}
		while(1 !=0);
		
		System.out.println("ENROLLED IN:" +courses);
		System.out.println("TUITIONBALANCE:" +tuitionBalance);
	}
	
	//view balance
	public void viewBalance() {
		System.out.println("Your Balance is:" +tuitionBalance );
	}
	
	//pay tuition
	public void paytuition() {
	viewBalance();
		System.out.println("Enter ur payment: $");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for ur payment of $" +payment);
		viewBalance();
		
		
	}
	
	//show status
	public String showinfo() {
		return "NAME: " + fname + " " + lname + 
				"\nCourses Enrolled:" + courses + 
				"\nBalance: $" + tuitionBalance;
 	}

}

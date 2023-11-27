package com.nov10Day6FlowControlAssignment;

import java.util.Scanner;

public class GradeDeclaration2 {

	public void switchCase(int marks) {
		switch (marks/10) {
		case 10:
		case 9:System.out.println("Grade:A+");
		       break;
		case 8:System.out.println("Grade:A");
		       break;
		case 7:System.out.println("Grade:B+");
		        break;
		case 6:System.out.println("Grade:B");
		        break;
		case 5:System.out.println("Grade:C+");
		       break;
		case 4:System.out.println("Grade:C");
	           break;
		case 3:System.out.println("Grade:D");
	            break;
		case 2:
		case 1:System.out.println("Fail");
	       break;
	       default:System.out.println("Invalid,enter munber between 0-100");
                   break;
		
		}

	}

	public void ifElseCase(int marks) {
		if (marks >= 90 && marks <= 100) {
			System.out.println("Grade:A+");
		}
		else if (marks >= 80 && marks <= 89) {
			System.out.println("Grade:A");
		}
		  else if (marks >= 70 && marks <= 79) {
			System.out.println("Grade:B+");
		}
		  else if (marks >= 60 && marks <= 69) {
			System.out.println("Grade:B+");
		}
		  else if (marks >= 50 && marks <= 69) {
			System.out.println("Grade:C+");
		}
		  else if (marks >= 40 && marks <= 49) {
			System.out.println("Grade:C+");
		}
		  else if (marks >= 30 && marks <= 39) {
			System.out.println("Grade:D");
		}
		  else if (marks <= 30) {
			System.out.println("Fail");
		}
		  else
		  {
			  System.out.println("Invalid,enter munber between 0-100");
		  }
	}

	public static void main(String[] args) {
		GradeDeclaration2 declaration2 = new GradeDeclaration2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Scored Marks");
		int marks = scanner.nextInt();
		//declaration2.switchCase(marks);
		declaration2.ifElseCase(marks);
	}

}

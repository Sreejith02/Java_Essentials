/*
  Day-1
  Question-2
        
      Define a class Student with following members:

int roll, String name, float marks.

input() to take input of the details

display() to all details of a student.


Write a program to which will store details of a student and print the details using the above class.  


*/

import java.util.Scanner;

class Main {

	int roll;
	String name; 
	float marks;

  
public static void main(String[] args) 
 {
  
  Main sd = new Main();
		
	    sd.input();
	    sd.display();
 }
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		

    System.out.println("Enter roll No :");
		 roll = sc.nextInt();

		System.out.println("Enter Your Name");
		 name = sc.next();
		
		System.out.println("Enter Your Marks :");
		 marks =sc.nextFloat();
		
	}
	
	void display()
	{
		System.out.println( "Roll No  is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
		
	}

}

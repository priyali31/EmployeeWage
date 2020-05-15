package com.employeewage.test;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
import com.employeewage.model.Employee;
import com.employeewage.service.EmployeeComputation;

class tester
{

	public static int wageList()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1...Today's payment");
		System.out.println("2...Payment of whole month...");
		System.out.println("3...Employee worked as full time or part time..");
		System.out.println("4..Employee was Present OR Absent..");
		System.out.println("5...Exit..");
		System.out.println("Choice : ");
		int choice = sc.nextInt();
		System.out.println();
		return choice;	
	}

	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		Random rand=new Random();
		EmployeeComputation ec=new EmployeeComputation();
		Employee emp=new Employee(20,rand.nextInt(10),8);

		while(true)
		{
		          int option = wageList();
		   	   switch(option)
			   {
				case 1:
				System.out.println("Today's Payment is" + ec.calPayment(emp));
				break;
				case 2:	
				System.out.println("Payment of whle month is " + ec.monthwiseCalculatePayment(emp));
				break;
				case 3:
				System.out.println("Employee  was " + emp.getEmployeeWas());
				break;
				case 4:
				if(ec.isPresent(emp))
				{
				System.out.println("Present");
			  	}
				else
				{
			 	System.out.println("Absent");
				}
				break;
				case 5:
				System.exit(0);
				break;
		       	   }
		}
	}

}

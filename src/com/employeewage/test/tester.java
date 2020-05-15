package com.employeewage.test;
import java.util.Scanner;
import java.io.*;
import java.util.Random;
import com.employeewage.model.*;
import com.employeewage.service.*;

class tester
{

	public static int wageList()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1...Today's payment..");
		System.out.println("2...Payment of whole month...");
		System.out.println("3...Employee worked as full time or part time..");
		System.out.println("4..Employee was Present OR Absent..");
		System.out.println("5...Exit..");
		System.out.println("Choice : ");
		int choice = sc.nextInt();
		System.out.println();
		return choice;	
	}
	public static void addCompany( EmployeeWageCompute computer)
	{
		if(computer !=null)
		Scanner sc = new Scanner(System.in);
		System.out.print("+CompanyName : ");
		String cmpName = sc.next();
		System.out.print("+Wage Per Hour : ");
		int rate = sc.nextInt();
		System.out.print("+No of Working Days Month : ");
		int nowkDays = sc.nextInt();
		System.out.print("+Max Hour per Month : ");
		int maxhr = sc.nextInt();
		computer.addCompanyWithEmployees(cmpName, rate , nowkDays, maxhr);
	}

	public static void main(String[] args)
	{
		System.out.println("Computation Program");
		Random rand=new Random();
		EmployeeComputation ec=new EmployeeComputation();
		ec.addCompanywithEmployees("Barclays",50,70,200);

		while(true)
		{
		          int option = wageList();
		   	  switch(option)
			   {
			    case 1:
			    System.out.print("CompanyName is ");
			    String cmpName = sc.next();
               		    System.out.print("Hourly wage ");
			    int rate = sc.nextInt();
			    System.out.print("Working Days Month is ");
			    int nowkDays = sc.nextInt();
			    System.out.print("Maximum Hour per Month is ");
			    int maxhr = sc.nextInt();
			    computer.addCompanyWithEmployees(cmpName, rate , nowkDays, maxhr);
			    break;
			    case 2:
			    System.out.print("CompanyName : ");
			    String cmpNamecase2 = sc.next();
			    System.out.println("Total Emp Wage for "+ cmpNamecase2 +":"+ computer.getTotalCompanyEmpWage(cmpNamecase2));
			    break;
			    case 3:
			    computer.prinAllDetails();
			    break;
			    case 4:
			    System.out.print("CompanyName is ");
               		    String cmpNamecase3 = sc.next();
			    System.out.println("Employee worked as " + computer.getEmployeeWas(new Employee("person 1", cmpNamecase3 , new ArrayList<Integer>())));
			    break;
			    case 5:
			    System.out.println(ec.isPresent(emp)?"Present":"Absent");
			    break;
			    case 6:
			    System.exit(0);
			    break;
		       	   }
		}
	}

}

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

	public static void main(String[] args)
	{
		System.out.println("Computation Program");
		Random rand=new Random();
		EmployeeComputation ec=new EmployeeComputation();
		ec.addCompanywithEmployees("Barclays",50,70,200);

		/*while(true)
		{
		          int option = wageList();
		   	  switch(option)
			   {
			    case 1:
		   	    System.out.println("Todays Payment is "+ec.calPayment(emp));
			    break;
		       	    case 2:
			    System.out.println("whole Month Payment is" + ec.monthwiseCalculatePayment(emp));
		            break;
	     		    case 3:
	          	    System.out.println("Wages till condition " + ec.hundredCalPayment(emp));
           		    break;
			    case 4:
            		    System.out.println("Employee worked as" + ec.getEmployeeWas(emp));
			    break;
			    case 5:
			    System.out.println(ec.isPresent(emp)?"Present":"Absent");
			    break;
			    case 6:
			    System.exit(0);
			    break;
		       	   }
		}*/
	}

}

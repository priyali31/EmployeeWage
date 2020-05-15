import java.util.Random;
import java.io.*;
import java.util.Scanner;
class EmployeeComputation
{
	private String employeeWas;
	private int perHour,workHour,dayHour,payment;
	public static Random rand=new Random();
	public static Scanner sc=new Scanner(System.in);

	EmployeeComputation(int perHour,int workHour,int dayHour)
	{
		this.setEmployeeWas("full time");
		this.perHour=perHour;
		this.workHour=workHour;
		this.dayHour=dayHour;
		this.calPayment();
	}

	public String getEmployeeWas()
	{
		return this.employeeWas;
	}

	public void setEmployeeWas(String employeeWas)
	{
		this.employeeWas=employeeWas;
	}

	public int getPerHour()
	{
		return this.perHour;
	}

	public void setPerHour(int wage)
	{
		this.perHour=wage;
	}

	public int calPayment()
	{
		if(this.workHour<this.dayHour)
		{
		this.setEmployeeWas("Part time");
		}
		this.payment=this.perHour*this.workHour;
		return this.payment;
	}

	public boolean isPresent()
	{
		if(this.workHour<1)
		{
		return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
	System.out.println(" ......................Computation Program..................");
	EmployeeComputation appObj=new EmployeeComputation(20,rand.nextInt(10),8);

		 while(true)
		   {
		  	System.out.println("1...Payment ..");
			System.out.println("2...Employee Was..");
			System.out.println("3...Present OR Absent..");
			System.out.println("4...Exit..");
			System.out.println("Choice : ");
			int choice = sc.nextInt();
			System.out.println();

			switch(choice)
			{
				case 1:
				System.out.println("Payment is " + appObj.calPayment());
				break;
				case 2:
				System.out.println("Employee was  " + appObj.getEmployeeWas());
				break;
				case 3:
				if(appObj.isPresent())
				{
				System.out.println("Present");
				}
				else
				{
				System.out.println("Absent");
				}
				break;
				case 4:
				System.exit(0);
				break;
				default:
				System.out.println("Wrong input");
				break;
			}

		}
	}
}

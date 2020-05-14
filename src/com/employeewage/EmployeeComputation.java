import java.util.Random;
import java.io.*;
class EmployeeComputation
{
	
	private int perHour,workHour,dayHour,payment;
	private String employeeWas;
	public static Random rand=new Random();

	EmployeeComputation(int perHour, int workHour, int dayHour)
	{	
		this.perHour=perHour;
		this.workHour=workHour;
		this.dayHour=dayHour;
		this.setEmployeeWas("full time");
	}
	
	public String getEmployeeWas()
	{
		return this.employeeWas;
	}
	public void setEmployeeWas(String employeeWas)
	{
		this.employeeWas=employeeWas;
	}
	public int getperHour()
	{
		return this.perHour;
	}
	public void setperHour(int wage)
	{
		this.perHour=wage;
	}
	public static boolean isPresent()
	{
		int random=rand.nextInt(50)%2;
		return random==1?true:false; 
	}

	public int calPayment()
	{
		if(this.workHour<this.dayHour)
		{
			this.setEmployeeWas("part time");
		}
		
		this.payment=this.perHour*this.workHour;
		return this.payment;
	}

	public static void main(String[] args)
	{
		EmployeeComputation appObj=new EmployeeComputation(20,rand.nextInt(10),8);
		System.out.println("Payment is "+appObj.calPayment());
		System.out.println("Employee was "+appObj.getEmployeeWas());
		System.out.println("Computation Program");
			if(isPresent())
			{
			System.out.println("Employee is Present");
			}
			else
			{
			System.out.println("Employee is Absent");
			}
	}
}

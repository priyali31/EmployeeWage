package com.employeewage.model;

public class Employee
{
	private String employeeWas;
	private int perHour,workHour,dayHour,payment;

	public Employee(int perHour, int workHour, int dayHour)
	{
		this.perHour=perHour;
		this.workHour=workHour;
		this.dayHour=dayHour;
	}

	public String getEmployeeWas()
	{
		return this.employeeWas;
	}

	public void setEmployeeWas(String EmployeeWas)
	{
		this.employeeWas=employeeWas;
	}

	public int getPerHour()
	{
		return this.perHour;
	}

	public void setPerHour(int perHour)
	{
		this.perHour=perHour;
	}

	public int getWorkHour()
	{
		return this.workHour;
	}

	public void setWorkHour(int workHour)
	{
		this.workHour = workHour;
	}

	public int getDayHour()
	{
		return this.dayHour;
	}

	public void setDayHour(int dayHour)
	{
		this.dayHour=dayHour;
	}

	public int getPayment()
	{
		return this.payment;
	}

	public void setPayment(int payment)
	{
		this.payment=payment;
	}

	@Override
	public String toString()
	{
		return "Employee is  " + this.employeeWas + "Wage per hour is" + this.perHour + "Working Hour is " + this.workHour +" Whole day hour record :" + this.dayHour + "Total Payment delivered " + this.payment ;
	}
}

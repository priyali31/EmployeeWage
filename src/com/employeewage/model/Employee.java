package com.employeewage.model; 
import java.util.ArrayList; 
import java.util.List;

public class Employee
{
	private String employeeWas,companyName;
	private int payment;
	private List<Integer> dw;

	public Employee(ArrayList<Integer> dw)
	{
		this.dw=dw;
	}

	public String getEmployeeWas()
	{
		return this.employeeWas;
	}

	public void setEmployeeWas(String EmployeeWas)
	{
		this.employeeWas=employeeWas;
	}

	public void setCompanyName(String companyName)
	{
		this.companyName=companyName;
	}

	public int getPayment()
	{
		return this.payment;
	}

	public void setPayment(int payment)
	{
		this.payment=payment;
	}

	public List<Integer> getDw()
	{
		return dw;
	}

	public void setDw(List<Integer> dw)
	 {
		this.dw=dw;
	}
	@Override
	public String toString()
	{
		return "Employee is  " + this.employeeWas + "Overall Payment of Employee " + this.payment;
	}
}

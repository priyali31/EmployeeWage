package com.employeewage.service;
import com.employeewage.model.*;
import com.employeewage.service.*;
import java.util.*;
import java.io.*;

public class EmployeeComputation implements EmployeeComputationService
{
	private static final int perHour=20;
	private static final int dayHour=8;

	@Override
	public boolean isPresent(Employee emp)
	{
		if(emp.getWorkHour()<1)
		{
		return false;
		}
		return true;
	}

	@Override
	public int calculatePayment(Employee emp)
	{
		emp.setPayment(0);
		emp.setPay(perHour*emp.getWorkHour());
		return emp.getPayment();
	}

	@Override
	public String getEmployeeWas(Employee emp)
	{
		if((emp.getWorkHour()/20)<dayHour)
		{
		emp.setEmployeeWas("Employee was part time");
		}
		else
		{
		emp.setEmployeeWas("Employee was Full time");
		}
		return emp.getEmployeeWas();		
	}

	@Override
	public int monthwiseCalculatePayment(Employee emp)
	{
		Random rand= new Random();
		emp.setPayment(0);
		emp.setWorkHour(0);
		for(int i=0;i<20;i++)
		{
		emp.setWorkHour(emp.getWorkHour()+rand.nextInt(10));
		}
		emp.setPay(perHour*emp.getWorkHour());
		return emp.getPayment();
	}

	@Override
	public int hundredCalPayment(Employee emp)
	{
		Random rand= new Random();
		emp.setPay(0);
		emp.setWorkHour(0);
		while(emp.getWorkHour()<=100)
		{
		emp.setWorkHour(emp.getWorkHour()+rand.nextInt(10));
		}
		emp.setPay(perHour*emp.getWorkHour());
		return emp.getPayment();
	}

}

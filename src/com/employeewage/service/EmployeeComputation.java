package com.employeewage.service;
import com.employeewage.model.Employee;
import java.util.Random;
import java.io.*;

public class EmployeeComputation
{
        public boolean isPresent(Employee emp)
	{
                if(emp.getWorkHour()<1)
		{
                        return false;
                }
                return true;
        }
	public int calPayment(Employee emp)
	{
		emp.setPayment(0);
		emp.setPayment(emp.getPerHour()*emp.getWorkHour());
		return emp.getPayment();
	}

        public String getEmployeeWas(Employee emp)
	{
                if((emp.getWorkHour()/20)<emp.getDayHour())
		{
                 emp.setEmployeeWas("worked as part time");
                }
                else
		{
                 emp.setEmployeeWas("worked as full time");
                }
		return emp.getEmployeeWas();
        }

        public int monthwiseCalculatePayment(Employee emp)
	{
                Random rand=new Random();
                for(int i=0;i<20;i++)
		{
                        emp.setWorkHour(rand.nextInt(10));
                        emp.setPayment(emp.getPayment() + (emp.getPerHour() * emp.getWorkHour()));
                }
                return emp.getPayment();
	}
	public int hundredCalPayment(Employee emp)
	{
		Random rand=new Random();
		emp.setPayment(0);
		emp.setWorkHour(0);
		while(emp.getWorkHour()<=100)
		{
			emp.setWorkHour(emp.getWorkHour()+rand.nextInt(9));
		}

		emp.setPayment(emp.getPerHour()*emp.getWorkHour());
		return emp.getPayment();
	}
}


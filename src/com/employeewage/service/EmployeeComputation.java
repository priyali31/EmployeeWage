package com.employeewage.service;
import com.employeewage.model.Employee;
import java.util.Random;
import java.io.*;

public class EmployeeComputation
{


        public boolean isPresent(Employee emp)
	{
                if(emp.getWorkHour() < 1)
		{
                        return false;
                }
                return true;
        }

        public int calPayment(Employee emp)
	{
                if(emp.getWorkHour()<emp.getDayHour())
		{
                 emp.setEmployeeWas("worked as part time");
                }
                else
		{
                 emp.setEmployeeWas("worked as full time");
                }
                emp.setPayment(emp.getPerHour()*emp.getWorkHour());
                return emp.getPayment();
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

}


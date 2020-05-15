package com.employeewage.service;
import java.util.*;
import com.employeewage.model.*;
import com.employeewage.service.*;

public class EmployeeComputation implements EmployeeComputationService
{

	private List<Company> companyList;
	/*private static final int dailyWagePerHour = 20;
	private static final int fullDayHour = 8;*/

	@Override
	public boolean isPresent(Employee emp){
		int random=new Random().nextInt(100)%2;
		return random==1?true:false;
	}

	public int randomWorkHours(String companyName)
	{
		int dayHour=this.findCompany(companyName).getMaxHoursPerMonth();
		return new Random().nextInt(dayHour)%2;
	}

	public void addCompanyWithEmployees(String companyName,int ratePerHour,int workingDays,int maxHoursPerMonth)
	{
		Company cp=new Company(companyName,eatePerHour,workingDays,maxHoursPerMonth);
		cmp.setEmpList(Employee(companyName,workingDays));
		System.out.println("Company with employee");
	}

	public ArrayList<Employee> createDummyEmployee(String companyName, int WorkingDays)
	{
		ArrayList<Employee> empList = new ArrayList<>();
		Employee em=null;
		for(int i=0;i<10;i++)
			{
			em=new Employee("name is "+i, companyName,new ArrayList<Integer>());
			for(int j=0;j<workingDays;j++)
			{
				em.getDW().add(new Random().nextInt(10));
			}
			empList.add(em);
		}
		return empList;
	}

	public Company findCompany(String companyName)
	{
		for (Company company : companyList)
		{
			if(company.getCompanyName().equalsIgnoreCase(companyName))
				return company;
		}
		return null;
	}
/*
	@Override
	public int calculatePay(Employee emp){
		emp.setPay(0);
		emp.setPay(dailyWagePerHour * emp.getWorkHour());
		return emp.getPay();
	}
	@Override
	public String getTypeOfEmployee(Employee emp){
		if((emp.getWorkHour()/20) < fullDayHour){
			emp.setTypeEmployee("Part-Time");
		}
		else{
			emp.setTypeEmployee("Full-Time");
		}
		return emp.getTypeEmployee();
	}
	@Override
	public int monthlyCalculatePay(Employee emp){
		Random sysRand = new Random();
		emp.setPay(0);
		emp.setWorkHour(0);
		for(int i=0;i<20;i++){
			emp.setWorkHour(emp.getWorkHour() + sysRand.nextInt(9));
		}
		emp.setPay(dailyWagePerHour * emp.getWorkHour());
		return emp.getPay();
	}
	@Override
	public int tillHundredCalculatePay(Employee emp){
		Random sysRand = new Random();
		emp.setPay(0);
		emp.setWorkHour(0);
		while(emp.getWorkHour() <= 100){
			emp.setWorkHour(emp.getWorkHour() + sysRand.nextInt(9));
		}
		emp.setPay(dailyWagePerHour * emp.getWorkHour());
		return emp.getPay();
	}
*/
}

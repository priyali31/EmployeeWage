package com.employeewage.service;
import java.util.*;
import com.employeewage.model.*;
import com.employeewage.service.*;

public class EmployeeComputation implements EmployeeComputationService
{
	
	private List<Company> companyList;
	private Map<String,Company> companyHashMap;
	/*private static final int dailyWagePerHour = 20;
	private static final int fullDayHour = 8;*/

	public EmployeeComputation()
	{
		companyList = new ArrayList<>();
		companyHashMap = new HashMap<>();
	}

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
		Company cp=new Company(companyName,ratePerHour,workingDays,maxHoursPerMonth);
		//cp.setEmpList(DummyEmployee(companyName,workingDays));
		companyList.add(cp);
		companyHashMap.put(companyName,cp);
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

	public void computeEmpWage()
	{
		for (Company company : companyList) 
		{
			company.setTotalEmpWage(this.computeEmpWage(company));
		}
	}

	public int computeEmpWage(Company company)
	{
		int totalWage=0;
		for (Employee emp : company.getEmpList()) 
		{
			for (int dw : emp.getDailyWages()) 
			{
				totalWage += (DW*company.getRatePerHour());
			}
		}
		return totalWage;
	}

}

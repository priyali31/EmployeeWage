package com.employeewage.service;
import java.util.*;
import com.employeewage.service.*;

public class EmployeeComputation implements EmployeeComputationService
{
	
	private List<Company> companyList;
	private Map<String,Company> companyHashMap;
	public EmployeeComputation()
	{
		companyList = new ArrayList<>();
		companyHashMap = new HashMap<>();
	}

	@Override
	public boolean isPresent(Employee emp)
	{
		int random=new Random().nextInt(100)%2;
		return random==1?true:false;
	}
	@Override
	public int randomWorkHours(String companyName)
	{
		int dayHour=this.findCompany(companyName).getMaxHoursPerMonth();
		return new Random().nextInt(dayHour)%2;
	}
	@Override
	public void addCompanyWithEmployees(String companyName,int ratePerHour,int workingDays,int maxHoursPerMonth)
	{
		Company cmp=new Company(companyName,ratePerHour,workingDays,maxHoursPerMonth);
		cmp.setEmpList(DummyEmployee(companyName,workingDays));
		companyList.add(cmp);
		companyHashMap.put(companyName,cmp);
		System.out.println("Company with employee");
	}
	@Override
	public ArrayList<Employee> dummyEmployee(String companyName, int WorkingDays)
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
	
	@Override
	public Company findCompany(String companyName)
	{
		for (Company company : companyList)
		{
			if(company.getCompanyName().equalsIgnoreCase(companyName))
				return company;
		}
		return null;
	}
	@Override
	public void computeEmpWage()
	{
		for (Company company : companyList) 
		{
			company.setTotalEmpWage(this.computeEmpWage(company));
		}
	}

	//Daily Wages
	@Override
	public int computeEmpWage(Employee emp, String companyName)
	{
		Company fcmp =  findCompany(companyName);
		int dw=(new Random().nextInt(10)*fcmp.getRatePerHour());
		return dw;
	}
	//Total Wages 
	@Override
	public int computeEmpWage(Company company)
	{
		int totalWage=0;
		for (Employee emp : company.getEmpList()) 
		{
			for (int dw : emp.getDw()) 
			{
				totalWage += (Dw*company.getRatePerHour());
			}
		}
		return totalWage;
	}
	@Override
	public int getTotalCompanyEmpWage(String companyName)
	{
		this.computeEmpWage();
		Company fcmp = this.findCompany(companyName);
		if(fcmp!=null)
			return fcmp.getTotalEmpWage();
		return 0;
	}

	@Override
	public void prinAllDetails()
	{
		for(Company cmp : this.companyList)
		{
			System.out.println(+cmp.getCompanyName());
			for (Employee employee: cmp.getEmpList()) 
			{
				this.getEmployeeWas(employee);
				System.out.println(employee.toString());
			}
		}
	}
}

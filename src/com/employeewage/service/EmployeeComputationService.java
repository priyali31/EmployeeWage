package com.employeewage.service;
import java.util.ArrayList;
import com.employeewage.model.Employee;
import com.employeewage.model.company;

public interface EmployeeComputationService
{

	public boolean isPresent(Employee emp);
	public int randomWorkHours(String companyName);
	public void addCompanyWithEmployees(String companyName,int ratePerHour,int workingDays,int maxHoursPerMonth);
	public company findCompany(String companyName);
	public ArrayList<Employee> dummyEmployee(String companyName, int workingDays);
	public void computeEmpWage();
	public int computeEmpWage(Employee emp, String companyName);
	public int computeEmpWage(Company company);
	public int computeEmpWage(Employee emp, String companyName);
	public int computeEmpWage(Company company);
	public int computeEmpWage(Employee emp);
	public int getTotalCompanyEmpWage(String companyName);
	public void prinAllDetails();
}

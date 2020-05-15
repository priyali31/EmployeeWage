package com.employeewage.service;
import com.employeewage.model.Employee;
import com.employeewage.model.company;
public interface EmployeeComputationService
{

	public boolean isPresent(Employee emp);
	public int randomWorkHours(String companyName);
	public void addCompanyWithEmployees(String companyName,int ratePerHour,int workingDays,int maxHoursPerMonth);
	public company findCompany(String companyName);
	/*public int calculatePay(Employee emp);
	public String getTypeOfEmployee(Employee emp);
	public int monthlyCalculatePay(Employee emp);
	public int tillHundredCalculatePay(Employee emp);*/

}

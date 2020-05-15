package com.employeewage.service;
import com.employeewage.model.Employee;

public interface EmployeeComputationService
{

	public boolean isPresent(Employee emp);
	public int calPayment(Employee emp);
	public String getEmployeeWas(Employee emp);
	public int monthwiseCalulatePayment(Employee emp);
	public int hundredCalPayment(Employee emp);

}

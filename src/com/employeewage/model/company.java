package com.employeewage.model; 
import java.util.ArrayList; 
import java.util.List;

public class company 
{
    private final String companyName;
    private final int ratePerHour;
    private final int workingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;
    List<Employee> empList;

    company(String companyName,int ratePerHour,int workingDays,int maxHoursPerMonth)
    {
        this.companyName=companyName;
        this.ratePerHour=ratePerHour;
        this.workingDays=workingDays;
        this.maxHoursPerMonth=maxHoursPerMonth;
        totalEmpWage=0;
        empList=new ArrayList<Employee>();
    }

    public String getCompanyName()
    {
        return this.companyName;
    }

    public int getRatePerHour()
    {
        return this.ratePerHour;
    }

    public int getWorkingDays()
    {
        return this.workingDays;
    }

    public int getMaxHoursPerMonth()
    {
        return this.maxHoursPerMonth;
    }

    public int getTotalEmpWage(){
        return this.totalEmpWage;
    }

    public void setTotalEmpWage(int totalEmpWage)
    {
        this.totalEmpWage=totalEmpWage;
    }

    public List<Employee> getEmpList()
    {
        return this.empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }

    @Override
    public String toString(){
        return "Company name is " + this.companyName + " Total Employee Wage is " + this.totalEmpWage;
    }
}

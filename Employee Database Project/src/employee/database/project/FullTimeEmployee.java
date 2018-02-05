/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.database.project;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class FullTimeEmployee extends EmployeeInfo {

    private double annualSalary;

    public double getAnnualSalary() {
        return annualSalary;
    }

    public FullTimeEmployee (){
        annualSalary = 0;
    }
    
    public FullTimeEmployee(int employeeNumber, String firstName, String lastName, int sex, int workLocation, double deductionRate, double annualSalary, int typeOfEmployee) {
        super(employeeNumber, firstName, lastName, sex, workLocation, deductionRate, typeOfEmployee);
        this.annualSalary = annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }   

    public double calcAnnualGrossIncome(double annualSalary) {
        double grossIncome = annualSalary * (1 - getDeductionRate() / 100);
        return grossIncome;
    }

    @Override
    public String getData() {
        String data = "";
        data = data + getTypeOfEmployee() + "~" + getEmployeeNumber() + "~" + getFirstName() + "~" + getLastName() + "~" + getSex() + "~"
                + getWorkLocation() + "~" + getDeductionRate() + "~" + getAnnualSalary();
        return data;
    }
    
    @Override
    public String getContent() 
    {
        String content = "";
        content+=getSuperContent();
        content+="Annual Salary:" + getAnnualSalary()+"\n";
        return content;
    }
    
}

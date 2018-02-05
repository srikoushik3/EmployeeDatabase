/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.database.project;

/**
 *
 * @author USER
 */
public class PartTimeEmployee extends EmployeeInfo {

    // Attributes
    private double hourlyWage;
    private int hoursPerWeek;
    private int weeksPerYear;

    //Contructor to assign values

    public PartTimeEmployee(int employeeNumber, String firstName, String lastName, int sex, int workLocation, double deductionRate, double hourlyWage, int hoursPerWeek, int weeksPerYear, int typeOfEmployee) {
        super(employeeNumber, firstName, lastName, sex, workLocation, deductionRate, typeOfEmployee);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
        this.weeksPerYear = weeksPerYear;
    }
public PartTimeEmployee (){
        hourlyWage = 0;
        hoursPerWeek = 0;
        weeksPerYear = 0;
    }
    

    public double getHourlyWage() {
        return hourlyWage;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public int getWeeksPerYear() {
        return weeksPerYear;
    }
    
    //Setter methods for PartTimeEmployee
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public void setWeeksPerYear(int weeksPerYear) {
        this.weeksPerYear = weeksPerYear;
    }

    double calcAnnualGrossIncome(double hourlyWage, int hoursPerWeek, int weeksPerYear) {
        double annualIncome = hourlyWage * hoursPerWeek * weeksPerYear;
        double grossIncome = annualIncome - (annualIncome * getDeductionRate() / 100);
        return grossIncome;
    }

    @Override
    public String getData() {
        String data = "";
        data = data + getTypeOfEmployee() + "~" + getEmployeeNumber() + "~" + getFirstName() + "~" + getLastName() + "~" + getSex() + "~"
                + getWorkLocation() + "~" + getDeductionRate() + "~" + getHourlyWage()
                + "~" + getHoursPerWeek() + "~" + getWeeksPerYear();
        return data;
    }

    @Override
    public String getContent() 
    {
        String content = "";
        content+=getSuperContent();
        content+="Hourly Wage:" + getHourlyWage()+"\n";
        content+="Hours Per Week:" + getHoursPerWeek()+"\n";
        content+="Weeks Per Year:" + getWeeksPerYear()+"\n";
        return content;
    }
    
    

}

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
public abstract class EmployeeInfo
{
       // Attributes

    private int employeeNumber;
    private String firstName;
    private String lastName;
    private int sex;
    private int workLocation;
    private double deductionRate;
    private int typeOfEmployee;

    // Constructor to assign default values to attributes.
    public EmployeeInfo ()
    {
        employeeNumber = 777777;
        firstName = "Bugs";
        lastName = "Bunny";
        sex = 1;
        workLocation = 1;
        deductionRate = 2;
        typeOfEmployee = 0;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    
    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWorkLocation(int workLocation) {
        this.workLocation = workLocation;
    }

    public void setDeductionRate(double deductionRate) {
        this.deductionRate = deductionRate;
    }

    public void setTypeOfEmployee(int typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }

    public int getTypeOfEmployee() {
        return typeOfEmployee;
    }


    // Constructor to assign passed values to attributes.
        public EmployeeInfo(int employeeNumber, String firstName, String lastName, int sex, int workLocation, double deductionRate, int typeOfEmployee) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.workLocation = workLocation;
        this.deductionRate = deductionRate;
        this.typeOfEmployee = typeOfEmployee;
    }

//getter methods
    public String getFirstName ()
    {
        return firstName;
    }
    
    public String getLastName ()
    {
        return lastName;
    }
    // Getter method for employeeNumber attribute.
    public int getEmployeeNumber ()
    {
        return (employeeNumber);
    }
    
    public int getSex() {
        return sex;
    }

    public int getWorkLocation() {
        return workLocation;
    }

    public double getDeductionRate() {
        return deductionRate;
    }


    // Setter method for employeeNumber attributes.
    public void setEmployeeNumber (int empNo)
    {
        if (empNo < 0)
        {
            return;
        }
        else
        {
            employeeNumber = empNo;
        }
    }
    
    public abstract String getData();
    
    public abstract String getContent();
    
    public String getSuperContent()
    {
        String content = "";
        content+="Employee Id:" + getEmployeeNumber()+"\n";
        content+="Employee name:" + getFirstName() + " " + getLastName()+"\n";
        if(getSex() == 0)
        {
            content+="Sex:Male\n";
        }
        else if(getSex() == 1)
        {
            content+="Sex:Female\n";
        }
        else
        {
            content+="Sex:Other\n";
        }
        if(getWorkLocation() == 0)
        {
            content+="Work Location:Mississauga\n";
        }
        else if(getWorkLocation() == 1)
        {
            content+="Work Location: Brampton \n";
        }
        else if(getWorkLocation() == 2)
        {
            content+="Work Location: Caledon \n";
        }
        else
        {
            content+="Work Location: Ottawa \n";
        }
        content+="Deduction Rate:" + getDeductionRate()+"\n";
        return content;
    }
    
   public double getAnnualSalary() {
        return 0;
    }
    
    public double getHourlyWage() {
        return 0;
    }

    public int getHoursPerWeek() {
        return 0;
    }

    public int getWeeksPerYear() {
        return 0;
    }
               
} // public class EmployeeInfo


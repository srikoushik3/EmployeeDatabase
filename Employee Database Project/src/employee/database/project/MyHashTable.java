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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class MyHashTable {

    // buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo object.
    private static ArrayList<EmployeeInfo>[] buckets;

    // CONSTRUCTOR
    public MyHashTable(int numBuckets) {
        // Construct the hash table (open hashing/closed addressing) as an array of numBuckets ArrayLists.

        // Instantiate an array to have an ArrayList as each element of the array.
        buckets = new ArrayList[numBuckets];

        // For each element in the array, instantiate its ArrayList.
        for (int i = 0; i < numBuckets; i++) {
            buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
        }
    }

    public int calcBucket(int keyValue) {
        // Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
        return (keyValue % buckets.length);
    }

    public int getBucketLength (){
        return buckets.length;
    }

    
    // this method adds a new employee in hash table
    public boolean addEmployee(EmployeeInfo theEmployee) {
        int bucketNumber;
        bucketNumber = calcBucket(theEmployee.getEmployeeNumber());
        buckets[bucketNumber].add(theEmployee);
        return true;
    }

    
    // this method updates an employee in the hash table
    public boolean updateEmployee(int location, EmployeeInfo theEmployee) {
        int bucketNumber;
        bucketNumber = calcBucket(theEmployee.getEmployeeNumber());
        buckets[bucketNumber].add(location, theEmployee);
        buckets[bucketNumber].remove(location + 1);
        return true;
    }

    // this method searches an employee in the hash table. return -1 if not found.
    public int searchEmployee(int employeeNum) {
        int bucketNum = calcBucket(employeeNum);
        ArrayList<EmployeeInfo> employeeList = buckets[bucketNum];
        for (int j = 0; j < employeeList.size(); j++) {
            EmployeeInfo employee = employeeList.get(j);
            if (employee.getEmployeeNumber() == employeeNum) {
                return j;
            }
        }
        return -1;
    }

    // this method return an employee by employee number
    public EmployeeInfo getEmployeeInfo(int index, int employeeNum) {
        int bucketNum = calcBucket(employeeNum);
        ArrayList<EmployeeInfo> employeeList = buckets[bucketNum];
        return employeeList.get(index);
    }

    // this method remove employee from hash table by employee number
    public EmployeeInfo removeEmployee(int employeeNum) {
        int bucketNum = calcBucket(employeeNum);
        ArrayList<EmployeeInfo> employeeList = buckets[bucketNum];
        for (int j = 0; j < employeeList.size(); j++) { 
            EmployeeInfo employee = employeeList.get(j);
            if (employee.getEmployeeNumber() == employeeNum) {
                employeeList.remove(j);
                return employee;
            }
        }
        return null;
    } //removeEmployee

    // this method display all details of all employee of hash table
    public void displayContents() {

        for (int i = 0; i < buckets.length; i++) {
            ArrayList<EmployeeInfo> employeeList = buckets[i];
            System.out.println("Displaying data for bucket:" + i);
            for (int j = 0; j < employeeList.size(); j++) {
                EmployeeInfo info = employeeList.get(j);
                System.out.println("Employee Id:" + info.getEmployeeNumber());
                System.out.println("Employee name:" + info.getFirstName() + " " + info.getLastName());
                System.out.println("Sex:" + info.getSex());
                System.out.println("Work Location:" + info.getWorkLocation());
                System.out.println("Deduction Rate:" + info.getDeductionRate());

                System.out.println("-----------------------------------------");
            }
        }

    }

    // this method return a list of all employees in hash table
   public ArrayList<EmployeeInfo> getAllEmloyees()
    {
        ArrayList<EmployeeInfo> list = new ArrayList<>();
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<EmployeeInfo> employeeList = buckets[i];
            for (int j = 0; j < employeeList.size(); j++) {
                EmployeeInfo info = employeeList.get(j);
                list.add(info);
            }
        }
        return list;
    }
    

   // this method write whole info of all employees to file
    public static void writeToFile() {
        File f = new File("empfile.txt");
        try {
            if (!f.exists()) {
                f.createNewFile();
            }

            PrintWriter outPut = new PrintWriter(f);

            for (int j = 0; j < buckets.length; j++) {
                ArrayList<EmployeeInfo> employeeList;
                employeeList = buckets[j];

                for (int k = 0; k < employeeList.size(); k++) {
                    EmployeeInfo employee = employeeList.get(k);
                    String data = employee.getData();
                    outPut.println(data);

                }

            }
            outPut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // this method read whole info of employees from file
    //if first character is 0, then the field is Full time employee
    //if first character is 1, then the field is Part time employee
    public void readFromFile() {
        try {
            File file2 = new File("empfile.txt");
            if (file2.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file2));

                while (true) {
                    String line = reader.readLine();
                    if (line == null) {
                        break;
                    }
                    String[] array = line.split("~"); //variable array contains array of Strings
                    if (array[0].equals("0")) {
                        FullTimeEmployee employee = new FullTimeEmployee();
                        employee.setTypeOfEmployee(Integer.parseInt(array[0]));
                        employee.setEmployeeNumber(Integer.parseInt(array[1]));
                        employee.setFirstName(array[2]);
                        employee.setLastName(array[3]);
                        employee.setSex(Integer.parseInt(array[4]));
                        employee.setWorkLocation(Integer.parseInt(array[5]));
                        employee.setDeductionRate(Double.parseDouble(array[6]));
                        employee.setAnnualSalary(Double.parseDouble(array[7]));
                        addEmployee(employee);
                    } else {
                        PartTimeEmployee employee = new PartTimeEmployee();
                        employee.setTypeOfEmployee(Integer.parseInt(array[0]));
                        employee.setEmployeeNumber(Integer.parseInt(array[1]));
                        employee.setFirstName(array[2]);
                        employee.setLastName(array[3]);
                        employee.setSex(Integer.parseInt(array[4]));
                        employee.setWorkLocation(Integer.parseInt(array[5]));
                        employee.setDeductionRate(Double.parseDouble(array[6]));
                        employee.setHourlyWage(Double.parseDouble(array[7]));
                        employee.setHoursPerWeek(Integer.parseInt(array[8]));
                        employee.setWeeksPerYear(Integer.parseInt(array[9]));
                        addEmployee(employee);
                    }

                    for (String word : array) { //counted loop runs for the length of array
                        
                        FullTimeEmployee employee = new FullTimeEmployee();

                        System.out.println(word);
                    }
                    ArrayList<EmployeeInfo> employeeList = buckets[1];
                    System.out.println(employeeList.size());
                }
                reader.close();
            }
        } catch (Exception ex) {
            System.out.println("Error Reading File!");
            ex.printStackTrace();
        }

    } //end of method readFrom

} // end class MyHashTable


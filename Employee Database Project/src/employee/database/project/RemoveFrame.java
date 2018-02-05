/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.database.project;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class RemoveFrame extends javax.swing.JFrame {

    MyHashTable table;

    /**
     * Creates new form ModifyJFrame
     */
    //constructor to call the remove JFrame from the main menu
    public RemoveFrame(MyHashTable t) {
        initComponents();

        this.table = t;
        fullTimeEmployeePanel.setVisible(false);
        partTimeEmployeePanel.setVisible(false);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

    }

//constructor to call the remove JFrame for a specific employee from the display table
    public RemoveFrame(MyHashTable t, int empId) {
        initComponents();
        this.table = t;
        fullTimeEmployeePanel.setVisible(false);
        partTimeEmployeePanel.setVisible(false);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        searchEmployeeNum.setText("" + empId);
        searchEmployeeNum.setEditable(false);
        searchEmployee();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeOfEmployeeGroup = new javax.swing.ButtonGroup();
        genderGroup = new javax.swing.ButtonGroup();
        fullTimeEmployeePanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        annualSalaryText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        searchEmployeeNum = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        employeeNumberText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        otherRadioButton = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        deductionRateText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        partTimeRadioButton = new javax.swing.JRadioButton();
        fullTimeRadioButton = new javax.swing.JRadioButton();
        workLocationComboBox = new javax.swing.JComboBox<>();
        partTimeEmployeePanel = new javax.swing.JPanel();
        weeksPerYearText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hourlyWageText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        hoursPerWeekText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullTimeEmployeePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setText("Annual Salary($)");
        fullTimeEmployeePanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 70));

        annualSalaryText.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        annualSalaryText.setEnabled(false);
        annualSalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annualSalaryTextActionPerformed(evt);
            }
        });
        fullTimeEmployeePanel.add(annualSalaryText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 140, 40));

        getContentPane().add(fullTimeEmployeePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 380, 140));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Enter the Employee Number :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 240, 40));
        getContentPane().add(searchEmployeeNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 160, 30));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 80, 30));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setText("Type of Employee");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 190, 60));

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel15.setText("Employee Number");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, 60));

        employeeNumberText.setEditable(false);
        employeeNumberText.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        getContentPane().add(employeeNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 140, 50));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("First Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, 70));

        firstNameText.setEditable(false);
        firstNameText.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        getContentPane().add(firstNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 140, 40));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setText("Last Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 60));

        lastNameText.setEditable(false);
        lastNameText.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        getContentPane().add(lastNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 140, 40));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("Sex");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 100, 60));

        genderGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");
        maleRadioButton.setEnabled(false);
        getContentPane().add(maleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        genderGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");
        femaleRadioButton.setEnabled(false);
        getContentPane().add(femaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        genderGroup.add(otherRadioButton);
        otherRadioButton.setText("Other");
        otherRadioButton.setEnabled(false);
        getContentPane().add(otherRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("Deduction Rate (%)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 170, 50));

        deductionRateText.setEditable(false);
        deductionRateText.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        getContentPane().add(deductionRateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 140, 50));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("Work Location");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, 60));

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, 40));

        typeOfEmployeeGroup.add(partTimeRadioButton);
        partTimeRadioButton.setText("Part Time");
        partTimeRadioButton.setEnabled(false);
        partTimeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partTimeRadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(partTimeRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        typeOfEmployeeGroup.add(fullTimeRadioButton);
        fullTimeRadioButton.setText("Full Time");
        fullTimeRadioButton.setEnabled(false);
        fullTimeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullTimeRadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(fullTimeRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));

        workLocationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mississauga", "Brampton", "Caledon", "Ottawa" }));
        workLocationComboBox.setEnabled(false);
        getContentPane().add(workLocationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 130, 30));

        partTimeEmployeePanel.setBackground(new java.awt.Color(255, 255, 255));
        partTimeEmployeePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        weeksPerYearText.setEditable(false);
        weeksPerYearText.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        partTimeEmployeePanel.add(weeksPerYearText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 140, 40));

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel13.setText("Hours Per Week");
        partTimeEmployeePanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, 50));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setText("Hourly Wage");
        partTimeEmployeePanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 40));

        hourlyWageText.setEditable(false);
        hourlyWageText.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        partTimeEmployeePanel.add(hourlyWageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 140, 40));

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel14.setText("Weeks Per Year");
        partTimeEmployeePanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 190, 70));

        hoursPerWeekText.setEditable(false);
        hoursPerWeekText.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        partTimeEmployeePanel.add(hoursPerWeekText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 140, 40));

        getContentPane().add(partTimeEmployeePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 380, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        searchEmployee();
    }//GEN-LAST:event_searchButtonActionPerformed

    // search an employee and display the details of the employee
    //exception handling to prevent non-integer input for employee number
    //isEmpty method to make sure user enters a value first
    void searchEmployee() {
        String number = searchEmployeeNum.getText();
        try {
            if (!number.isEmpty()) {
                int empNum = Integer.parseInt(number);
                int location;

                location = table.searchEmployee(empNum);
                if (location != -1) {
                    EmployeeInfo tempEmployee = table.getEmployeeInfo(location, empNum);

                    if (tempEmployee instanceof FullTimeEmployee) {
                        //Casting FullTimeEmployee
                        FullTimeEmployee employee;
                        employee = (FullTimeEmployee) table.getEmployeeInfo(location, empNum);

                        fullTimeRadioButton.setSelected(true);
                        partTimeEmployeePanel.setVisible(false);
                        fullTimeEmployeePanel.setVisible(true);

                        String fN = employee.getFirstName();
                        String lN = employee.getLastName();
                        int empNumber;
                        empNumber = employee.getEmployeeNumber();
                        int s = employee.getSex();
                        int wL = employee.getWorkLocation();
                        double dedRate;
                        dedRate = employee.getDeductionRate();
                        double annualSalary;
                        annualSalary = employee.getAnnualSalary();

                        employeeNumberText.setText(Integer.toString(empNumber));
                        lastNameText.setText(lN);
                        firstNameText.setText(fN);

                        if (s == 0) {
                            maleRadioButton.setSelected(true);
                        } else if (s == 1) {
                            femaleRadioButton.setSelected(true);
                        } else {
                            otherRadioButton.setSelected(true);
                        }

                        if (wL == 0) {
                            workLocationComboBox.setSelectedItem("Mississauga");
                        } else if (wL == 1) {
                            workLocationComboBox.setSelectedItem("Brampton");
                        } else if (wL == 2) {
                            workLocationComboBox.setSelectedItem("Caledon");
                        } else {
                            workLocationComboBox.setSelectedItem("Ottawa");
                        }
                        deductionRateText.setText(Double.toString(dedRate));
                        annualSalaryText.setText(Double.toString(annualSalary));

                    } else if (tempEmployee instanceof PartTimeEmployee) {
                        //Casting PartTimeEmployee
                        PartTimeEmployee employee = (PartTimeEmployee) table.getEmployeeInfo(location, empNum);

                        partTimeRadioButton.setSelected(true);
                        fullTimeEmployeePanel.setVisible(false);
                        partTimeEmployeePanel.setVisible(true);

                        String fN = employee.getFirstName();
                        String lN = employee.getLastName();
                        int empNumber;
                        empNumber = employee.getEmployeeNumber();
                        int s = employee.getSex();
                        int wL = employee.getWorkLocation();
                        double dedRate;
                        dedRate = employee.getDeductionRate();
                        double wagePerHour;
                        wagePerHour = employee.getHourlyWage();
                        int hours;
                        hours = employee.getHoursPerWeek();
                        int weeks;
                        weeks = employee.getWeeksPerYear();

                        employeeNumberText.setText(Integer.toString(empNumber));
                        lastNameText.setText(lN);
                        firstNameText.setText(fN);
                        if (s == 0) {
                            maleRadioButton.setSelected(true);
                        } else if (s == 1) {
                            femaleRadioButton.setSelected(true);
                        } else {
                            otherRadioButton.setSelected(true);
                        }

                        if (wL == 0) {
                            workLocationComboBox.setSelectedItem("Mississauga");
                        } else if (wL == 1) {
                            workLocationComboBox.setSelectedItem("Brampton");
                        } else if (wL == 2) {
                            workLocationComboBox.setSelectedItem("Caledon");
                        } else {
                            workLocationComboBox.setSelectedItem("Ottawa");
                        }
                        deductionRateText.setText(Double.toString(dedRate));
                        hourlyWageText.setText(Double.toString(wagePerHour));
                        hoursPerWeekText.setText((Integer.toString(hours)));
                        weeksPerYearText.setText(Integer.toString(weeks));
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Employee Not Found");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Enter a value!");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter an Integer value!");
        }
    }

    private void annualSalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annualSalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annualSalaryTextActionPerformed

    private void partTimeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partTimeRadioButtonActionPerformed
        fullTimeEmployeePanel.setVisible(false);
        partTimeEmployeePanel.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_partTimeRadioButtonActionPerformed

    // delete an employee from the hash table

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        String number = searchEmployeeNum.getText();
        //message boxes to verify and confirm deletion of an employee
        //to error check if user does not enter a value
        if (!number.isEmpty()) {
            int empNum = Integer.parseInt(number);

            int option = JOptionPane.showConfirmDialog(this, "Are you sure", "Delete", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                table.removeEmployee(empNum);
                JOptionPane.showMessageDialog(this, "Employee Deleted Successfully!");
                this.setVisible(false);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Enter a value!");
        }

    }//GEN-LAST:event_removeButtonActionPerformed

    private void fullTimeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullTimeRadioButtonActionPerformed
        partTimeEmployeePanel.setVisible(false);
        fullTimeEmployeePanel.setVisible(true);


    }//GEN-LAST:event_fullTimeRadioButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField annualSalaryText;
    private javax.swing.JTextField deductionRateText;
    private javax.swing.JTextField employeeNumberText;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JPanel fullTimeEmployeePanel;
    private javax.swing.JRadioButton fullTimeRadioButton;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JTextField hourlyWageText;
    private javax.swing.JTextField hoursPerWeekText;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JPanel partTimeEmployeePanel;
    private javax.swing.JRadioButton partTimeRadioButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchEmployeeNum;
    private javax.swing.ButtonGroup typeOfEmployeeGroup;
    private javax.swing.JTextField weeksPerYearText;
    private javax.swing.JComboBox<String> workLocationComboBox;
    // End of variables declaration//GEN-END:variables
}

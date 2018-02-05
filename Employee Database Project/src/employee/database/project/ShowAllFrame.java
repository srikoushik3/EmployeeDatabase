/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.database.project;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
// display all the employess of hash table to the Jtable
// you can select a row of table and perform modify or delete to that selected row
public class ShowAllFrame extends javax.swing.JFrame {

    MyHashTable table;
    MyModel model;

    ArrayList<EmployeeInfo> data;

    public ShowAllFrame() {
        initComponents();
    }

    public ShowAllFrame(MyHashTable table) {
        initComponents();
        this.table = table;

        data = table.getAllEmloyees();
        model = new MyModel();
        jTable1.setModel(model);

    }

    /**
     * Creates new form TableDemo
     */
    // model connect the data of hash table to the JTable
    class MyModel extends AbstractTableModel {

        @Override
        public String getColumnName(int column) {
            if (column == 0) {
                return "Employee Id";
            } else if (column == 1) {
                return "Type";
            } else if (column == 2) {
                return "Name";
            } else if (column == 3) {
                return "Sex";
            } else if (column == 4) {
                return "Work Location";
            } else if (column == 5) {
                return "Deduction Rate";
            } else if (column == 6) {
                return "Annual Salary";
            } else if (column == 7) {
                return "Hourly Wage";
            } else if (column == 8) {
                return "Hours/Week";
            } else {
                return "Weeks/Year";
            }
        }

        @Override
        public int getRowCount() {
            return data.size();
        }

        @Override
        public int getColumnCount() {
            return 10;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            EmployeeInfo employee = data.get(rowIndex);
            if (columnIndex == 0) {
                return employee.getEmployeeNumber();
            } else if (columnIndex == 1) {
                if (employee.getTypeOfEmployee() == 0) {
                    return "Full Time";
                } else {
                    return "Part Time";
                }
            } else if (columnIndex == 2) {
                return employee.getFirstName() + " " + employee.getLastName();
            } else if (columnIndex == 3) {
                if (employee.getSex() == 0) {
                    return "Male";
                } else {
                    return "Female";
                }
            } else if (columnIndex == 4) {
                int wL = employee.getWorkLocation();
                if (wL == 0) {
                    return "Mississauga";
                } else if (wL == 1) {
                    return "Brampton";
                } else if (wL == 2) {
                    return "Caledon";
                } else {
                    return "Ottawa";
                }
            } else if (columnIndex == 5) {
                return employee.getDeductionRate();
            } else if (columnIndex == 6) {
                if (employee.getTypeOfEmployee() == 0) {
                    return employee.getAnnualSalary();
                } else {
                    return "";
                }
            } else if (columnIndex == 7) {
                if (employee.getTypeOfEmployee() == 1) {
                    return employee.getHourlyWage();
                } else {
                    return "";
                }

            } else if (columnIndex == 8) {
                if (employee.getTypeOfEmployee() == 1) {
                    return employee.getHoursPerWeek();
                } else {
                    return "";
                }

            } else {
                if (employee.getTypeOfEmployee() == 1) {
                    return employee.getWeeksPerYear();
                } else {
                    return "";
                }

            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        modifyButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee List");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, 0, 870, 100);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 90, 870, 280);

        modifyButton.setText("Modify");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(modifyButton);
        modifyButton.setBounds(200, 380, 170, 40);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton);
        deleteButton.setBounds(490, 380, 170, 40);

        setSize(new java.awt.Dimension(889, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row first!");
        } else {
            int empId = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
            new ModifyJFrame(table, empId).setVisible(true);
        }
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row first!");
        } else {
            int empId = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
            new RemoveFrame(table, empId).setVisible(true);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        data.clear();
        data = table.getAllEmloyees();
        model.fireTableDataChanged();

    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modifyButton;
    // End of variables declaration//GEN-END:variables
}
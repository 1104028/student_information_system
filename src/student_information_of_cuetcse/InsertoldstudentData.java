/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_information_of_cuetcse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author RUKUNUJJAMAN MIAJI
 */
class InsertoldstudentData extends JFrame 
{
    private final JLabel ID;
    private final JLabel L_GRADE;
    private final JLabel POINT;
    private final JLabel SAMPLE_SUB_ID;
    private final JLabel SUB_ID;
    private final JLabel TERM;
    private final JButton jButton1;
    private final JComboBox jComboBox1;
    private final JComboBox jComboBox2;
    private final JComboBox jComboBox3,jComboBox4;
    private final JLabel jLabel1;
    private final JTextField sub_id;
    private final JTextField text_id;
    
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    static Connection con;
    static Statement st;
    DefaultTableModel table_model;
    ResultSet result_set;
    ResultSetMetaData result_set_meta_data;
    InsertoldstudentData()
    {
        initComponent();
          jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        text_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        TERM = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        SAMPLE_SUB_ID = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        SUB_ID = new javax.swing.JLabel();
        sub_id = new javax.swing.JTextField();
        L_GRADE = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        POINT = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        
        setPreferredSize(new java.awt.Dimension(617, 630));

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("CHITTAGONG UNIVERSITY OF ENGINEERING TECHNOLOGY");

        jLabel2.setText("DEPARTMENT OF COMPUTER SCIENCE & ENGINEERING");

        jLabel5.setBackground(new java.awt.Color(51, 255, 255));
        jLabel5.setFont(new java.awt.Font("Siyam Rupali", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 51));
        jLabel5.setText("CREATED BY MD.RUKUNUJJAMAN MIAJI");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Insert old student Data");

        ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ID.setText("ID:");


        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TERM.setText("TERM:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Term 1", "Term 2", "Term 3", "Term 4", "Term 5", "Term 6", "Term 7", "Term 8"  }));

        SAMPLE_SUB_ID.setText("SAMPLE_SUB_ID:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1  CSE-141", "2  ME-143", "3  MATH-141", "4  PHY-141", "5  HUM-141", "6  CSE-142", "7  ME-144", "8  PHY-142", "9  CSE-143", "10 EE-181", "11 MATH-143", "12 CHEM-141", "13 HUM-143", "14 CSE-144", "15 EE-182", "16 ME-146", "17 CHEM-142", "18 CSE-221", "19 CSE-241", "20 EE-281", "21 MATH-241", "22 HUM-241", "23 CSE-222", "24 CSE-242", "25 EE-282", "26 CSE-211", "27 CSE-223", "28 CSE-243", "29 EE-283", "30 MATH-243", "31 CSE-224", "32 CSE-244", "33 EE-284", "34 CSE-323", "35 CSE-331", "36 CSE-333", "37 CSE-341", "38 CSE-351", "39 CSE-334", "40 CSE-342", "41 CSE-352", "42 CSE-313", "43 CSE-321", "44 CSE-335", "45 CSE-345", "46 CSE-353", "47 CSE-314", "48 CSE-336", "49 CSE-346", "50 CSE-354", "51 CSE-411", "52 CSE-431", "53 CSE-437", "54 CSE-487", "55 CSE-412", "56 CSE-432", "57 CSE-438", "58 CSE-488", "59 CSE-400", "60 CSE-402", "61 OP-CSE-441", "62 OP-CSE-442", "63 CSE-419", "64 CSE-421", "65 CSE-433", "66 CSE-457", "67 CSE-422", "68 CSE-434", "69 CSE-458", "70 OP-EE-481"  }));

        SUB_ID.setText("SUB_ID:");

        L_GRADE.setText("L_GRADE:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D", "F" }));

        POINT.setText("POINT:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4.00", "3.75", "3.50", "3.25", "3.00", "2.75", "2.50", "2.25", "2.00", "0.00" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(L_GRADE, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TERM, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(POINT, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(74, 74, 74))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SAMPLE_SUB_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(SUB_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(text_id)
                                .addComponent(jComboBox1, 0, 182, Short.MAX_VALUE)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sub_id)
                                .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(171, 171, 171)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TERM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sub_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(L_GRADE, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(SUB_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(SAMPLE_SUB_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(POINT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }
       
         private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) 
         {
              String ID ="";
              String SUB="";
                String id_number = text_id.getText();
                String term = jComboBox1.getSelectedItem().toString();
                String sub_id_no = sub_id.getText();
                String l_grade = jComboBox3.getSelectedItem().toString();
                String point = jComboBox4.getSelectedItem().toString();
                 boolean a=isNumeric(id_number);
                 boolean b=isNumeric(sub_id_no);
                 if(((id_number.equals("")||sub_id_no.equals(""))))
                 {
                     JOptionPane.showMessageDialog(this,"Please Insert id,name,sub_id,hall_id,father,mother and others","Error",JOptionPane.ERROR_MESSAGE);
                 }
                 else if(a==false)
                 {
                     JOptionPane.showMessageDialog(this,"Please id_number and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                 else if(b==false)
                 {
                     JOptionPane.showMessageDialog(this,"Please sub_id_no and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                 else
                 {
                  try {
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {

                String query = ("SELECT ID,SUB_ID from ACADEMIC_DEPT_INFO where id= \'" + id_number + "\'and SUB_ID=\'" + sub_id_no + "\' ");
                result_set = st.executeQuery(query);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while (result_set.next()) {
                    ID = result_set.getString("ID");
                    SUB = result_set.getString("SUB_ID");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (id_number.equals(ID) && sub_id_no.equals(SUB)) 
            {
                  JOptionPane.showMessageDialog(this,"This ID and SUB_ID is already have in Database,PLEASE SELECT UPDATE OPTION","Error",JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
                     String p = "insert into ACADEMIC_DEPT_INFO values(\'" + id_number + "\',\'" + term + "\'," + sub_id_no + ",\'" + l_grade + "\'," + point+ ")";
                     System.out.println(p);
                      try { 
                          st.executeQuery(p);
                      } catch (SQLException ex) {
                          Logger.getLogger(InsertoldstudentData.class.getName()).log(Level.SEVERE, null, ex);
                      }
                     JOptionPane.showMessageDialog(this,"Insert Successful","Successfull",JOptionPane.OK_OPTION);
                 }
            }
            }   // TODO add your handling code here:
                             
    
        public void initComponent() 
    {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        try {
            con = MakeConnection.getDatabaseConnection();
        } catch (Exception e) 
        {
            System.out.println(e.toString());
        } finally {
            System.out.println("Database Connected");
        }
        try 
        {
            st = con.createStatement();
        } catch (SQLException ex)
        {
            Logger.getLogger(InsertoldstudentData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public static boolean isNumeric(String str)  
{  
  try  
  {  
    double d = Double.parseDouble(str);  
  }  
  catch(NumberFormatException nfe)  
  {  
    return false;  
  }  
  return true;  
}
 static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertoldstudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertoldstudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertoldstudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertoldstudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertoldstudentData().setVisible(true);
            }
        });
}               
 }

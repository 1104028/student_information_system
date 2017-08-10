/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_information_of_cuetcse;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RUKUNUJJAMAN MIAJI
 */
final class UpdateData extends JFrame
{
    private javax.swing.JLabel ID;
    private javax.swing.JLabel L_GRADE;
    private javax.swing.JLabel POINT;
    private javax.swing.JLabel SAMPLE_SUB_ID;
    private javax.swing.JLabel SUB_ID;
    private javax.swing.JLabel TERM;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField sun_id;
    private javax.swing.JTextField text_id;
    static Connection con;
    static Statement st;
    DefaultTableModel table_model;
    ResultSet result_set;
    ResultSetMetaData result_set_meta_data;
    String count;
    
  UpdateData()
  {
        initComponent();
       jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        TERM = new javax.swing.JLabel();
        SAMPLE_SUB_ID = new javax.swing.JLabel();
        SUB_ID = new javax.swing.JLabel();
        L_GRADE = new javax.swing.JLabel();
        POINT = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        sun_id = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        text_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();


        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("CHITTAGONG UNIVERSITY OF ENGINEERING TECHNOLOGY");

        jLabel2.setText("DEPARTMENT OF COMPUTER SCIENCE & ENGINEERING");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("UPDATE STUDENT DATA");

        ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ID.setText("ID:");

        TERM.setText("TERM:");

        SAMPLE_SUB_ID.setText("SAMPLE_SUB_ID:");

        SUB_ID.setText("SUB_ID:");

        L_GRADE.setText("L_GRADE:");

        POINT.setText("POINT:");

        jLabel7.setText("MOBILE NO:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4.00", "3.75", "3.50", "3.25", "3.00", "2.75", "2.50", "2.25", "2.00", "0.00" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D", "F" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1  CSE-141", "2  ME-143", "3  MATH-141", "4  PHY-141", "5  HUM-141", "6  CSE-142", "7  ME-144", "8  PHY-142", "9  CSE-143", "10 EE-181", "11 MATH-143", "12 CHEM-141", "13 HUM-143", "14 CSE-144", "15 EE-182", "16 ME-146", "17 CHEM-142", "18 CSE-221", "19 CSE-241", "20 EE-281", "21 MATH-241", "22 HUM-241", "23 CSE-222", "24 CSE-242", "25 EE-282", "26 CSE-211", "27 CSE-223", "28 CSE-243", "29 EE-283", "30 MATH-243", "31 CSE-224", "32 CSE-244", "33 EE-284", "34 CSE-323", "35 CSE-331", "36 CSE-333", "37 CSE-341", "38 CSE-351", "39 CSE-334", "40 CSE-342", "41 CSE-352", "42 CSE-313", "43 CSE-321", "44 CSE-335", "45 CSE-345", "46 CSE-353", "47 CSE-314", "48 CSE-336", "49 CSE-346", "50 CSE-354", "51 CSE-411", "52 CSE-431", "53 CSE-437", "54 CSE-487", "55 CSE-412", "56 CSE-432", "57 CSE-438", "58 CSE-488", "59 CSE-400", "60 CSE-402", "61 OP-CSE-441", "62 OP-CSE-442", "63 CSE-419", "64 CSE-421", "65 CSE-433", "66 CSE-457", "67 CSE-422", "68 CSE-434", "69 CSE-458", "70 OP-EE-481" }));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Term 1", "Term 2", "Term 3", "Term 4", "Term 5", "Term 6", "Term 7", "Term 8"  }));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(51, 255, 255));
        jLabel5.setFont(new java.awt.Font("Siyam Rupali", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 51));
        jLabel5.setText("CREATED BY MD.RUKUNUJJAMAN MIAJI");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TERM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SAMPLE_SUB_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SUB_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L_GRADE, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(POINT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sun_id)
                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sun_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TERM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SAMPLE_SUB_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SUB_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(L_GRADE, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(POINT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
  }
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
    {                                         
                String id_number = text_id.getText();
                String term = jComboBox1.getSelectedItem().toString();
                String sub_id = sun_id.getText();
                String l_grade = jComboBox3.getSelectedItem().toString();
                String point = jComboBox4.getSelectedItem().toString();
                String mobile =jTextField2.getText();
                
                 boolean a=isNumeric(id_number);
                 boolean b=isNumeric(sub_id);
                 boolean d=isNumeric(mobile);
                 
                    try {
                 st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                 } catch (SQLException ex) {
                Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
                 }
                   String query = "select count(a.id) as total\n" +
                                   "from ACADEMIC_DEPT_INFO a\n" +
                                   "where a.id=\'" + id_number + "\'";
                   System.out.println(query);
             try {
                result_set = st.executeQuery(query);
             } catch (SQLException ex) {
                 Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
             }
              try {
                while (result_set.next())
                {
                    count = result_set.getString("total");
                    System.out.println(count);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
            }
                 if(((id_number.equals(""))||(sub_id.equals("")) ||(mobile.equals(""))))
                 {
                     JOptionPane.showMessageDialog(this,"Please Insert id,name,sub_id,hall_id,father,mother and others","Error",JOptionPane.ERROR_MESSAGE);
                 }
                 else if(a==false)
                 {
                     JOptionPane.showMessageDialog(this,"Please check id_number and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                 else if(b==false)
                 {
                     JOptionPane.showMessageDialog(this,"Please check sub_id  and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                 else if(d==false)
                 {
                     JOptionPane.showMessageDialog(this,"Please mobile_no and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                 else
                 {
                     if(count.equals("0"))
                     {
                       JOptionPane.showMessageDialog(this,"ID NOT FOUND IN DATABASE","Error",JOptionPane.ERROR_MESSAGE); 
                     }
                     else
                     {
                  try {
                 st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                 } catch (SQLException ex) {
                Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
                 }
           
            
                     String r = "UPDATE ACADEMIC_DEPT_INFO a\n" +
                                "SET a.TERM=\'" + term + "\',a.L_grade=\'" + l_grade + "\',a.point=" + point+ "\n" +
                                "where a.id=\'" + id_number + "\' and a.sub_id=" + sub_id + "";
                     System.out.println(r);
                     
                     String q = "UPDATE PERSONAL_INFORMATION a\n" +
                                "SET a.MOBILE_NO=\'" + mobile + "\'\n" +
                                "where a.id=\'" + id_number + "\'";
                     System.out.println(q);
                     
                      try {
                          st.executeQuery(r);
                      } catch (SQLException ex) {
                          Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
                      }
                      try {
                          st.executeQuery(q);
                      } catch (SQLException ex) {
                          Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
                      }
                     JOptionPane.showMessageDialog(this,"Update Successful","Successfull",JOptionPane.OK_OPTION);
            } 
                 }
    }
      private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) 
      {                                         
         String id_number = text_id.getText();
         String sub_id = sun_id.getText();
          boolean a=isNumeric(id_number);
           boolean b=isNumeric(sub_id);
           
                 if(((id_number.equals(""))||(sub_id.equals("")) ))
                 {
                     JOptionPane.showMessageDialog(this,"Please Insert id_number and sub_id","Error",JOptionPane.ERROR_MESSAGE);
                 }
                 else if(a==false)
                 {
                     JOptionPane.showMessageDialog(this,"Please check id_number and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                  else if(b==false)
                 {
                     JOptionPane.showMessageDialog(this,"Please check sub_id  and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
                 }
         else
                 {
                  try {
                 st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                 } catch (SQLException ex) {
                Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
                 }
                   String query = "select count(a.id) as total\n" +
                                   "from ACADEMIC_DEPT_INFO a\n" +
                                   "where a.id=\'" + id_number + "\'";
                   System.out.println(query);
             try {
                result_set = st.executeQuery(query);
             } catch (SQLException ex) {
                 Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
             }
              try {
                while (result_set.next())
                {
                    count = result_set.getString("total");
                    System.out.println(count);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
            }
              if(count.equals("1"))
              {
           
            
                     String r = "delete from ACADEMIC_DEPT_INFO \n" +
                                "where id=\'" + id_number + "\'";
                     System.out.println(r);
                     
                     String q = "delete from PERSONAL_INFORMATION \n" +
                                "where id=\'" + id_number + "\'";
                     System.out.println(q);
                     
                      try {
                          st.executeQuery(r);
                      } catch (SQLException ex) {
                          Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
                      }
                      try {
                          st.executeQuery(q);
                      } catch (SQLException ex) {
                          Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
                      }
                     JOptionPane.showMessageDialog(this,"Delete Successful","Successfull",JOptionPane.OK_OPTION);
            } 
              else if(count.equals("0"))
                {
                 JOptionPane.showMessageDialog(this,"ID NOT FOUND IN DATABASE","Error",JOptionPane.ERROR_MESSAGE); 
                }  
              else
              {
               String r = "delete from ACADEMIC_DEPT_INFO \n" +
                                "where id=\'" + id_number + "\' and SUB_ID=" + sub_id + "";
                     System.out.println(r);
                      try {
                          st.executeQuery(r);
                      } catch (SQLException ex) {
                          Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
                      }
                      JOptionPane.showMessageDialog(this,"Delete Successful","Successfull",JOptionPane.OK_OPTION);
              }
    } 
              // TODO add your handling code here:
      }                                         
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
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
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
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(UpdateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateData().setVisible(true);
            }
        });
}
}

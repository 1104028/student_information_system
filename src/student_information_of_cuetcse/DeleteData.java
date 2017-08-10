/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_information_of_cuetcse;

import java.sql.Connection;
import java.sql.ResultSet;
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
class DeleteData extends JFrame
{
   private javax.swing.JButton DELETE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    static Connection con;
    static Statement st;
    DefaultTableModel table_model;
    ResultSet result_set,result_set1,result_set2;
    String count,name,cgpa;
  DeleteData()
  {
        initComponent();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        DELETE = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("CHITTAGONG UNIVERSITY OF ENGINEERING TECHNOLOGY");

        jLabel2.setText("DEPARTMENT OF COMPUTER SCIENCE & ENGINEERING");

        jLabel5.setBackground(new java.awt.Color(51, 255, 255));
        jLabel5.setFont(new java.awt.Font("Siyam Rupali", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 51));
        jLabel5.setText("CREATED BY MD.RUKUNUJJAMAN MIAJI");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("DELETE  A STUDENT DATA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ID:");

        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 90, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(198, 198, 198)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(165, 165, 165)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>                        
    private void DELETEActionPerformed(java.awt.event.ActionEvent evt)
    {                                       
        String id_number = jTextField1.getText();
        
         boolean a=isNumeric(id_number);
                 if((id_number.equals("")))
                 {
                     JOptionPane.showMessageDialog(this,"Please Insert ID_NUMBER","Error",JOptionPane.ERROR_MESSAGE);
                 }
                 else if(a==false)
                 {
                     JOptionPane.showMessageDialog(this,"Please check id_number and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                 else
                 {
                 
            try {
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            } catch (SQLException ex) {
                Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
            }
                

              
                     String query = ("select count(c.id) as count\n" +
                               "from (select a.id,a.sub_id,a.POINT\n" +
                               "from ACADEMIC_DEPT_INFO a,ACADEMIC_DEPT_INFO b\n" +
                               "where a.SUB_ID=b.SUB_ID and a.point>=2.00 and a.id= \'" + id_number + "\') c ");
                     
                     String query1=("select name from PERSONAL_INFORMATION a where a.id=\'" + id_number + "\'");
                     
                     String query2=("Select (SUM(ACADEMIC_DEPT_INFO.POINT*COURSE_INFO.credit_hour)/sum(COURSE_INFO.credit_hour)) as result\n" +
"                                   From ACADEMIC_DEPT_INFO \n" +
"                           Join COURSE_INFO On ACADEMIC_DEPT_INFO.SUB_ID=COURSE_INFO.SUB_ID\n" +
"                           WHERE  ACADEMIC_DEPT_INFO.ID=\'" + id_number + "\'");
                     System.out.println(query);
                     System.out.println(query1);
                     System.out.println(query2); 
                     try {
                result_set = st.executeQuery(query);
            } catch (SQLException ex) {
                Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while (result_set.next())
                {
                    count = result_set.getString("count");
                    System.out.println(count);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                result_set1 = st.executeQuery(query1);
            } catch (SQLException ex) {
                Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while (result_set1.next())
                {
                    name=result_set1.getString("name");
                    System.out.println(name);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                result_set2 = st.executeQuery(query2);
            } catch (SQLException ex) {
                Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while (result_set2.next())
                {
                    cgpa=result_set2.getString("result");
                    System.out.println(cgpa);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
            }
                if(count.equals("70"))
                {
                     String r = "delete from academic_dept_info a\n" +
"                           where a.id=\'" + id_number + "\'";
                     System.out.println(r);
                     
 
                     String p = " delete from personal_information a\n" +
"                            where a.id=\'" + id_number + "\'";
                     System.out.println(p);
                     
                try {
                    st.executeQuery(r);
                } catch (SQLException ex) {
                    Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                try {
                    st.executeQuery(p);
                } catch (SQLException ex) {
                    Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
                }
                     JOptionPane.showMessageDialog(this,"Delete Successful","Successfull",JOptionPane.OK_OPTION);
                  
                    String s = "insert into cuet_almunai values(\'" + id_number + "\',\'" + name + "\'," + cgpa + ")";
                     System.out.println(s);
                try {
                    st.executeQuery(s);
                } catch (SQLException ex) {
                    Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
                }
                 JOptionPane.showMessageDialog(this,"insert Successful","Successfull",JOptionPane.OK_OPTION);
                }
                else if(count.equals("0"))
                {
                 JOptionPane.showMessageDialog(this,"ID NOT FOUND IN DATABASE","Error",JOptionPane.ERROR_MESSAGE); 
                }  
                else
                {
                 JOptionPane.showMessageDialog(this,"THIS STUDENT IS NOT COMPLETED HIS BSC IN CSE","Error",JOptionPane.ERROR_MESSAGE); 
                }  
            
            } 
                 
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
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(DeleteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteData().setVisible(true);
            }
        });
}              
                      
   
  }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_information_of_cuetcse;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RUKUNUJJAMAN MIAJI
 */ 
final class ACADEMICINFORMATIONFORASTUDENT extends JFrame 
{
    JButton SEARCH;
    JLabel  ID;
    private final javax.swing.JLabel jLabel1;
    private final javax.swing.JLabel jLabel2;
     JScrollPane jScrollPane;
    JScrollPane jScrollPane1;
    JTextField text_id;
    JFrame frame;
    JTable jTable;
    static Connection con;
    static Statement st;
    JComboBox jComboBox1;
    JComboBox jComboBox2;
    
    DefaultTableModel table_model;
    ResultSet result_set;
    ResultSetMetaData result_set_meta_data;
    
    ACADEMICINFORMATIONFORASTUDENT()
    {
     initComponent();
        
        frame = new JFrame("TO KNOW ABOUT ACADEMIC INFORMATION FOR A STUDENT");
       jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        ID = new javax.swing.JLabel();
        text_id = new javax.swing.JTextField();
        SEARCH = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("CHITTAGONG UNIVERSITY OF ENGINEERING TECHNOLOGY");

        jLabel2.setText("DEPARTMENT OF COMPUTER SCIENCE & ENGINEERING");

        jTable.setGridColor(new java.awt.Color(102, 102, 255));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        ID.setText("ID:");

        SEARCH.setText("ENTER");
        /*?SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });/*/
         SEARCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SEARCHKeyPressed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(14, 14, 14)))))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
    private void SEARCHKeyPressed(java.awt.event.KeyEvent evt)
    {                                  
    if (evt.getKeyCode()==KeyEvent.VK_ENTER){
             String id_number=text_id.getText();
            boolean a=isNumeric(id_number);
            if(id_number.equals(""))
            {
             JOptionPane.showMessageDialog(this,"Please Insert id_number","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(a==false)
            {
            JOptionPane.showMessageDialog(this,"Please check id_number and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
          try {
            st=con.createStatement();
        } catch (SQLException ex) 
        {
            Logger.getLogger(ACADEMICINFORMATIONFORASTUDENT.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
             
             String Query=("Select ACADEMIC_DEPT_INFO.ID,ACADEMIC_DEPT_INFO.TERM,COURSE_INFO.COURSE_NAME,ACADEMIC_DEPT_INFO.L_GRADE,ACADEMIC_DEPT_INFO.POINT\n" +
                                        "From ACADEMIC_DEPT_INFO\n" +
                                        "Join COURSE_INFO On ACADEMIC_DEPT_INFO.SUB_ID=COURSE_INFO.SUB_ID \n" +
                                        "where id=\'" + id_number + "\'");
             result_set=st.executeQuery(Query);
             System.out.println(Query);
        } catch (SQLException ex) 
        {
            Logger.getLogger(ACADEMICINFORMATIONFORASTUDENT.class.getName()).log(Level.SEVERE, null, ex);
        }
            try {
                 table_model=new SearchATableViewer1().showTable(result_set);
            } catch (SQLException ex) 
            {
                Logger.getLogger(ACADEMICINFORMATIONFORASTUDENT.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTable.setModel(table_model);    
        }
        }
    } 
    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {                                     
     UpdateData  item=new  UpdateData ();
       item.setVisible(true);// TODO add your handling code here:
    } 
   /*/ private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) 
    {                                       
                 String id_number=text_id.getText();
            boolean a=isNumeric(id_number);
            if(id_number.equals(""))
            {
             JOptionPane.showMessageDialog(this,"Please Insert id_number","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(a==false)
            {
            JOptionPane.showMessageDialog(this,"Please check id_number and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
          try {
            st=con.createStatement();
        } catch (SQLException ex) 
        {
            Logger.getLogger(ACADEMICINFORMATIONFORASTUDENT.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
             
             String Query=("Select ACADEMIC_DEPT_INFO.ID,ACADEMIC_DEPT_INFO.TERM,COURSE_INFO.COURSE_NAME,ACADEMIC_DEPT_INFO.L_GRADE,ACADEMIC_DEPT_INFO.POINT\n" +
                                        "From ACADEMIC_DEPT_INFO\n" +
                                        "Join COURSE_INFO On ACADEMIC_DEPT_INFO.SUB_ID=COURSE_INFO.SUB_ID \n" +
                                        "where id=\'" + id_number + "\'");
             result_set=st.executeQuery(Query);
             System.out.println(Query);
        } catch (SQLException ex) 
        {
            Logger.getLogger(ACADEMICINFORMATIONFORASTUDENT.class.getName()).log(Level.SEVERE, null, ex);
        }
            try {
                 table_model=new SearchATableViewer1().showTable(result_set);
            } catch (SQLException ex) 
            {
                Logger.getLogger(ACADEMICINFORMATIONFORASTUDENT.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTable.setModel(table_model);    
        }
    }/*/
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
            Logger.getLogger(ACADEMICINFORMATIONFORASTUDENT.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(ACADEMICINFORMATIONFORASTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ACADEMICINFORMATIONFORASTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ACADEMICINFORMATIONFORASTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ACADEMICINFORMATIONFORASTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACADEMICINFORMATIONFORASTUDENT().setVisible(true);
            }
        });
}
}

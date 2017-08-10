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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RUKUNUJJAMAN MIAJI
 */ 
class PERSONALINFORMATIONBYDISTRICT extends JFrame 
{
    JButton SEARCH;
    JLabel  DISTRICT_ID,SAMPLE_DISTRICT_ID;
    JScrollPane jScrollPane;
    JTextField DISTRICT_id;
    JFrame frame;
    JTable jTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    static Connection con;
    static Statement st;
    JComboBox jComboBox2;
    
    DefaultTableModel table_model;
    ResultSet result_set;
    ResultSetMetaData result_set_meta_data;
    
    PERSONALINFORMATIONBYDISTRICT()
    {
     initComponent();
        
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();


        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("CHITTAGONG UNIVERSITY OF ENGINEERING TECHNOLOGY");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("DEPARTMENT OF COMPUTER SCIENCE & ENGINEERING");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("VIEW DATA");

        jLabel4.setText("SAMPLE DISTRICT_ID:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1   Bagerhat", "2   Barguna", "3   Barisal", "4   Bhola", "5   Bandorban", "6   Brahmanbaria", "7   Bogra", "8   Chandpur", "9   Chittagong", "10 Chuadanga", "11 Comilla", "12 Cox's Bazar", "13 Dhaka", "14 Dinajpur", "15 Faridpur", "16 Feni", "17 Gaibandha", "18 Gazipur", "19 Gopalganj", "20 Habiganj", "21 Jaipurhat", "22 Jamalpur", "23 Jessore", "24 Jhalokathi", "25 Jhenaidah", "26 Khagrachari", "27 Khulna", "28 Kishoreganj", "29 Kurigram", "30 Khustia", "31 Lakshmipur", "32 Lalmonirhat", "33 Madaripur", "34 Magura", "35 Manikgonj", "36 Meherpur", "37 Moulvibazar", "38 Munshigonj", "39 Mymensingh", "40 Naogaon", "41 Narayanganj", "42 Narsindi", "43 Natore", "44 Nawabgonj", "45 Netrokona", "46 Nilphamari", "47 Noakhali", "48 Norial", "49 Pabna", "50 Panchagar", "51 Potuakhali", "52 Pirojpur", "53 Rajbari", "54 Rajshahi", "55 Rangamati", "56 Rangpur", "57 Shatkhira", "58 Shariyatpur", "59 Sherpur", "60 Shirajgonj", "61 Sunamgonj", "62 Shylhet", "63 Tangail", "64 Thakurgaon" }));

        jLabel5.setText("DISTRICT_ID:");

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel12.setBackground(new java.awt.Color(51, 255, 255));
        jLabel12.setFont(new java.awt.Font("Siyam Rupali", 2, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 255, 51));
        jLabel12.setText("CREATED BY MD.RUKUNUJJAMAN MIAJI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(401, 401, 401)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(219, 219, 219)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
    {                                         
            String id_number=jTextField1.getText();
            boolean a=isNumeric(id_number);
            if(id_number.equals(""))
            {
             JOptionPane.showMessageDialog(this,"Please Insert District_id","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(a==false)
            {
            JOptionPane.showMessageDialog(this,"Please check district_id and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
          try {
            st=con.createStatement();
        } catch (SQLException ex) 
        {
            Logger.getLogger(PERSONALINFORMATIONBYDISTRICT.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
             
             String Query=("select a.id,a.name,a.father_name,b.mother_name,b.mobile_no,a.BLOOD_GROUP\n" +
                           "from PERSONAL_INFORMATION a,PERSONAL_INFORMATION b\n" +
                           "where a.ID=b.ID and a.DISTRICT_ID="+id_number+"");
                    System.out.println(Query);
             result_set=st.executeQuery(Query);
        } catch (SQLException ex) 
        {
            Logger.getLogger(PERSONALINFORMATIONBYDISTRICT.class.getName()).log(Level.SEVERE, null, ex);
        }
            try {
                 table_model=new TableViewer().showTable(result_set);
            } catch (SQLException ex) 
            {
                Logger.getLogger(PERSONALINFORMATIONBYDISTRICT.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTable1.setModel(table_model);    
        }  // TODO add your handling code here:
    } 
    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {                                     
     UpdateData  item=new  UpdateData ();
       item.setVisible(true);// TODO add your handling code here:
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
            Logger.getLogger(PERSONALINFORMATIONBYDISTRICT.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(PERSONALINFORMATIONBYDISTRICT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PERSONALINFORMATIONBYDISTRICT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PERSONALINFORMATIONBYDISTRICT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PERSONALINFORMATIONBYDISTRICT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PERSONALINFORMATIONBYDISTRICT().setVisible(true);
            }
        });
}                   
}

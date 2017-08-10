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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RUKUNUJJAMAN MIAJI
 */
class STUDENTOVERALLCGPA extends JFrame 
{
   JButton ACADEMIC_DATA,PERSONAL_DATA;
   JFrame frame;
   JLabel label;
    JTextField text;
     JButton SEARCH;
    JLabel  ID,TERM;
    JTextField text_id;
    JTable jTable;
    private final javax.swing.JComboBox jComboBox1;
    private final javax.swing.JLabel jLabel1;
    private final javax.swing.JLabel jLabel2;
    private final javax.swing.JScrollPane jScrollPane1;
    static Connection con;
    static Statement st;
    
    DefaultTableModel table_model;
    ResultSet result_set;
    ResultSetMetaData result_set_meta_data;
    STUDENTOVERALLCGPA()
    {
        initComponent();
        
        frame = new JFrame("TO KNOW ABOUT ACADEMIC INFORMATION FOR A STUDENT");

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        ID = new javax.swing.JLabel();
        TERM = new javax.swing.JLabel();
        text_id = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        SEARCH = new javax.swing.JButton();


        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("CHITTAGONG UNIVERSITY OF ENGINEERING TECHNOLOGY");

        jLabel2.setText("DEPARTMENT OF COMPUTER SCIENCE & ENGINEERING");

        jScrollPane1.setViewportView(jTable);

        ID.setText("ID:");

        TERM.setText("TERM:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Term 1", "Term 2", "Term 3", "Term 4", "Term 5", "Term 6", "Term 7", "Term 8" }));

        SEARCH.setText("ENTER");
        SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SEARCH)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TERM, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel2)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_id, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TERM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(SEARCH)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>                        

    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {                                       
                 String id_number=text_id.getText();
            String term = jComboBox1.getSelectedItem().toString();
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
            Logger.getLogger(STUDENTOVERALLCGPA.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
             
             String Query=("Select round((SUM(ACADEMIC_DEPT_INFO.POINT*COURSE_INFO.credit_hour)/sum(COURSE_INFO.credit_hour)),2) as result\n" +
                           "From ACADEMIC_DEPT_INFO\n" +
                           "Join COURSE_INFO On ACADEMIC_DEPT_INFO.SUB_ID=COURSE_INFO.SUB_ID\n" +
                           "WHERE  ACADEMIC_DEPT_INFO.ID=\'" + id_number + "\' and academic_dept_info.term=\'" + term + "\'");
             System.out.println(Query);
             result_set=st.executeQuery(Query);
        } catch (SQLException ex) 
        {
            Logger.getLogger(STUDENTOVERALLCGPA.class.getName()).log(Level.SEVERE, null, ex);
        }
            try {
                 table_model=new TableViewer().showTable(result_set);
            } catch (SQLException ex) 
            {
                Logger.getLogger(STUDENTOVERALLCGPA.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTable.setModel(table_model);    
        }        // TODO add your handling code here:
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
            Logger.getLogger(STUDENTOVERALLCGPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}

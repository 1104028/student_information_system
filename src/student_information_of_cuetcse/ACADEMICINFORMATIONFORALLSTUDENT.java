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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author RUKUNUJJAMAN MIAJI
 */
final class ACADEMICINFORMATIONFORALLSTUDENT extends JFrame
{
    JPanel panel;
    JScrollPane jScrollPane1;
    JFrame frame;
    JTable jTable;
     private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    static Connection con;
    static Statement st;
    
    DefaultTableModel table_model;
    ResultSet result_set;
    ResultSetMetaData result_set_meta_data;
  ACADEMICINFORMATIONFORALLSTUDENT()
  {
        initComponent();
        frame = new JFrame("TO KNOW ABOUT ACADEMIC INFORMATION FOR ALL STUDENT");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

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
                                .addComponent(jLabel2)))
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();                      

          try {
            st=con.createStatement();
        } catch (SQLException ex) 
        {
            Logger.getLogger(ACADEMICINFORMATIONFORALLSTUDENT.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
             
             result_set=st.executeQuery("Select ACADEMIC_DEPT_INFO.ID,ACADEMIC_DEPT_INFO.TERM,COURSE_INFO.COURSE_NAME,ACADEMIC_DEPT_INFO.L_GRADE,ACADEMIC_DEPT_INFO.POINT,COURSE_INFO.credit_hour\n" +
                                        "From ACADEMIC_DEPT_INFO\n" +
                                        "Join COURSE_INFO On ACADEMIC_DEPT_INFO.SUB_ID=COURSE_INFO.SUB_ID");
        } catch (SQLException ex) 
        {
            Logger.getLogger(ACADEMICINFORMATIONFORALLSTUDENT.class.getName()).log(Level.SEVERE, null, ex);
        }
            try {
                table_model=new TableViewer().showTable(result_set);
            } catch (SQLException ex) 
            {
                Logger.getLogger(ACADEMICINFORMATIONFORALLSTUDENT.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTable.setModel(table_model);  
           
  }
  private void jTableMouseClicked(java.awt.event.MouseEvent evt) {                                     
     Administrator  item=new  Administrator ();
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
            Logger.getLogger(ACADEMICINFORMATIONFORALLSTUDENT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}

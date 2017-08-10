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
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author RUKUNUJJAMAN MIAJI
 */
class FORALLSTUDENTSCGPA extends JFrame
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
    
  FORALLSTUDENTSCGPA()
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

        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
          try {
            st=con.createStatement();
        } catch (SQLException ex) 
        {
            Logger.getLogger(FORALLSTUDENTSCGPA.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
             
             String Query=("select c.id,round((SUM(c.POINT*c.credit_hour)/sum(c.credit_hour)),2) as result, \n" +
                                        "(CASE \n" +
                                        "   WHEN (SUM(c.POINT*c.credit_hour)/sum(c.credit_hour))<=4.00 and (SUM(c.POINT*c.credit_hour)/sum(c.credit_hour))>=3.75  THEN 'BEST'\n" +
                                        "   WHEN (SUM(c.POINT*c.credit_hour)/sum(c.credit_hour))<3.75  and (SUM(c.POINT*c.credit_hour)/sum(c.credit_hour))>=3.50  THEN 'BETTER'\n" +
                                        "   WHEN (SUM(c.POINT*c.credit_hour)/sum(c.credit_hour))<3.50  and (SUM(c.POINT*c.credit_hour)/sum(c.credit_hour))>=3.00  THEN 'GOOD'\n" +
                                        "   WHEN (SUM(c.POINT*c.credit_hour)/sum(c.credit_hour))<3.00  and (SUM(c.POINT*c.credit_hour)/sum(c.credit_hour))>=2.00  THEN 'NORMAL'\n" +
                                        "   ELSE 'FAIL STUDENT'\n" +
                                        "  END)as student_quality\n" +
                                        " FROM (Select a.ID,a.TERM,COURSE_INFO.COURSE_NAME,a.L_GRADE,a.POINT,course_info.credit_hour\n" +
                                        " From ACADEMIC_DEPT_INFO a\n" +
                                        " Join COURSE_INFO On a.SUB_ID=COURSE_INFO.SUB_ID) c\n" +
                                        " group by c.id");
             System.out.println(Query);
             result_set= st.executeQuery(Query);
        } catch (SQLException ex) 
        {
            Logger.getLogger(FORALLSTUDENTSCGPA.class.getName()).log(Level.SEVERE, null, ex);
        }
            try{
                table_model=new TableViewer().showTable(result_set);
            } catch (SQLException ex) 
            {
                Logger.getLogger(FORALLSTUDENTSCGPA.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTable.setModel(table_model);  
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
            Logger.getLogger(FORALLSTUDENTSCGPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}

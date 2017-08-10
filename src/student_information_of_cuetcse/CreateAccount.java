/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student_information_of_cuetcse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author RUKUNUJJAMAN MIAJI
 */
class CreateAccount extends JFrame implements ActionListener
{
   JButton CREATE;
   JLabel NAME,PASSWORD;
   JTextField text_name,text_password;
   JFrame frame;
   static Connection con;
    static Statement st;
   CreateAccount()
   {
     initComponent();
        
        frame = new JFrame("CREATE A NEW ACCOUNT");
        frame.setLayout(null);
        JPanel panel = new JPanel();

        NAME = new JLabel();
        NAME.setBounds(100,100, 100, 30);
        frame.add(NAME);
        NAME.setText("NAME:");
        text_name = new JTextField(50);
        text_name.setBounds(200,100, 150, 30);
        frame.add(text_name);

        PASSWORD = new JLabel();
        PASSWORD.setText("PASSWORD:");
        PASSWORD.setBounds(100, 150, 100, 30);
        frame.add(PASSWORD);
        text_password = new JPasswordField(50);
        text_password.setBounds(200, 150, 150, 30);
        frame.add(text_password);
        
        CREATE = new JButton("CREATE");
        CREATE.setBounds(300,200, 100, 30);
        frame.add(CREATE);
        CREATE.addActionListener(this);
        
         frame.setVisible(true);
         frame.setLocation(500,200);
        frame.setSize(500,400);
   }
    public void actionPerformed(ActionEvent ae) 
    {
        String s = ae.getActionCommand();
   if (s.equals("CREATE"))
        {
            String value1 = text_name.getText();
            String value2 = text_password.getText();
             if(value1.equals("") || value2.equals(""))
             {
                  JOptionPane.showMessageDialog(this, "Please Enter name And password ", "Error", JOptionPane.ERROR_MESSAGE);
            
             }
             else
             {
             try {
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            } catch (SQLException ex) 
            {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {

                String query = "insert into create_account values(\'" + value1 + "\',\'" + value2 + "\')";
                 st.executeQuery(query);
                   JOptionPane.showMessageDialog(this, "ACCOUNT CREATED", "Success", JOptionPane.OK_OPTION);
                    frame.setVisible(false);
            } catch (SQLException ex)
            {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

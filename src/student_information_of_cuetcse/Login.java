package student_information_of_cuetcse;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class Login extends JFrame implements ActionListener {

    JButton SUBMIT, CREATE_ACCOUNT;
    JPanel panel;
    JLabel label1, label2;
    JFrame frame;
    JTable jTable;
    static Connection con;
    static Statement st;
    DefaultTableModel table_model;
    ResultSet result_set;
    ResultSetMetaData result_set_meta_data;
    final JTextField text1, text2;

    Login() 
    {
         initComponent();
        JFrame frame=new JFrame();
        label1 = new JLabel();
        label1.setText("Username:");
        
        text1 = new JTextField(15);

        label2 = new JLabel();
        label2.setText("Password:");
        text2 = new JPasswordField(15);
        this.setLayout(new BorderLayout());

        SUBMIT = new JButton("SUBMIT");
        CREATE_ACCOUNT = new JButton("CREATE_ACCOUNT");

        panel = new JPanel(new GridLayout(3, 1));
        panel.add(label1);
        panel.add(text1);
        panel.add(label2);
        panel.add(text2);
        panel.add(SUBMIT);
        panel.add(CREATE_ACCOUNT);
        add(panel, BorderLayout.CENTER);
        SUBMIT.addActionListener(this);
       CREATE_ACCOUNT.addActionListener(this);
        setTitle("LOGIN FORM");
        setIconImage(new ImageIcon("n.png").getImage());
        frame.add(panel);
        frame.setSize(400, 150);
        frame.setLocation(500,250);
        frame.setVisible(true);
   
    }

    public void actionPerformed(ActionEvent ae) 
    {
        String s = ae.getActionCommand();
        String name ="";
        String password="";
        if (s.equals("SUBMIT"))
        {
            String value1 = text1.getText();
            String value2 = text2.getText();
            if(value1.equals("")&&value2.equals(""))
            {
              JOptionPane.showMessageDialog(this, "Please insert Name And Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
            try {
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {

                String query = ("SELECT * FROM CREATE_ACCOUNT where NAME= \'" + value1 + "\'and PASSWORD=\'" + value2 + "\' ");
                result_set = st.executeQuery(query);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while (result_set.next()) {
                    name = result_set.getString("name");
                    password = result_set.getString("password");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (value1.equals(name) && value2.equals(password)) 
            {
              try{
               DepartmentComputer   page = new DepartmentComputer();
               page.setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
              // frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect login or password or create a new account", "Error", JOptionPane.ERROR_MESSAGE);
            }
            }
          
        }
        else if(s.equals("CREATE_ACCOUNT"))
        {
          CreateAccount account=new CreateAccount();
        }   


    }

    public void initComponent() {
        try {
            con = MakeConnection.getDatabaseConnection();
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Database Connected");
        }
        try {
            st = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}

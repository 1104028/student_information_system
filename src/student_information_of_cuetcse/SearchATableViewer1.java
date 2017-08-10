/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student_information_of_cuetcse;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RUKUNUJJAMAN MIAJI
 */
class SearchATableViewer1 extends JFrame 
{

    DefaultTableModel table_model1;
      ResultSetMetaData result_set_meta_data1;
      int j=0;
    @SuppressWarnings("empty-statement")
      public DefaultTableModel showTable(ResultSet result_set) throws SQLException
      {
        table_model1=new DefaultTableModel();
        result_set_meta_data1=result_set.getMetaData();
        int column =result_set_meta_data1.getColumnCount();
        Object row[]=new Object[column];
        for(int i=0;i<column;i++)
        {
            row[i]=result_set_meta_data1.getColumnName(i+1);
            table_model1.addColumn(row[i]);
        }
        //table_model1.addRow(row);
        while(result_set.next())
        {
            for(int i=0;i<column;i++)
            {
                row[i]=result_set.getString(i+1);
                j++;
            }
            table_model1.addRow(row);
        }
        if(j>0)
        {
         table_model1=table_model1;
        }
        else
        {
         JOptionPane.showMessageDialog(this,"Id Not Found In Database","Error",JOptionPane.ERROR_MESSAGE);
        }
        return table_model1;
      }
    
}

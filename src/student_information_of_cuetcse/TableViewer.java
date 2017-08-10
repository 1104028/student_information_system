/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student_information_of_cuetcse;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RUKUNUJJAMAN MIAJI
 */
class TableViewer 
{
 DefaultTableModel table_model;
      ResultSetMetaData result_set_meta_data;
    public DefaultTableModel showTable(ResultSet result_set) throws SQLException
      {
        table_model=new DefaultTableModel();
        result_set_meta_data=result_set.getMetaData();
        int column =result_set_meta_data.getColumnCount();
        Object row[]=new Object[column];
        for(int i=0;i<column;i++)
        {
            row[i]=result_set_meta_data.getColumnName(i+1);
            table_model.addColumn(row[i]);
        }
       // table_model.addRow(row);
        while(result_set.next())
        {
            for(int i=0;i<column;i++)
            {
                row[i]=result_set.getString(i+1);
            }
            table_model.addRow(row);
        }
      return table_model;
      }
    
}

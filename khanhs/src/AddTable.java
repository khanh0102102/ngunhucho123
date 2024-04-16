import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;




public class AddTable {
	
	public void AddTable_BangLuong(View v) {		
		JTable table_BangLuong = v.getTable_BangLuong();
	
		try {
			Connection connection = ConnectionDatabase.connect();
			if (connection != null) {
				String sql = "SELECT * FROM BangLuong";
				ResultSet resultSet = ConnectionDatabase.executeQuery(sql, connection);

				DefaultTableModel tableModel = new DefaultTableModel();

				ResultSetMetaData metaData = resultSet.getMetaData();
				int columnCount1 = metaData.getColumnCount();

				for (int columnIndex = 1; columnIndex <= columnCount1; columnIndex++) {
                tableModel.addColumn(metaData.getColumnName(columnIndex));
				}

				while (resultSet.next()) {
					Object[] rowData = new Object[columnCount1];
					for (int columnIndex = 1; columnIndex <= columnCount1; columnIndex++) {
						rowData[columnIndex - 1] = resultSet.getObject(columnIndex);
					}
					tableModel.addRow(rowData);
				}
				
				table_BangLuong.setModel(tableModel);

				for (int columnIndex = 0; columnIndex < table_BangLuong.getColumnCount(); columnIndex++) {
					TableColumn column = table_BangLuong.getColumnModel().getColumn(columnIndex);
					int maxWidth = 0;
					for (int rowIndex = 0; rowIndex < table_BangLuong.getRowCount(); rowIndex++) {
						TableCellRenderer cellRenderer = table_BangLuong.getCellRenderer(rowIndex, columnIndex);
						Object value = table_BangLuong.getValueAt(rowIndex, columnIndex);
						Component cellComponent = cellRenderer.getTableCellRendererComponent(v.getTable_MucLuong(), value, false, false, rowIndex, columnIndex);
						maxWidth = Math.max(cellComponent.getPreferredSize().width, maxWidth);
					}
					column.setPreferredWidth(maxWidth + 3); 
				}
            
				DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
				centerRenderer.setHorizontalAlignment(JLabel.CENTER);
				for (int i = 0; i < table_BangLuong.getColumnCount(); i++) {
					if(i != 1) {
						table_BangLuong.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
					}      
				}

            
				ConnectionDatabase.disconnect(connection);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}	
	
	public void AddTable_MucLuong(View v) {
		JTable table_MucLuong = v.getTable_MucLuong();
	
		try {
	        Connection connection = ConnectionDatabase.connect();
	        if (connection != null) {
	            String sql = "SELECT * FROM MucLuong";
	            ResultSet resultSet = ConnectionDatabase.executeQuery(sql, connection);

	            DefaultTableModel tableModel = new DefaultTableModel();

	            ResultSetMetaData metaData1 = resultSet.getMetaData();
	            int columnCount1 = metaData1.getColumnCount();

	            for (int columnIndex = 1; columnIndex <= columnCount1; columnIndex++) {
	                tableModel.addColumn(metaData1.getColumnName(columnIndex));
	            }

	            while (resultSet.next()) {
	                Object[] rowData = new Object[columnCount1];
	                for (int columnIndex = 1; columnIndex <= columnCount1; columnIndex++) {
	                    rowData[columnIndex - 1] = resultSet.getObject(columnIndex);
	                }
	                tableModel.addRow(rowData);
	            }
	            
	            table_MucLuong.setModel(tableModel);

	            for (int columnIndex = 0; columnIndex < table_MucLuong.getColumnCount(); columnIndex++) {
	                TableColumn column = table_MucLuong.getColumnModel().getColumn(columnIndex);
	                int maxWidth = 0;
	                for (int rowIndex = 0; rowIndex < table_MucLuong.getRowCount(); rowIndex++) {
	                    TableCellRenderer cellRenderer = table_MucLuong.getCellRenderer(rowIndex, columnIndex);
	                    Object value = table_MucLuong.getValueAt(rowIndex, columnIndex);
	                    Component cellComponent = cellRenderer.getTableCellRendererComponent(table_MucLuong, value, false, false, rowIndex, columnIndex);
	                    maxWidth = Math.max(cellComponent.getPreferredSize().width, maxWidth);
	                }
	                column.setPreferredWidth(maxWidth + 10); 
	            }
	            
	            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
	            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
	            for (int i = 0; i < table_MucLuong.getColumnCount(); i++) {
	            		table_MucLuong.getColumnModel().getColumn(i).setCellRenderer(centerRenderer); 
	            }

	            
	            ConnectionDatabase.disconnect(connection);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	

	public static DefaultTableModel AddTable_bill(String tablebill) {
		DefaultTableModel tableModel = new DefaultTableModel();
		
		try {
            // Thiết lập kết nối đến CSDL (thay đổi thông tin kết nối của bạn)
			Connection connection = ConnectionDatabase.connect();
            // Truy vấn CSDL để lấy dữ liệu
            String sql = "SELECT * FROM " + tablebill;
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            

            // Lấy thông tin về metadata của ResultSet để biết số cột
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Tạo các cột trong tableModel dựa trên metadata của ResultSet
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(metaData.getColumnName(i));
            }
            
            float tong = 0;
            // Đọc dữ liệu từ ResultSet và thêm vào tableModel
            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = resultSet.getObject(i);
                    
                }             
                tong += resultSet.getFloat("thanh_tien");
                tableModel.addRow(rowData);
            }
            String texttong = Float.toString(tong);
            
            try {
				View.lblthanhtien.setText(texttong);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            
            
            // Đóng tài nguyên (ResultSet, PreparedStatement và Connection)
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		return tableModel;

        // Hiển thị frame
	}

}

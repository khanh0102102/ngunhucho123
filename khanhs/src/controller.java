import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class controller {
	static View v;
	static void saveImage(BufferedImage image, String filename) {
        try {
            File file = new File(filename);
            ImageIO.write(image, "png", file); // Lưu BufferedImage vào file ở định dạng PNG
            System.out.println("Panel saved to: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
	static void openFile(String filename) {
        try {
            File file = new File(filename);
            Desktop.getDesktop().open(file); // Mở file bằng ứng dụng mặc định
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
    }
	public static void insert(model md, String tablebill) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionDatabase.connect(); // Thiết lập kết nối đến cơ sở dữ liệu
            String sql = "INSERT INTO " + tablebill + " (ten_ban, don_gia, so_luong, thanh_tien) VALUES (?, ?, ?, ?)";

            statement = connection.prepareStatement(sql);
            statement.setString(1, md.getTenhang());
            statement.setInt(2, md.getDongia());
            statement.setInt(3, md.getSoluong());
            statement.setFloat(4, md.getThanhtien());

            statement.executeUpdate(); // Thực hiện câu lệnh INSERT

        } catch (SQLException e) {
            e.printStackTrace(); // Xử lý ngoại lệ bằng cách in thông tin lỗi ra console
            throw e; // Ném lại ngoại lệ để xử lý ở cấp độ gọi hàm
        } finally {
            // Đóng tài nguyên trong khối finally để giải phóng kết nối cơ sở dữ liệu
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
	public void searchInfo() {
		JTextField tf1 = v.getID();
		JTextField tf2 = v.getHVT();
		JTextField tf3 = v.getVTCV2();
		JTextField tf4 = v.getSNC();
		JTextField tf5 = v.getTL();

        try {
            Connection connection = ConnectionDatabase.connect();
            if (connection != null) {
                String id = tf1.getText(); 
                String sql = "SELECT * FROM BangLuong WHERE ID = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    tf2.setText(resultSet.getString("Họ và tên"));
                    tf3.setText(resultSet.getString("Vị trí công việc"));
                    tf4.setText(resultSet.getString("Số ngày công"));
                    tf5.setText(resultSet.getString("Tiền lương"));
                } else {
                    JOptionPane.showMessageDialog(null, "Bạn đã nhập sai ID");
                }
                ConnectionDatabase.disconnect(connection);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
	
	public static void update(String tablebill, JTable table_bill, int up) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
 
        String sql = "UPDATE " + tablebill + " SET so_luong = ? WHERE ten_ban = ?";

        int selectedIndex = table_bill.getSelectedRow();

        if (selectedIndex != -1) {
            DefaultTableModel model = (DefaultTableModel) table_bill.getModel();        

            String tenBan = (String) model.getValueAt(selectedIndex, 0);
            // Bây giờ 'rowData' chứa dữ liệu của hàng được chọn
            connection = ConnectionDatabase.connect(); // Thiết lập kết nối đến cơ sở dữ liệu
            
            statement = connection.prepareStatement(sql);
            
            statement.setInt(1, up);
            statement.setString(2, tenBan);


            statement.executeUpdate(); // Thực hiện câu lệnh UPDATE
        }else {
        	System.out.println("ngu");
        }    
            	
 
    }
	
	public static void delete(String tablebill, JTable table_bill) throws SQLException {
	    Connection connection = null;
	    PreparedStatement statement = null;

	    String sql = "DELETE FROM " + tablebill + " WHERE ten_ban = ?";

	    int selectedIndex = table_bill.getSelectedRow();

	    if (selectedIndex != -1) {
	        try {
	            DefaultTableModel model = (DefaultTableModel) table_bill.getModel();

	            // Lấy giá trị của cột 'ten_ban' từ hàng được chọn
	            String tenBan = (String) model.getValueAt(selectedIndex, 0); // Giả sử 'ten_ban' là cột đầu tiên (cột 0)

	            connection = ConnectionDatabase.connect(); // Thiết lập kết nối đến cơ sở dữ liệu
	            statement = connection.prepareStatement(sql);

	            // Đặt tham số trong câu lệnh DELETE
	            statement.setString(1, tenBan);

	            // Thực hiện câu lệnh DELETE
	            int rowsDeleted = statement.executeUpdate();

	            if (rowsDeleted > 0) {
	                System.out.println("Xóa thành công hàng có tên bàn: " + tenBan);
	                // Nếu muốn cập nhật lại JTable sau khi xóa, bạn có thể làm điều đó ở đây
	            } else {
	                System.out.println("Không có hàng nào được xóa.");
	            }
	        } finally {
	            // Đóng tài nguyên (PreparedStatement và Connection)
	            if (statement != null) {
	                statement.close();
	            }
	            if (connection != null) {
	                connection.close();
	            }
	        }
	    } else {
	        System.out.println("Vui lòng chọn một hàng để xóa.");
	    }
	}
	
}

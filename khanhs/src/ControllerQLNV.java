import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControllerQLNV {
	View v;
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
}

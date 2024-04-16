import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class CaculatorJrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	String tablebill;
	View v;

	public CaculatorJrame(JTable table_bill) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		setBounds(100, 000, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 563);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField("1");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textField.setBounds(125, 70, 200, 60);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btn000 = new JButton("000");
		btn000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				textField.setText(textField.getText() + "000");
			}
		});
		btn000.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn000.setBounds(10, 477, 94, 75);
		panel.add(btn000);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn1.setBounds(10, 391, 94, 75);
		panel.add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn4.setBounds(10, 305, 94, 75);
		panel.add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn7.setBounds(10, 219, 94, 75);
		panel.add(btn7);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn0.setBounds(114, 477, 94, 75);
		panel.add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn2.setBounds(114, 391, 94, 75);
		panel.add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn5.setBounds(114, 305, 94, 75);
		panel.add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn8.setBounds(114, 219, 94, 75);
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn9.setBounds(218, 219, 94, 75);
		panel.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn6.setBounds(218, 305, 94, 75);
		panel.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn3.setBounds(218, 391, 94, 75);
		panel.add(btn3);
		
		JButton btn_clear = new JButton("Reset");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btn_clear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_clear.setBounds(218, 477, 94, 75);
		panel.add(btn_clear);
		
		JButton btn_xoa = new JButton("Xóa");
		btn_xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();
                if (!currentText.isEmpty()) {
                    textField.setText(currentText.substring(0, currentText.length() - 1));
                }
			}
		});
		btn_xoa.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn_xoa.setBounds(322, 219, 104, 161);
		panel.add(btn_xoa);
		

		JButton btn_ok = new JButton("Ok");
		btn_ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int up = Integer.parseInt(textField.getText());
				
				JLabel ngu = View.getLblban();
				for (int i = 1; i < 21; i++) {
				    if (ngu.getText().equals("Bàn " + i)) {
				        tablebill = "bill_ban" + i;
				        break;
				    }
				}
				
				System.out.println(tablebill + "nguuuuu");
				try {
					
					controller.update(tablebill, table_bill, up);
					DefaultTableModel modelk = AddTable.AddTable_bill(tablebill);
					table_bill.setModel(modelk);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_ok.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn_ok.setBounds(322, 391, 104, 161);
		panel.add(btn_ok);
		
		JButton bt_Tru = new JButton("-");
		bt_Tru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				if(a > 0) {
					int b = Integer.parseInt(textField.getText()) - 1;				
					textField.setText(b + "");
				}			
			}
		});
		bt_Tru.setBounds(67, 75, 50, 50);
		panel.add(bt_Tru);
		
		JButton bt_COng = new JButton("+");
		bt_COng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());		
				int b = Integer.parseInt(textField.getText()) + 1;				
				textField.setText(b + "");
			}
		});
		bt_COng.setBounds(335, 75, 50, 50);
		panel.add(bt_COng);

	}
}
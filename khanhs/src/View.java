
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;



public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton QL_Order;
	private JButton QL_Kho;
	private JButton QL_NV;
	
	private JTable table_bill;
	
	private JPanel panel_tang;
	private JPanel cardPanel_2;
	private JPanel cardPanel_TrangOder;
	private JPanel cardPanel_Kho;
	private JPanel cardPanel_QLNV;
	private JPanel cardPanel_tang;
	private JPanel panel_tang1;
	private JButton butonban1;
	private JButton butonban2;
	private JButton butonban3;
	private JButton butonban4;
	private JButton butonban5;
	private JButton butonban6;
	private JButton butonban7;
	private JButton butonban9;
	private JButton butonban8;
	private JButton butonban10;
	private JPanel panel_Mon;
	private JButton bt_Nuoc;
	private JPanel cardPanel_mon;
	private JPanel panel_Nuong;
	private JPanel panel_Lau;
	private JPanel panel_MonChinh;
	private JPanel panel_TrangMieng;
	private JPanel card_Panel_bill;
	private JButton bt_Nuong;
	private JButton bt_Lau;
	private JButton bt_MonChinh;
	private JButton bt_TrangMieng;
	private JPanel panel_Nuoc;
	private static JLabel lblban;
	
	public static JLabel getLblban() {
		return lblban;
	}

	public void setLblban(JLabel lblban) {
		this.lblban = lblban;
	}

	private JButton bt_Tang1;
	private JButton bt_Tang2;
	private JPanel panel_tang2;
	private JButton bt_ChinhSua;
	private JButton butonban1_2;
	private JButton butonban2_2;
	private JButton butonban3_2;
	private JButton butonban4_2;
	private JButton butonban5_2;
	private JButton butonban6_2;
	private JButton butonban7_2;
	private JButton butonban9_2;
	private JButton butonban8_2;
	private JButton butonban10_2;
	private JTable table_BangLuong;
	private JTable table_MucLuong;
	private JButton bt_Nuoc1;
	private JButton bt_Nuoc2;
	private JButton bt_Nuoc3;
	private JButton bt_Nuoc4;
	private JButton bt_Nuoc5;
	private JButton bt_Nuoc6;
	private JButton bt_Nuoc7;
	private JButton bt_Nuoc8;
	private JButton bt_TrangMieng1;
	private JButton bt_TrangMieng2;
	private JButton bt_TrangMieng3;
	private JButton bt_TrangMieng4;
	private JButton bt_TrangMieng5;
	private JButton bt_TrangMieng6;
	private JButton bt_TrangMieng7;
	private JButton bt_TrangMieng8;
	private JTextField tf_VTCV;
	private JTextField tf_ML;
	private JButton bt_TinhLuong;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton bt_Tim;
	private JButton bt_ChinSua;
	private JButton bt_Xoa2;
	private JButton bt_Chinh1;
	private JButton bt_Chinh2;
	private JButton bt_Chinh3;
	private JButton bt_Chinh4;
	private JButton bt_Chinh5;
	private JButton bt_Chinh6;
	private JButton bt_Chinh7;
	private JButton bt_Chinh8;
	private JButton bt_Lau1;
	private JButton bt_Lau2;
	private JButton bt_Lau3;
	private JButton bt_Lau4;
	private JButton bt_Lau5;
	private JButton bt_Lau6;
	private JButton bt_Lau7;
	private JButton bt_Lau8;
	private JButton bt_Nuong1;
	private JButton bt_Nuong2;
	private JButton bt_Nuong3;
	private JButton bt_Nuong4;
	private JButton bt_Nuong5;
	private JButton bt_Nuong6;
	private JButton bt_Nuong7;
	private JButton bt_Nuong8;
	private JPanel panel;
	private JButton bt_In;
	private JScrollPane scrollPane_bill;
	private JLabel lbl2_Ban12;
	private JLabel lbl2_Ban13;
	private JLabel lbl2_Ban14;
	private JLabel lbl2_Ban15;
	private JLabel lbl2_Ban16;
	private JLabel lbl2_Ban17;
	private JLabel lbl2_Ban18;
	private JLabel lbl2_Ban19;
	private JLabel lbl2_Ban20;
	private JPanel pannel_logo;
	static JLabel lblthanhtien;
	
	String tablebill;
	
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1574, 821);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1560, 50);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		QL_Order = new JButton("Trang Order");
		QL_Order.setBackground(new Color(255, 0, 0));
		QL_Order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel_TrangOder.setVisible(true);
				cardPanel_Kho.setVisible(false);
				cardPanel_QLNV.setVisible(false);
			}
		});
		QL_Order.setBounds(0, 0, 192, 50);
		panel_1.add(QL_Order);
		
		QL_Kho = new JButton("Trang QL Kho");
		QL_Kho.setBackground(new Color(0, 128, 255));
		QL_Kho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel_TrangOder.setVisible(false);
				cardPanel_Kho.setVisible(true);
				cardPanel_QLNV.setVisible(false);				
			}
		});
		QL_Kho.setBounds(192, 0, 192, 50);
		panel_1.add(QL_Kho);
		
		QL_NV = new JButton("Trang QL NV");
		QL_NV.setBackground(new Color(0, 255, 64));
		QL_NV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel_TrangOder.setVisible(false);
				cardPanel_Kho.setVisible(false);
				cardPanel_QLNV.setVisible(true);
			}
		});
		QL_NV.setBounds(384, 0, 192, 50);
		panel_1.add(QL_NV);
		
		cardPanel_2 = new JPanel();
		cardPanel_2.setBounds(0, 50, 1558, 733);
		contentPane.add(cardPanel_2);
		cardPanel_2.setLayout(new CardLayout(0, 0));
		
		cardPanel_TrangOder = new JPanel();
		cardPanel_TrangOder.setLayout(null);
		cardPanel_2.add(cardPanel_TrangOder, "name_1003617356376700");
		cardPanel_TrangOder.setVisible(true);
		
		cardPanel_tang = new JPanel();
		cardPanel_tang.setBounds(0, 47, 1070, 334);
		cardPanel_TrangOder.add(cardPanel_tang);
		cardPanel_tang.setLayout(new CardLayout(0, 0));
		
		panel_tang1 = new JPanel();
		panel_tang1.setLayout(null);
		panel_tang1.setBackground(Color.RED);
		cardPanel_tang.add(panel_tang1, "name_1003797966362000");
		panel_tang1.setVisible(true);
		
		butonban1 = new JButton("Bàn 1");
		butonban1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 1");
				card_Panel_bill.setVisible(true);
				tablebill = "bill_ban1";
				DefaultTableModel modelk = AddTable.AddTable_bill(tablebill);
		        table_bill.setModel(modelk);
			}
		});
		butonban1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban1.setBounds(60, 24, 94, 86);
		panel_tang1.add(butonban1);
		
		butonban2 = new JButton("Bàn 2");
		butonban2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 2");
				card_Panel_bill.setVisible(true);
				tablebill = "bill_ban2";
				DefaultTableModel modelk = AddTable.AddTable_bill(tablebill);
		        table_bill.setModel(modelk);
				
			}
		});
		butonban2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban2.setBounds(274, 24, 94, 86);
		panel_tang1.add(butonban2);
		
		butonban3 = new JButton("Bàn 3");
		butonban3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 3");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban3.setBounds(488, 24, 94, 86);
		panel_tang1.add(butonban3);
		
		butonban4 = new JButton("Bàn 4");
		butonban4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 4");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban4.setBounds(702, 24, 94, 86);
		panel_tang1.add(butonban4);
		
		butonban5 = new JButton("Bàn 5");
		butonban5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 5");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban5.setBounds(916, 24, 94, 86);
		panel_tang1.add(butonban5);
		
		butonban6 = new JButton("Bàn 6");
		butonban6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 6");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban6.setBounds(60, 176, 94, 86);
		panel_tang1.add(butonban6);
		
		butonban7 = new JButton("Bàn 7");
		butonban7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 7");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban7.setBounds(274, 176, 94, 86);
		panel_tang1.add(butonban7);
		
		butonban9 = new JButton("Bàn 9");
		butonban9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 9");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban9.setBounds(702, 176, 94, 86);
		panel_tang1.add(butonban9);
		
		butonban8 = new JButton("Bàn 8");
		butonban8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 8");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban8.setBounds(488, 176, 94, 86);
		panel_tang1.add(butonban8);
		
		butonban10 = new JButton("Bàn 10");
		butonban10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 10");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban10.setBounds(916, 176, 96, 86);
		panel_tang1.add(butonban10);
		
		JLabel lbl1_Ban1 = new JLabel("Bàn 1");
		lbl1_Ban1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban1.setBounds(60, 111, 96, 30);
		panel_tang1.add(lbl1_Ban1);
		
		JLabel lbl1_Ban2 = new JLabel("Bàn 2");
		lbl1_Ban2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban2.setBounds(274, 111, 96, 30);
		panel_tang1.add(lbl1_Ban2);
		
		JLabel lbl1_Ban3 = new JLabel("Bàn 3");
		lbl1_Ban3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban3.setBounds(488, 111, 96, 30);
		panel_tang1.add(lbl1_Ban3);
		
		JLabel lbl1_Ban4 = new JLabel("Bàn 4");
		lbl1_Ban4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban4.setBounds(702, 111, 96, 30);
		panel_tang1.add(lbl1_Ban4);
		
		JLabel lbl1_Ban5 = new JLabel("Bàn 5");
		lbl1_Ban5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban5.setBounds(916, 111, 96, 30);
		panel_tang1.add(lbl1_Ban5);
		
		JLabel lbl1_Ban6 = new JLabel("Bàn 6");
		lbl1_Ban6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban6.setBounds(60, 262, 96, 30);
		panel_tang1.add(lbl1_Ban6);
		
		JLabel lbl1_Ban7 = new JLabel("Bàn 7");
		lbl1_Ban7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban7.setBounds(274, 262, 96, 30);
		panel_tang1.add(lbl1_Ban7);
		
		JLabel lbl1_Ban8 = new JLabel("Bàn 8");
		lbl1_Ban8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban8.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban8.setBounds(488, 262, 96, 30);
		panel_tang1.add(lbl1_Ban8);
		
		JLabel lbl1_Ban9 = new JLabel("Bàn 9");
		lbl1_Ban9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban9.setBounds(702, 262, 96, 30);
		panel_tang1.add(lbl1_Ban9);
		
		JLabel lbl1_Ban10 = new JLabel("Bàn 10");
		lbl1_Ban10.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban10.setBounds(916, 262, 96, 30);
		panel_tang1.add(lbl1_Ban10);
		
		panel_tang2 = new JPanel();
		panel_tang2.setLayout(null);
		panel_tang2.setBackground(new Color(0, 64, 0));
		cardPanel_tang.add(panel_tang2, "name_1003797975289700");
		panel_tang2.setVisible(false);
		
		butonban1_2 = new JButton("Bàn 11");
		butonban1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 11");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban1_2.setBounds(60, 24, 96, 86);
		panel_tang2.add(butonban1_2);
		
		butonban2_2 = new JButton("Bàn 12");
		butonban2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 12");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban2_2.setBounds(274, 24, 96, 86);
		panel_tang2.add(butonban2_2);
		
		butonban3_2 = new JButton("Bàn 13");
		butonban3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 13");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban3_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban3_2.setBounds(488, 24, 96, 86);
		panel_tang2.add(butonban3_2);
		
		butonban4_2 = new JButton("Bàn 14");
		butonban4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 14");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban4_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban4_2.setBounds(702, 24, 96, 86);
		panel_tang2.add(butonban4_2);
		
		butonban5_2 = new JButton("Bàn 15");
		butonban5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 15");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban5_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban5_2.setBounds(916, 24, 96, 86);
		panel_tang2.add(butonban5_2);
		
		butonban6_2 = new JButton("Bàn 16");
		butonban6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 16");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban6_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban6_2.setBounds(60, 176, 96, 86);
		panel_tang2.add(butonban6_2);
		
		butonban7_2 = new JButton("Bàn 17");
		butonban7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 17");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban7_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban7_2.setBounds(274, 176, 96, 86);
		panel_tang2.add(butonban7_2);
		
		butonban9_2 = new JButton("Bàn 19");
		butonban9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 19");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban9_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban9_2.setBounds(702, 176, 96, 86);
		panel_tang2.add(butonban9_2);
		
		butonban8_2 = new JButton("Bàn 18");
		butonban8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 18");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban8_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban8_2.setBounds(488, 176, 96, 86);
		panel_tang2.add(butonban8_2);
		
		butonban10_2 = new JButton("Bàn 20");
		butonban10_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 20");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban10_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban10_2.setBounds(916, 176, 96, 86);
		panel_tang2.add(butonban10_2);
		
		JLabel lbl2_Ban11 = new JLabel("Bàn 11");
		lbl2_Ban11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban11.setBounds(60, 110, 96, 30);
		panel_tang2.add(lbl2_Ban11);
		
		lbl2_Ban12 = new JLabel("Bàn 12");
		lbl2_Ban12.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban12.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban12.setBounds(274, 110, 96, 30);
		panel_tang2.add(lbl2_Ban12);
		
		lbl2_Ban13 = new JLabel("Bàn 13");
		lbl2_Ban13.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban13.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban13.setBounds(488, 110, 96, 30);
		panel_tang2.add(lbl2_Ban13);
		
		lbl2_Ban14 = new JLabel("Bàn 14");
		lbl2_Ban14.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban14.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban14.setBounds(702, 110, 96, 30);
		panel_tang2.add(lbl2_Ban14);
		
		lbl2_Ban15 = new JLabel("Bàn 15");
		lbl2_Ban15.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban15.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban15.setBounds(916, 110, 96, 30);
		panel_tang2.add(lbl2_Ban15);
		
		lbl2_Ban16 = new JLabel("Bàn 16");
		lbl2_Ban16.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban16.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban16.setBounds(60, 263, 96, 30);
		panel_tang2.add(lbl2_Ban16);
		
		lbl2_Ban17 = new JLabel("Bàn 17");
		lbl2_Ban17.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban17.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban17.setBounds(274, 263, 96, 30);
		panel_tang2.add(lbl2_Ban17);
		
		lbl2_Ban18 = new JLabel("Bàn 18");
		lbl2_Ban18.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban18.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban18.setBounds(488, 263, 96, 30);
		panel_tang2.add(lbl2_Ban18);
		
		lbl2_Ban19 = new JLabel("Bàn 19");
		lbl2_Ban19.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban19.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban19.setBounds(702, 263, 96, 30);
		panel_tang2.add(lbl2_Ban19);
		
		lbl2_Ban20 = new JLabel("Bàn 20");
		lbl2_Ban20.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban20.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban20.setBounds(916, 263, 96, 30);
		panel_tang2.add(lbl2_Ban20);
		
		panel_tang = new JPanel();
		panel_tang.setBounds(0, 0, 1070, 48);
		cardPanel_TrangOder.add(panel_tang);
		panel_tang.setBackground(new Color(255, 128, 0));
		panel_tang.setLayout(null);
		
		bt_Tang1 = new JButton(" Tầng 1");
		bt_Tang1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_tang1.setVisible(true);
				panel_tang2.setVisible(false);
			}
		});
		bt_Tang1.setBounds(0, 0, 151, 48);
		panel_tang.add(bt_Tang1);
		
		bt_Tang2 = new JButton("Tầng 2");
		bt_Tang2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_tang1.setVisible(false);
				panel_tang2.setVisible(true);
			}
		});
		bt_Tang2.setBounds(151, 0, 151, 48);
		panel_tang.add(bt_Tang2);
		
		panel_Mon = new JPanel();
		panel_Mon.setLayout(null);
		panel_Mon.setBounds(0, 381, 1070, 48);
		cardPanel_TrangOder.add(panel_Mon);
		
		bt_Nuoc = new JButton("Nước");
		bt_Nuoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Nuoc.setVisible(true);
				panel_Lau.setVisible(false);
				panel_MonChinh.setVisible(false);
				panel_Nuong.setVisible(false);
				panel_TrangMieng.setVisible(false);
			}
		});
		bt_Nuoc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_Nuoc.setBackground(new Color(255, 128, 128));
		bt_Nuoc.setBounds(0, 0, 152, 48);
		panel_Mon.add(bt_Nuoc);
		
		bt_Nuong = new JButton("Nướng");
		bt_Nuong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Nuoc.setVisible(false);
				panel_Lau.setVisible(false);
				panel_MonChinh.setVisible(false);
				panel_Nuong.setVisible(true);
				panel_TrangMieng.setVisible(false);
			}
		});
		bt_Nuong.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_Nuong.setBackground(new Color(255, 128, 128));
		bt_Nuong.setBounds(152, 0, 152, 48);
		panel_Mon.add(bt_Nuong);
		
		bt_Lau = new JButton("Lẩu");
		bt_Lau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Nuoc.setVisible(false);
				panel_Lau.setVisible(true);
				panel_MonChinh.setVisible(false);
				panel_Nuong.setVisible(false);
				panel_TrangMieng.setVisible(false);
			}
		});
		bt_Lau.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_Lau.setBackground(new Color(255, 128, 128));
		bt_Lau.setBounds(304, 0, 152, 48);
		panel_Mon.add(bt_Lau);
		
		bt_MonChinh = new JButton("Món Chính");
		bt_MonChinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Nuoc.setVisible(false);
				panel_Lau.setVisible(false);
				panel_MonChinh.setVisible(true);
				panel_Nuong.setVisible(false);
				panel_TrangMieng.setVisible(false);
			}
		});
		bt_MonChinh.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_MonChinh.setBackground(new Color(255, 128, 128));
		bt_MonChinh.setBounds(456, 0, 152, 48);
		panel_Mon.add(bt_MonChinh);
		
		bt_TrangMieng = new JButton("Tráng Miệng");
		bt_TrangMieng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Nuoc.setVisible(false);
				panel_Lau.setVisible(false);
				panel_MonChinh.setVisible(false);
				panel_Nuong.setVisible(false);
				panel_TrangMieng.setVisible(true);
			}
		});
		bt_TrangMieng.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_TrangMieng.setBackground(new Color(255, 128, 128));
		bt_TrangMieng.setBounds(608, 0, 152, 48);
		panel_Mon.add(bt_TrangMieng);
		
		cardPanel_mon = new JPanel();
		cardPanel_mon.setBounds(0, 427, 1070, 306);
		cardPanel_TrangOder.add(cardPanel_mon);
		cardPanel_mon.setLayout(new CardLayout(0, 0));
		
		panel_Nuong = new JPanel();
		panel_Nuong.setBackground(new Color(128, 128, 0));
		cardPanel_mon.add(panel_Nuong, "name_1003838081420800");
		panel_Nuong.setLayout(null);
		
		bt_Nuong1 = new JButton("beer");
		
		bt_Nuong1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			    String tenhang = "Beer";
			    int dongia = 15000;
			    int soluong = 1;
			    float thanhtien = dongia * soluong;
			    model md = new model(tenhang, dongia, soluong, thanhtien);

			    try {
			    	for (int i = 1; i < 21; i++) {
						if(lblban.getText() == "Bàn " + i) {
							tablebill = "bill_ban" + i;
						}
					}
			    	
			        controller.insert(md,tablebill); // Thêm mục mới vào cơ sở dữ liệu

			        DefaultTableModel modelk = AddTable.AddTable_bill(tablebill);
			        table_bill.setModel(modelk); // Cập nhật dữ liệu trên bảng sau khi thêm vào cơ sở dữ liệu
			    } catch (SQLException e1) {
			        e1.printStackTrace();
			    }	   
		    
			}
		});
		bt_Nuong1.setBounds(132, 11, 89, 70);
		panel_Nuong.add(bt_Nuong1);
		
		bt_Nuong2 = new JButton("New button");
		bt_Nuong2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tenhang = "asdasd";
			    int dongia = 30000;
			    int soluong = 1;
			    float thanhtien = dongia * soluong;
			    model md = new model(tenhang, dongia, soluong, thanhtien);

			    try {
			    	for (int i = 1; i < 21; i++) {
						if(lblban.getText() == "Bàn " + i) {
							tablebill = "bill_ban" + i;
						}
					}
			    	
			        controller.insert(md,tablebill); // Thêm mục mới vào cơ sở dữ liệu

			        DefaultTableModel modelk = AddTable.AddTable_bill(tablebill);
			        table_bill.setModel(modelk); // Cập nhật dữ liệu trên bảng sau khi thêm vào cơ sở dữ liệu
			    } catch (SQLException e1) {
			        e1.printStackTrace();
			    }	
			}
		});
		bt_Nuong2.setBounds(371, 11, 89, 70);
		panel_Nuong.add(bt_Nuong2);
		
		bt_Nuong3 = new JButton("New button");
		bt_Nuong3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt_Nuong3.setBounds(610, 11, 89, 70);
		panel_Nuong.add(bt_Nuong3);
		
		bt_Nuong4 = new JButton("New button");
		bt_Nuong4.setBounds(849, 11, 89, 70);
		panel_Nuong.add(bt_Nuong4);
		
		bt_Nuong5 = new JButton("New button");
		bt_Nuong5.setBounds(132, 168, 89, 70);
		panel_Nuong.add(bt_Nuong5);
		
		bt_Nuong6 = new JButton("New button");
		bt_Nuong6.setBounds(371, 168, 89, 70);
		panel_Nuong.add(bt_Nuong6);
		
		bt_Nuong7 = new JButton("New button");
		bt_Nuong7.setBounds(610, 168, 89, 70);
		panel_Nuong.add(bt_Nuong7);
		
		bt_Nuong8 = new JButton("New button");
		bt_Nuong8.setBounds(849, 168, 89, 70);
		panel_Nuong.add(bt_Nuong8);
		panel_Nuong.setVisible(false);
		
		panel_Lau = new JPanel();
		panel_Lau.setBackground(new Color(64, 128, 128));
		cardPanel_mon.add(panel_Lau, "name_1003838090254500");
		panel_Lau.setLayout(null);
		
		bt_Lau1 = new JButton("New button");
		bt_Lau1.setBounds(132, 11, 89, 70);
		panel_Lau.add(bt_Lau1);
		
		bt_Lau2 = new JButton("New button");
		bt_Lau2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt_Lau2.setBounds(371, 11, 89, 70);
		panel_Lau.add(bt_Lau2);
		
		bt_Lau3 = new JButton("New button");
		bt_Lau3.setBounds(610, 11, 89, 70);
		panel_Lau.add(bt_Lau3);
		
		bt_Lau4 = new JButton("New button");
		bt_Lau4.setBounds(849, 11, 89, 70);
		panel_Lau.add(bt_Lau4);
		
		bt_Lau5 = new JButton("New button");
		bt_Lau5.setBounds(132, 168, 89, 70);
		panel_Lau.add(bt_Lau5);
		
		bt_Lau6 = new JButton("New button");
		bt_Lau6.setBounds(371, 168, 89, 70);
		panel_Lau.add(bt_Lau6);
		
		bt_Lau7 = new JButton("New button");
		bt_Lau7.setBounds(610, 168, 89, 70);
		panel_Lau.add(bt_Lau7);
		
		bt_Lau8 = new JButton("New button");
		bt_Lau8.setBounds(849, 168, 89, 70);
		panel_Lau.add(bt_Lau8);
		panel_Lau.setVisible(false);
		
		
		panel_MonChinh = new JPanel();
		panel_MonChinh.setBackground(new Color(64, 0, 0));
		cardPanel_mon.add(panel_MonChinh, "name_1003838098481500");
		panel_MonChinh.setLayout(null);
		
		bt_Chinh1 = new JButton("New button");
		bt_Chinh1.setBounds(132, 11, 89, 70);
		panel_MonChinh.add(bt_Chinh1);
		
		bt_Chinh2 = new JButton("New button");
		bt_Chinh2.setBounds(371, 11, 89, 70);
		panel_MonChinh.add(bt_Chinh2);
		
		bt_Chinh3 = new JButton("New button");
		bt_Chinh3.setBounds(610, 11, 89, 70);
		panel_MonChinh.add(bt_Chinh3);
		
		bt_Chinh4 = new JButton("New button");
		bt_Chinh4.setBounds(849, 11, 89, 70);
		panel_MonChinh.add(bt_Chinh4);
		
		bt_Chinh5 = new JButton("New button");
		bt_Chinh5.setBounds(132, 168, 89, 70);
		panel_MonChinh.add(bt_Chinh5);
		
		bt_Chinh6 = new JButton("New button");
		bt_Chinh6.setBounds(371, 168, 89, 70);
		panel_MonChinh.add(bt_Chinh6);
		
		bt_Chinh7 = new JButton("New button");
		bt_Chinh7.setBounds(610, 168, 89, 70);
		panel_MonChinh.add(bt_Chinh7);
		
		bt_Chinh8 = new JButton("New button");
		bt_Chinh8.setBounds(849, 168, 89, 70);
		panel_MonChinh.add(bt_Chinh8);
		panel_MonChinh.setVisible(false);
		
		panel_TrangMieng = new JPanel();
		panel_TrangMieng.setBackground(new Color(0, 64, 64));
		cardPanel_mon.add(panel_TrangMieng, "name_1003838108290000");
		panel_TrangMieng.setLayout(null);
		
		bt_TrangMieng1 = new JButton("New button");
		bt_TrangMieng1.setIcon(new ImageIcon("D:\\StudyAtSchool\\Downloads\\Picture\\1.jpg"));
		bt_TrangMieng1.setBounds(132, 11, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng1);
		
		bt_TrangMieng2 = new JButton("New button");
		bt_TrangMieng2.setBounds(371, 11, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng2);
		
		bt_TrangMieng3 = new JButton("New button");
		bt_TrangMieng3.setBounds(610, 11, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng3);
		
		bt_TrangMieng4 = new JButton("New button");
		bt_TrangMieng4.setBounds(849, 11, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng4);
		
		bt_TrangMieng5 = new JButton("New button");
		bt_TrangMieng5.setBounds(132, 168, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng5);
		
		bt_TrangMieng6 = new JButton("New button");
		bt_TrangMieng6.setBounds(371, 168, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng6);
		
		bt_TrangMieng7 = new JButton("New button");
		bt_TrangMieng7.setBounds(610, 168, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng7);
		
		bt_TrangMieng8 = new JButton("New button");
		bt_TrangMieng8.setBounds(849, 168, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng8);
		panel_TrangMieng.setVisible(false);
		
		panel_Nuoc = new JPanel();
		panel_Nuoc.setBackground(new Color(64, 0, 64));
		cardPanel_mon.add(panel_Nuoc, "name_1003838116760100");
		
		bt_Nuoc1 = new JButton("New button");
		bt_Nuoc1.setBounds(132, 11, 89, 70);
		bt_Nuoc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_Nuoc.setLayout(null);
		panel_Nuoc.add(bt_Nuoc1);
		
		bt_Nuoc2 = new JButton("New button");
		bt_Nuoc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt_Nuoc2.setBounds(371, 11, 89, 70);
		panel_Nuoc.add(bt_Nuoc2);
		
		bt_Nuoc3 = new JButton("New button");
		bt_Nuoc3.setBounds(610, 11, 89, 70);
		bt_Nuoc3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_Nuoc.add(bt_Nuoc3);
		
		bt_Nuoc4 = new JButton("New button");
		bt_Nuoc4.setBounds(849, 11, 89, 70);
		panel_Nuoc.add(bt_Nuoc4);
		
		bt_Nuoc5 = new JButton("New button");
		bt_Nuoc5.setBounds(132, 168, 89, 70);
		panel_Nuoc.add(bt_Nuoc5);
		
		bt_Nuoc6 = new JButton("New button");
		bt_Nuoc6.setBounds(371, 168, 89, 70);
		panel_Nuoc.add(bt_Nuoc6);
		
		bt_Nuoc7 = new JButton("New button");
		bt_Nuoc7.setBounds(610, 168, 89, 70);
		panel_Nuoc.add(bt_Nuoc7);
		
		bt_Nuoc8 = new JButton("New button");
		bt_Nuoc8.setBounds(849, 168, 89, 70);
		panel_Nuoc.add(bt_Nuoc8);
		
		card_Panel_bill = new JPanel();
		card_Panel_bill.setBounds(1070, 0, 490, 655);
		cardPanel_TrangOder.add(card_Panel_bill);
		card_Panel_bill.setLayout(null);
		card_Panel_bill.setVisible(false);
		
		lblban = new JLabel("");
		lblban.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblban.setHorizontalAlignment(SwingConstants.CENTER);
		lblban.setBounds(0, 145, 100, 45);
		card_Panel_bill.add(lblban);
		
		JPanel panel_tong = new JPanel();
		panel_tong.setBackground(new Color(192, 192, 192));
		panel_tong.setBounds(153, 190, 337, 60);
		card_Panel_bill.add(panel_tong);
		panel_tong.setLayout(null);
		
		JLabel lbltong = new JLabel("Tong:");
		lbltong.setBounds(0, 0, 93, 60);
		panel_tong.add(lbltong);
		lbltong.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		lblthanhtien = new JLabel("0");
		lblthanhtien.setBounds(119, 0, 214, 60);
		panel_tong.add(lblthanhtien);
		lblthanhtien.setHorizontalAlignment(SwingConstants.RIGHT);
		lblthanhtien.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel lbl_tenNhaHang = new JLabel("New label");
		lbl_tenNhaHang.setBounds(102, 67, 258, 60);
		card_Panel_bill.add(lbl_tenNhaHang);
		
		scrollPane_bill = new JScrollPane();
		scrollPane_bill.setBounds(0, 251, 490, 404);
		card_Panel_bill.add(scrollPane_bill);
		
		table_bill = new JTable();
		scrollPane_bill.setViewportView(table_bill);
		

		pannel_logo = new JPanel();
		pannel_logo.setLayout(null);
		pannel_logo.setBounds(228, 0, 65, 65);
		card_Panel_bill.add(pannel_logo);
		
		
		panel = new JPanel();
		panel.setBounds(1070, 655, 490, 78);
		cardPanel_TrangOder.add(panel);
		
		bt_ChinhSua = new JButton("Chỉnh sủa");
		bt_ChinhSua.setBounds(0, 0, 161, 78);
		bt_ChinhSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Thread(()->{
					CaculatorJrame c = new CaculatorJrame(table_bill);
					c.setVisible(true);
		        }).start();
				
			}
		});
		panel.setLayout(null);
		bt_ChinhSua.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(bt_ChinhSua);
		
		JButton bt_xoa = new JButton("Xóa");
		bt_xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for (int i = 1; i < 21; i++) {
					if(lblban.getText() == "Bàn " + i) {
						tablebill = "bill_ban" + i;
					}
				}
				
				try {
					controller.delete(tablebill, table_bill);
					DefaultTableModel modelk = AddTable.AddTable_bill(tablebill);
			        table_bill.setModel(modelk);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		bt_xoa.setBounds(159, 0, 111, 78);
		bt_xoa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(bt_xoa);
		
		JButton bt_in = new JButton("In");
		bt_in.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BufferedImage image = new BufferedImage(card_Panel_bill.getWidth(), card_Panel_bill.getHeight(), BufferedImage.TYPE_INT_ARGB);

		        // Lấy đối tượng Graphics2D từ BufferedImage
		        Graphics2D g2d = image.createGraphics();

		        // Vẽ panel lên BufferedImage
		        card_Panel_bill.paint(g2d);

		        // Giải phóng đối tượng Graphics2D
		        g2d.dispose();
		        // them dong ho se la moi filr khac nhau
		        String filenamebill = "bill" + lblban.getText() + ".png";
		        controller.saveImage(image, filenamebill);
		        
		        controller.openFile(filenamebill);
		        
			}
		});
		bt_in.setBounds(267, 0, 111, 78);
		bt_in.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(bt_in);
		
		JButton bt_KetThuc = new JButton("Kêt thúc");
		bt_KetThuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		bt_KetThuc.setBounds(375, 0, 115, 78);
		bt_KetThuc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(bt_KetThuc);
		panel_Nuoc.setVisible(true);
		panel_tang.setVisible(true);
		
		cardPanel_Kho = new JPanel();
		cardPanel_Kho.setBackground(new Color(64, 128, 128));
		cardPanel_Kho.setLayout(null);
		cardPanel_2.add(cardPanel_Kho, "name_1003617367221200");
		cardPanel_Kho.setVisible(false);
		
		cardPanel_QLNV = new JPanel();
		cardPanel_QLNV.setBackground(new Color(0, 255, 0));
		cardPanel_QLNV.setLayout(null);
		cardPanel_2.add(cardPanel_QLNV, "name_1003617377031400");
		cardPanel_QLNV.setVisible(false);
		
		
		table_BangLuong = new JTable();
		table_BangLuong.setForeground(new Color(0, 0, 0));
		table_BangLuong.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JScrollPane spBL = new JScrollPane(table_BangLuong);
        spBL.setBounds(52, 103, 704, 331);
        cardPanel_QLNV.add(spBL);
        table_BangLuong.setEnabled(false);
        
        JLabel lbl_BangLuong = new JLabel("BẢNG LƯƠNG");
        lbl_BangLuong.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl_BangLuong.setBounds(310, 36, 164, 56);
        cardPanel_QLNV.add(lbl_BangLuong);          
        
        JLabel lbl_MucLuong = new JLabel("MỨC LƯƠNG");
        lbl_MucLuong.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl_MucLuong.setBounds(1194, 36, 164, 56);
        cardPanel_QLNV.add(lbl_MucLuong);
        
        table_MucLuong = new JTable();
        table_MucLuong.setForeground(new Color(0, 0, 0));
        table_MucLuong.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JScrollPane spML = new JScrollPane(table_MucLuong);
        spML.setBounds(1026, 103, 446, 277);
        cardPanel_QLNV.add(spML);
        
        JLabel lbl_VTCV = new JLabel("Nhập vị trí công việc");
        lbl_VTCV.setBounds(1026, 430, 203, 32);
        cardPanel_QLNV.add(lbl_VTCV);
        
        tf_VTCV = new JTextField();
        tf_VTCV.setBounds(1026, 462, 203, 32);
        cardPanel_QLNV.add(tf_VTCV);
        tf_VTCV.setColumns(10);
        
        JLabel lbl_ML = new JLabel("Nhập mức lương");
        lbl_ML.setBounds(1026, 528, 203, 32);
        cardPanel_QLNV.add(lbl_ML);
        
        tf_ML = new JTextField();
        tf_ML.setColumns(10);
        tf_ML.setBounds(1026, 561, 203, 32);
        cardPanel_QLNV.add(tf_ML);
        
        JButton bt_Them = new JButton("Thêm");
        bt_Them.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        bt_Them.setBounds(1313, 462, 129, 32);
        cardPanel_QLNV.add(bt_Them);
        
        JButton bt_Sua = new JButton("Sửa");
        bt_Sua.setBounds(1313, 561, 129, 32);
        cardPanel_QLNV.add(bt_Sua);
        
        JButton bt_Xoa = new JButton("Xóa");
        bt_Xoa.setBounds(1313, 650, 129, 32);
        cardPanel_QLNV.add(bt_Xoa);
        
        bt_TinhLuong = new JButton("Tính Lương");
        bt_TinhLuong.setBounds(559, 440, 129, 32);
        cardPanel_QLNV.add(bt_TinhLuong);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(52, 546, 203, 32);
        cardPanel_QLNV.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(310, 546, 203, 32);
        cardPanel_QLNV.add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(553, 546, 203, 32);
        cardPanel_QLNV.add(textField_4);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(310, 624, 203, 32);
        cardPanel_QLNV.add(textField_5);
        
        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(553, 624, 203, 32);
        cardPanel_QLNV.add(textField_6);
        
        bt_Tim = new JButton("Tìm");
        bt_Tim.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
//        		ControllerQLNV c = new ControllerQLNV();
//        		c.searchInfo();
        	}
        });
        bt_Tim.setBounds(52, 613, 129, 32);
        cardPanel_QLNV.add(bt_Tim);
        
        bt_ChinSua = new JButton("Chỉnh sửa");
        bt_ChinSua.setBounds(449, 677, 129, 32);
        cardPanel_QLNV.add(bt_ChinSua);
        
        bt_Xoa2 = new JButton("Xóa");
        bt_Xoa2.setBounds(627, 677, 129, 32);
        cardPanel_QLNV.add(bt_Xoa2);
        
        bt_In = new JButton("In");
        bt_In.setBounds(698, 440, 53, 32);
        cardPanel_QLNV.add(bt_In);
        
        JButton bt_Them_2_1 = new JButton("Thêm");
        bt_Them_2_1.setBounds(266, 677, 129, 32);
        cardPanel_QLNV.add(bt_Them_2_1);
        
        JButton bt_Tru = new JButton("-");
        bt_Tru.setBounds(647, 71, 53, 32);
        cardPanel_QLNV.add(bt_Tru);
        
        JButton bt_COng = new JButton("+\r\n");
        bt_COng.setBounds(703, 71, 53, 32);
        cardPanel_QLNV.add(bt_COng);
        
        JLabel lbl1 = new JLabel("Nhập ID");
        lbl1.setBounds(52, 515, 203, 32);
        cardPanel_QLNV.add(lbl1);
        
        JLabel lbl2 = new JLabel("Họ và Tên");
        lbl2.setBounds(310, 515, 203, 32);
        cardPanel_QLNV.add(lbl2);
        
        JLabel lbl3 = new JLabel("Vị trí công việc");
        lbl3.setBounds(553, 515, 203, 32);
        cardPanel_QLNV.add(lbl3);
        
        JLabel lbl4 = new JLabel("Số ngày công");
        lbl4.setBounds(310, 593, 203, 32);
        cardPanel_QLNV.add(lbl4);
        
        JLabel lbl5 = new JLabel("Tiền lương");
        lbl5.setBounds(553, 593, 203, 32);
        cardPanel_QLNV.add(lbl5);
	}
	
	public JTable getTable_BangLuong() {
	    return table_BangLuong;
	}
	
	public JTable getTable_MucLuong() {
	    return table_MucLuong;
	}
	
	public JTextField getVTCV1() {
	    return tf_VTCV;
	}
	
	public JTextField getML1() {
	    return tf_ML;
	}
	
	public JTextField getID() {
	    return textField_2;
	}
	
	public JTextField getHVT() {
	    return textField_3;
	}
	
	public JTextField getVTCV2() {
	    return textField_4;
	}
	
	public JTextField getSNC() {
	    return textField_5;
	}
	
	public JTextField getTL() {
	    return textField_6;
	}
	
	public void setTable_BangLuong(JTable table_BangLuong) {
	    this.table_BangLuong = table_BangLuong;
	}

	public void setTable_MucLuong(JTable table_MucLuong) {
	    this.table_MucLuong = table_MucLuong;
	}

	public void setVTCV1(JTextField tf_VTCV) {
	    this.tf_VTCV = tf_VTCV;
	}

	public void setML1(JTextField tf_ML) {
	    this.tf_ML = tf_ML;
	}

	public void setID(JTextField textField_2) {
	    this.textField_2 = textField_2;
	}

	public void setHVT(JTextField textField_3) {
	    this.textField_3 = textField_3;
	}

	public void setVTCV2(JTextField textField_4) {
	    this.textField_4 = textField_4;
	}

	public void setSNC(JTextField textField_5) {
	    this.textField_5 = textField_5;
	}

	public void setTL(JTextField textField_6) {
	    this.textField_6 = textField_6;
	}

}

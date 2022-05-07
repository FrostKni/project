package appli;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class ticket {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket window = new ticket();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1100, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1226, 598);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1226, 56);
		panel_1.setBackground(Color.RED);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Venus Airlines");
		lblNewLabel_3.setBounds(453, 11, 172, 32);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 27));
		
		JLabel lblNewLabel_3_1 = new JLabel("Manage Passengers");
		lblNewLabel_3_1.setBounds(432, 67, 231, 32);
		lblNewLabel_3_1.setForeground(Color.RED);
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 27));
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("Passenger Name:");
		lblNewLabel_4.setBounds(184, 125, 157, 23);
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 21));
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(184, 159, 157, 23);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel lblNewLabel_4_1 = new JLabel("Nationality:");
		lblNewLabel_4_1.setBounds(541, 193, 116, 23);
		lblNewLabel_4_1.setForeground(Color.RED);
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Gender:");
		lblNewLabel_4_1_1.setBounds(387, 193, 83, 23);
		lblNewLabel_4_1_1.setForeground(Color.RED);
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		panel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Passport Number:");
		lblNewLabel_4_1_2.setBounds(541, 125, 179, 23);
		lblNewLabel_4_1_2.setForeground(Color.RED);
		lblNewLabel_4_1_2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		panel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Amount:");
		lblNewLabel_4_1_3.setBounds(748, 125, 92, 23);
		lblNewLabel_4_1_3.setForeground(Color.RED);
		lblNewLabel_4_1_3.setFont(new Font("Times New Roman", Font.BOLD, 21));
		panel.add(lblNewLabel_4_1_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(387, 227, 116, 23);
		comboBox_1.setEditable(true);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Transgender"}));
		comboBox_1.setForeground(Color.RED);
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		panel.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(748, 159, 128, 23);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Bookings");
		lblNewLabel_3_1_1.setBounds(483, 324, 128, 32);
		lblNewLabel_3_1_1.setForeground(Color.RED);
		lblNewLabel_3_1_1.setFont(new Font("Times New Roman", Font.BOLD, 27));
		panel.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_2 = new JButton("Book");
		btnNewButton_2.setBounds(317, 278, 101, 35);
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_2.setBackground(Color.WHITE);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Reset");
		btnNewButton_2_1.setBounds(487, 278, 101, 35);
		btnNewButton_2_1.setForeground(Color.RED);
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_2_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Back");
		btnNewButton_2_1_1_1.setBounds(649, 278, 101, 35);
		btnNewButton_2_1_1_1.setForeground(Color.RED);
		btnNewButton_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_2_1_1_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_2_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		textField_2.setColumns(10);
		textField_2.setBounds(541, 159, 169, 23);
		panel.add(textField_2);
		
		JLabel lblNewLabel_4_1_3_1 = new JLabel("Phone:");
		lblNewLabel_4_1_3_1.setForeground(Color.RED);
		lblNewLabel_4_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_4_1_3_1.setBounds(907, 125, 92, 23);
		panel.add(lblNewLabel_4_1_3_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		textField_3.setColumns(10);
		textField_3.setBounds(907, 159, 128, 23);
		panel.add(textField_3);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Passenger ID:");
		lblNewLabel_4_1_1_1.setForeground(Color.RED);
		lblNewLabel_4_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_4_1_1_1.setBounds(20, 125, 128, 23);
		panel.add(lblNewLabel_4_1_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setForeground(Color.RED);
		comboBox_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		comboBox_1_1.setEditable(true);
		comboBox_1_1.setBounds(20, 159, 92, 23);
		panel.add(comboBox_1_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		textField_4.setColumns(10);
		textField_4.setBounds(541, 227, 128, 23);
		panel.add(textField_4);
		
		JLabel lblNewLabel_4_1_1_2 = new JLabel("Flight Code:");
		lblNewLabel_4_1_1_2.setForeground(Color.RED);
		lblNewLabel_4_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_4_1_1_2.setBounds(387, 125, 116, 23);
		panel.add(lblNewLabel_4_1_1_2);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setForeground(Color.RED);
		comboBox_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		comboBox_1_2.setEditable(true);
		comboBox_1_2.setBounds(387, 159, 116, 23);
		panel.add(comboBox_1_2);
	}
}

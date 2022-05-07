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

public class flight {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					flight window = new flight();
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
	public flight() {
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
		
		JLabel lblNewLabel_3_1 = new JLabel("Manage Flights");
		lblNewLabel_3_1.setBounds(451, 67, 193, 32);
		lblNewLabel_3_1.setForeground(Color.RED);
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 27));
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("Flight Code");
		lblNewLabel_4.setBounds(20, 125, 148, 23);
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 21));
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(20, 159, 128, 23);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel lblNewLabel_4_1 = new JLabel("Source");
		lblNewLabel_4_1.setBounds(225, 125, 75, 23);
		lblNewLabel_4_1.setForeground(Color.RED);
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Destination");
		lblNewLabel_4_1_1.setBounds(411, 125, 148, 23);
		lblNewLabel_4_1_1.setForeground(Color.RED);
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		panel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Takeof Date");
		lblNewLabel_4_1_2.setBounds(621, 125, 148, 23);
		lblNewLabel_4_1_2.setForeground(Color.RED);
		lblNewLabel_4_1_2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		panel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Number of Seats");
		lblNewLabel_4_1_3.setBounds(822, 125, 169, 23);
		lblNewLabel_4_1_3.setForeground(Color.RED);
		lblNewLabel_4_1_3.setFont(new Font("Times New Roman", Font.BOLD, 21));
		panel.add(lblNewLabel_4_1_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(225, 159, 116, 23);
		comboBox.setEditable(true);
		comboBox.setForeground(Color.RED);
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Banglore", "Delhi", "Mumbai", "Chennai", "Goa", "J&K", "Hydrebad", "Pune"}));
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(411, 159, 116, 23);
		comboBox_1.setEditable(true);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Banglore", "Delhi", "Mumbai", "Chennai", "Goa", "J&K", "Hydrebad", "Pune"}));
		comboBox_1.setForeground(Color.RED);
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		panel.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(595, 159, 42, 23);
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1_1.setForeground(Color.RED);
		comboBox_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		comboBox_1_1.setEditable(true);
		panel.add(comboBox_1_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBounds(647, 159, 42, 23);
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox_1_1_1.setForeground(Color.RED);
		comboBox_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		comboBox_1_1_1.setEditable(true);
		panel.add(comboBox_1_1_1);
		
		JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1.setBounds(699, 159, 67, 23);
		comboBox_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		comboBox_1_1_1_1.setForeground(Color.RED);
		comboBox_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		comboBox_1_1_1_1.setEditable(true);
		panel.add(comboBox_1_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(822, 159, 128, 23);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Flights List");
		lblNewLabel_3_1_1.setBounds(463, 275, 148, 32);
		lblNewLabel_3_1_1.setForeground(Color.RED);
		lblNewLabel_3_1_1.setFont(new Font("Times New Roman", Font.BOLD, 27));
		panel.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.setBounds(195, 229, 101, 35);
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_2.setBackground(Color.WHITE);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Edit");
		btnNewButton_2_1.setBounds(388, 229, 101, 35);
		btnNewButton_2_1.setForeground(Color.RED);
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_2_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Delete");
		btnNewButton_2_1_1.setBounds(566, 229, 101, 35);
		btnNewButton_2_1_1.setForeground(Color.RED);
		btnNewButton_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_2_1_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Back");
		btnNewButton_2_1_1_1.setBounds(748, 229, 101, 35);
		btnNewButton_2_1_1_1.setForeground(Color.RED);
		btnNewButton_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_2_1_1_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_2_1_1_1);
	}
}

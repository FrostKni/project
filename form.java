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

public class form {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form window = new form();
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
	public form() {
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
		lblNewLabel_4.setBounds(20, 125, 157, 23);
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 21));
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(20, 159, 157, 23);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel lblNewLabel_4_1 = new JLabel("Nationality:");
		lblNewLabel_4_1.setBounds(225, 125, 116, 23);
		lblNewLabel_4_1.setForeground(Color.RED);
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Gender:");
		lblNewLabel_4_1_1.setBounds(388, 125, 83, 23);
		lblNewLabel_4_1_1.setForeground(Color.RED);
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		panel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Passport Number:");
		lblNewLabel_4_1_2.setBounds(541, 125, 179, 23);
		lblNewLabel_4_1_2.setForeground(Color.RED);
		lblNewLabel_4_1_2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		panel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Address:");
		lblNewLabel_4_1_3.setBounds(748, 125, 128, 23);
		lblNewLabel_4_1_3.setForeground(Color.RED);
		lblNewLabel_4_1_3.setFont(new Font("Times New Roman", Font.BOLD, 21));
		panel.add(lblNewLabel_4_1_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(225, 159, 116, 23);
		comboBox.setEditable(true);
		comboBox.setForeground(Color.RED);
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"India", "USA", "England", "France", "Spain", "Mexico", "China", "Japan"}));
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(388, 159, 116, 23);
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
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Passengers List");
		lblNewLabel_3_1_1.setBounds(451, 275, 200, 32);
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
	}
}

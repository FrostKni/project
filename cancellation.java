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

public class cancellation {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cancellation window = new cancellation();
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
	public cancellation() {
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
		
		JLabel lblNewLabel_3_1 = new JLabel("Ticket Cancellation");
		lblNewLabel_3_1.setBounds(432, 67, 231, 32);
		lblNewLabel_3_1.setForeground(Color.RED);
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 27));
		panel.add(lblNewLabel_3_1);
		
		textField = new JTextField();
		textField.setBounds(292, 159, 157, 23);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Cancellation List");
		lblNewLabel_3_1_1.setBounds(433, 324, 206, 32);
		lblNewLabel_3_1_1.setForeground(Color.RED);
		lblNewLabel_3_1_1.setFont(new Font("Times New Roman", Font.BOLD, 27));
		panel.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.setBounds(199, 278, 101, 35);
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_2.setBackground(Color.WHITE);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Edit");
		btnNewButton_2_1.setBounds(385, 278, 101, 35);
		btnNewButton_2_1.setForeground(Color.RED);
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_2_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Delete");
		btnNewButton_2_1_1.setBounds(577, 278, 101, 35);
		btnNewButton_2_1_1.setForeground(Color.RED);
		btnNewButton_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_2_1_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Back");
		btnNewButton_2_1_1_1.setBounds(760, 278, 101, 35);
		btnNewButton_2_1_1_1.setForeground(Color.RED);
		btnNewButton_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_2_1_1_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_2_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Ticket ID:");
		lblNewLabel_4_1_1_1.setForeground(Color.RED);
		lblNewLabel_4_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_4_1_1_1.setBounds(20, 125, 128, 23);
		panel.add(lblNewLabel_4_1_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setForeground(Color.RED);
		comboBox_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		comboBox_1_1.setEditable(true);
		comboBox_1_1.setBounds(20, 159, 128, 23);
		panel.add(comboBox_1_1);
		
		JLabel lblNewLabel_4_1_1_2 = new JLabel("Flight Code:");
		lblNewLabel_4_1_1_2.setForeground(Color.RED);
		lblNewLabel_4_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_4_1_1_2.setBounds(292, 125, 116, 23);
		panel.add(lblNewLabel_4_1_1_2);
	}
}

package appli;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 786, 114);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Venus Airlines");
		lblNewLabel_3.setBounds(284, 40, 172, 32);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 27));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Professionalisme and Quality of Service");
		lblNewLabel_3_1.setForeground(Color.RED);
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_3_1.setBounds(161, 141, 474, 32);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JButton btnFlights = new JButton("Flights");
		btnFlights.setForeground(Color.RED);
		btnFlights.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnFlights.setBackground(Color.WHITE);
		btnFlights.setBounds(49, 470, 125, 48);
		frame.getContentPane().add(btnFlights);
		
		JButton btnPassengers = new JButton("Passengers");
		btnPassengers.setForeground(Color.RED);
		btnPassengers.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnPassengers.setBackground(Color.WHITE);
		btnPassengers.setBounds(211, 470, 158, 48);
		frame.getContentPane().add(btnPassengers);
		
		JButton btnTickets = new JButton("Tickets");
		btnTickets.setForeground(Color.RED);
		btnTickets.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnTickets.setBackground(Color.WHITE);
		btnTickets.setBounds(406, 470, 125, 48);
		frame.getContentPane().add(btnTickets);
		
		JButton btnCancellation = new JButton("Cancellation");
		btnCancellation.setForeground(Color.RED);
		btnCancellation.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnCancellation.setBackground(Color.WHITE);
		btnCancellation.setBounds(576, 470, 169, 48);
		frame.getContentPane().add(btnCancellation);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\OneDrive\\Desktop\\WhatsApp Image 2022-05-04 at 10.25.20 AM.jpeg"));
		lblNewLabel.setBounds(240, 206, 331, 221);
		frame.getContentPane().add(lblNewLabel);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoctorMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Menu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorMenu window = new DoctorMenu();
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
	public DoctorMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_2_2 = new JButton("Add new patient");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.dispose();
				Add.patient();
			}
		});
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_2_2.setBounds(10, 73, 416, 68);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Start.start();
			}
		});
		btnNewButton.setBounds(128, 229, 183, 24);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnShowAllPatients_1 = new JButton("Show patient info");
		btnShowAllPatients_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Show.patient();
				
			}
		});
		btnShowAllPatients_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnShowAllPatients_1.setBounds(10, 151, 416, 68);
		frame.getContentPane().add(btnShowAllPatients_1);
		
		JLabel lblNewLabel = new JLabel("Wiew for doctors");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(20, 10, 213, 53);
		frame.getContentPane().add(lblNewLabel);
	}

}

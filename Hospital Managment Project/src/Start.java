import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frame;

	public static void main (String[] args) {
		Doctor mike = new Doctor("mike", "1158");
		Doctor house = new Doctor("house", "9893");
		Patient john = new Patient("john", "2256", "Pneumonia", "Expectorants", true);
		Patient andrea = new Patient("andrea", "5943", "Broken leg", "Plaster cast", false);
		List.patient.add(john);
		List.patient.add(andrea);
		List.doctor.add(mike);
		List.doctor.add(house);
		
		start();
	}
	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
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
	public Start() {
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
		
		JButton btnNewButton = new JButton("Doctor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				DoctorLogin.login();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(21, 106, 385, 56);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPatient = new JButton("Patient");
		btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PatientLogin.login();
			}
		});
		btnPatient.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnPatient.setBounds(21, 180, 385, 56);
		frame.getContentPane().add(btnPatient);
		
		JLabel lblNewLabel = new JLabel("Login as");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(21, 30, 271, 50);
		frame.getContentPane().add(lblNewLabel);
	}

}


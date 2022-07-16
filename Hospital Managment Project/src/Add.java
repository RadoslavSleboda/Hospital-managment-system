import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add {

	private JFrame frame;
	private JTextField treatmentTxt;
	private JTextField diagnosisTxt;
	private JTextField nameTxt;
	private boolean isInfectious = false;

	/**
	 * Launch the application.
	 */
	public static void patient() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add window = new Add();
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
	public Add() {
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
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Is infectious");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isInfectious = true;
			}
		});
		chckbxNewCheckBox.setBounds(6, 168, 133, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel = new JLabel("Diagnosis");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(6, 83, 164, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblTreatment = new JLabel("Treatment");
		lblTreatment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTreatment.setBounds(6, 124, 164, 38);
		frame.getContentPane().add(lblTreatment);
		
		treatmentTxt = new JTextField();
		treatmentTxt.setBounds(103, 131, 323, 31);
		frame.getContentPane().add(treatmentTxt);
		treatmentTxt.setColumns(10);
		
		diagnosisTxt = new JTextField();
		diagnosisTxt.setColumns(10);
		diagnosisTxt.setBounds(103, 90, 323, 31);
		frame.getContentPane().add(diagnosisTxt);
		
		JButton btnNewButton = new JButton("Add patient to list");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameTxt.getText();
				String diagnosis = diagnosisTxt.getText();
				String treatment = treatmentTxt.getText();
				String password =  passwordGenerator();
				
				Patient newPatient = new Patient(name,password,diagnosis,treatment,isInfectious);
				JOptionPane.showMessageDialog(null, "Patient successfuly added his generated password is " + password);
				List.patient.add(newPatient);
				isInfectious = false;
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(105, 195, 321, 58);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				DoctorMenu.Menu();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(6, 195, 95, 58);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Add patient");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(6, 0, 227, 47);
		frame.getContentPane().add(lblNewLabel_1);
		
		nameTxt = new JTextField();
		nameTxt.setColumns(10);
		nameTxt.setBounds(103, 49, 323, 31);
		frame.getContentPane().add(nameTxt);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(6, 42, 164, 38);
		frame.getContentPane().add(lblName);
	}
	public String passwordGenerator() {
		int random = (int) (10000 * Math.random());
		String output = String.valueOf(random); 
		return output;
		
	}
}


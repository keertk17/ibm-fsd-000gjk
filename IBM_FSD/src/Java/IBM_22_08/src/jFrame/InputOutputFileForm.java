package jFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class InputOutputFileForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputOutputFileForm frame = new InputOutputFileForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InputOutputFileForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileOutputStream out;
				String input=textField.getText();
				try {
					
					
					out = new FileOutputStream(new File("input.txt"));
					try {
						out.write(textField.getText().getBytes());
						System.out.println(input);
			
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
		btnSave.setBounds(85, 193, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnRead = new JButton("Read");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRead.setBounds(241, 193, 89, 23);
		contentPane.add(btnRead);
		
		textField = new JTextField();
		textField.setBounds(112, 38, 191, 119);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterTheText = new JLabel("Enter the text");
		lblEnterTheText.setBounds(39, 11, 123, 14);
		contentPane.add(lblEnterTheText);
	}
}

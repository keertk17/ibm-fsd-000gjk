package networking;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class EmployeeNetworking extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblEmail;
	private JButton btnSearchById;
	private final JTable table = new JTable();
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeNetworking frame = new EmployeeNetworking();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Socket client = null;
    
    // Default port number we are going to use
    int portnumber = 1234;
	/**
	 * Create the frame.
	 */
	public EmployeeNetworking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(20, 32, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblFirstName = new JLabel("FirstName");
		lblFirstName.setBounds(20, 81, 65, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("LastName");
		lblLastName.setBounds(20, 132, 65, 14);
		contentPane.add(lblLastName);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(20, 185, 46, 14);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(95, 29, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 78, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(95, 129, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(95, 182, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NetworkingClient nc=new NetworkingClient(Integer.parseInt(textField.getText()),textField_1.getText().toString(),textField_2.getText().toString(),textField_3.getText().toString());
				/*try {
					ns.addEmployee(Integer.parseInt(textField.getText().toString()),textField_1.getText().toString(),textField_2.getText().toString(),textField_3.getText().toString());
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
			}
		});
		btnAddEmployee.setBounds(92, 227, 126, 23);
		contentPane.add(btnAddEmployee);
		
		btnSearchById = new JButton("Search by id");
		btnSearchById.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	                //String msg[] ={Integer.toString(id),firstName,lastName,email};
	                String msg=textField_4.getText().toString();
	                // Create a client socket
	                
	                client = new Socket(InetAddress.getLocalHost(), portnumber);
	                System.out.println("Client socket is created " + client);
	                
	                // Create an output stream of the client socket
	                OutputStream clientOut = client.getOutputStream();
	                PrintWriter pw = new PrintWriter(clientOut, true);
	                
	                // Create an input stream of the client socket
	                InputStream clientIn = client.getInputStream();
	                BufferedReader br = new BufferedReader(new
	                        InputStreamReader(clientIn));
	                
	                // Create BufferedReader for a standard input
	                BufferedReader stdIn = new BufferedReader(new
	                        InputStreamReader(System.in));
	                
	                //System.out.println("Enter your name. Type Bye to exit. ");
	                
	                // Read data from standard input device and write it
	                // to the output stream of the client socket.
	                //msg = {Integer.parseInt(id),firstName,lastName,email};
	                // stdIn.readLine().trim();
	                pw.println(msg);
	                System.out.println(br.readLine());
	                
	                // Read data from the input stream of the client socket.
	               // System.out.println("Message returned from the server = " + br.readLine());
	                
	                pw.close();
	                br.close();
	                client.close();
	                
	                // Stop the operation
	                //if (msg.equalsIgnoreCase("Bye")) {
	                   // break;
	                //}
	                
	            } catch (IOException ie) {
	                System.out.println("I/O error - Start server and turn off Firewall" + ie);
	            }
			}
		});
		btnSearchById.setBounds(264, 227, 135, 23);
		contentPane.add(btnSearchById);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(238, 31, 161, 125);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(table);
		
		JLabel lblEnterId = new JLabel("Enter ID");
		lblEnterId.setBounds(238, 185, 46, 14);
		contentPane.add(lblEnterId);
		
		textField_4 = new JTextField();
		textField_4.setBounds(313, 182, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}

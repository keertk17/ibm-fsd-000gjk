package multiCast;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class MultiCast extends JFrame  {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiCast frame = new MultiCast();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	int portnumber = 1236;

   
	/**
	 * Create the frame.
	 */
	public MultiCast() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(115, 42, 199, 79);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnEnterMessage = new JButton("Enter Message");
		btnEnterMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 		
			        
			        // Joins a multicast group
			        try {
			        	MulticastSocket chatMulticastSocket = new MulticastSocket(portnumber);
			        	 InetAddress group =  InetAddress.getByName("230.0.0.1");

			        	
						chatMulticastSocket.joinGroup(group);
					
			        // Prompt a user to enter a message
			        String msg = textField.getText().toString();
			        //System.out.println("Type a message for the server:");
//			        BufferedReader br =
//			                new BufferedReader(new InputStreamReader(System.in));
//			        
//						msg = br.readLine();
//					
			        
			        // Send the message to Multicast address
			        DatagramPacket data = new
			                DatagramPacket(msg.getBytes(), 0,
			                msg.length(), group, portnumber);
			        
						chatMulticastSocket.send(data);
						chatMulticastSocket.close();

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        
			        // Close the socket
			        
			}
		});
		btnEnterMessage.setBounds(141, 176, 152, 23);
		contentPane.add(btnEnterMessage);
	}
}

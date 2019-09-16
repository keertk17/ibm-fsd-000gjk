package networking;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NetworkingFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NetworkingFrame frame = new NetworkingFrame();
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
	public NetworkingFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterTheNumber = new JLabel("Enter the number");
		lblEnterTheNumber.setBounds(24, 33, 126, 14);
		contentPane.add(lblEnterTheNumber);
		
		textField = new JTextField();
		textField.setBounds(160, 30, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnGetFactorial = new JButton("Get Factorial");
		btnGetFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NetworkingServer ns=new NetworkingServer();
				int res=ns.getFactorial(Integer.parseInt(textField.getText()));
				textField_1.setText(Integer.toString(res));
			}
		});
		btnGetFactorial.setBounds(10, 87, 126, 23);
		contentPane.add(btnGetFactorial);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 88, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}

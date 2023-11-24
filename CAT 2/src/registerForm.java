import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class registerForm {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtUsername;
	private JTextField txtEmail;
	private JTextField txtPhone;
	private JTextField txtAdress;
	private JPasswordField passwordfield;
	private JPasswordField password2field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registerForm window = new registerForm();
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
	public registerForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(10, 57, 149, 22);
		frame.getContentPane().add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(169, 58, 248, 20);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 97, 149, 17);
		frame.getContentPane().add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(169, 94, 248, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 132, 149, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Confirm Password:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(10, 172, 149, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(10, 216, 149, 17);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(169, 213, 248, 20);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Phone:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(10, 247, 149, 17);
		frame.getContentPane().add(lblNewLabel_4);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(169, 244, 248, 20);
		frame.getContentPane().add(txtPhone);
		txtPhone.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Address:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(10, 278, 149, 17);
		frame.getContentPane().add(lblNewLabel_5);
		
		txtAdress = new JTextField();
		txtAdress.setBounds(169, 275, 248, 20);
		frame.getContentPane().add(txtAdress);
		txtAdress.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Register Form");
		lblNewLabel_6.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 29));
		lblNewLabel_6.setBounds(10, 11, 434, 29);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(27, 320, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText(null);
				txtUsername.setText(null);
				passwordfield.setText(null);
				password2field.setText(null);
				txtEmail.setText(null);
				txtPhone.setText(null);
				txtAdress.setText(null);;
			}
		});
		btnReset.setBounds(166, 320, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Close the JFrame when the button is clicked
		        frame.dispose();
		    }
		});
		btnClose.setBounds(286, 320, 89, 23);
		frame.getContentPane().add(btnClose);

		
		passwordfield = new JPasswordField();
		passwordfield.setBounds(169, 133, 248, 20);
		frame.getContentPane().add(passwordfield);
		
		password2field = new JPasswordField();
		password2field.setBounds(169, 173, 248, 20);
		frame.getContentPane().add(password2field);
	}
}
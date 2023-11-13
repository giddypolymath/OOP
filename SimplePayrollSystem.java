import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimplePayrollSystem {

	private JFrame frame;
	private JTextField textEmployeeName;
	private JTextField textRatePerHour;
	private JTextField textHourPerDay;
	private JTextField textNumberofdaysWorked;
	private JLabel lblDEDUCTIONOFSALARY;
	private JLabel lblTaxofMonthlyWage;
	private JTextField textTaxofMonthlyWage;
	private JLabel lblPhilhealth;
	private JTextField textPhilhealth;
	private JLabel lblSss;
	private JTextField textSSS;
	private JLabel lblGrossSalary;
	private JLabel lblDeduction;
	private JTextField textGrossSalary;
	private JTextField textDeduction;
	private JLabel lblGROSSSALARY;
	private JLabel lblTotalDeduction;
	private JLabel lblNetSalary;
	private JTextField textGross;
	private JTextField textTotalDeduction;
	private JTextField textSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimplePayrollSystem window = new SimplePayrollSystem();
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
	public SimplePayrollSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 842, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDisplay = new JLabel("Simple Payroll System");
		lblDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDisplay.setBounds(258, 0, 232, 25);
		frame.getContentPane().add(lblDisplay);
		
		JLabel lblEmployeeName = new JLabel("Employee Name:");
		lblEmployeeName.setBounds(10, 60, 100, 17);
		frame.getContentPane().add(lblEmployeeName);
		
		textEmployeeName = new JTextField();
		textEmployeeName.setBounds(143, 59, 100, 17);
		frame.getContentPane().add(textEmployeeName);
		textEmployeeName.setColumns(10);
		
		JLabel lblRatePerHour = new JLabel("Rate Per Hour:");
		lblRatePerHour.setBounds(10, 88, 100, 17);
		frame.getContentPane().add(lblRatePerHour);
		
		textRatePerHour = new JTextField();
		textRatePerHour.setBounds(168, 87, 75, 17);
		frame.getContentPane().add(textRatePerHour);
		textRatePerHour.setColumns(10);
		
		JLabel lblHourPerDay = new JLabel("Hour Per Day:");
		lblHourPerDay.setBounds(10, 116, 100, 17);
		frame.getContentPane().add(lblHourPerDay);
		
		textHourPerDay = new JTextField();
		textHourPerDay.setColumns(10);
		textHourPerDay.setBounds(168, 114, 75, 17);
		frame.getContentPane().add(textHourPerDay);
		
		JLabel lblNumberofdaysWorked = new JLabel("Number of days Worked:");
		lblNumberofdaysWorked.setBounds(10, 140, 157, 25);
		frame.getContentPane().add(lblNumberofdaysWorked);
		
		textNumberofdaysWorked = new JTextField();
		textNumberofdaysWorked.setColumns(10);
		textNumberofdaysWorked.setBounds(168, 145, 75, 17);
		frame.getContentPane().add(textNumberofdaysWorked);
		
		lblDEDUCTIONOFSALARY = new JLabel("DEDUCTION OF SALARY:");
		lblDEDUCTIONOFSALARY.setForeground(Color.RED);
		lblDEDUCTIONOFSALARY.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDEDUCTIONOFSALARY.setBounds(278, 47, 170, 17);
		frame.getContentPane().add(lblDEDUCTIONOFSALARY);
		
		lblTaxofMonthlyWage = new JLabel("Tax 15% of Monthly Wage:");
		lblTaxofMonthlyWage.setBounds(258, 88, 163, 17);
		frame.getContentPane().add(lblTaxofMonthlyWage);
		
		textTaxofMonthlyWage = new JTextField();
		textTaxofMonthlyWage.setEnabled(false);
		textTaxofMonthlyWage.setEditable(false);
		textTaxofMonthlyWage.setBounds(431, 86, 75, 19);
		frame.getContentPane().add(textTaxofMonthlyWage);
		textTaxofMonthlyWage.setColumns(10);
		
		lblPhilhealth = new JLabel("Philhealth 5% :");
		lblPhilhealth.setBounds(321, 116, 86, 17);
		frame.getContentPane().add(lblPhilhealth);
		
		textPhilhealth = new JTextField();
		textPhilhealth.setEnabled(false);
		textPhilhealth.setEditable(false);
		textPhilhealth.setColumns(10);
		textPhilhealth.setBounds(431, 114, 75, 19);
		frame.getContentPane().add(textPhilhealth);
		
		lblSss = new JLabel("SSS 2% :");
		lblSss.setBounds(349, 144, 58, 17);
		frame.getContentPane().add(lblSss);
		
		textSSS = new JTextField();
		textSSS.setEnabled(false);
		textSSS.setEditable(false);
		textSSS.setColumns(10);
		textSSS.setBounds(431, 146, 75, 19);
		frame.getContentPane().add(textSSS);
		
		lblGrossSalary = new JLabel("Gross Salary:");
		lblGrossSalary.setBounds(569, 60, 83, 17);
		frame.getContentPane().add(lblGrossSalary);
		
		lblDeduction = new JLabel("Deduction:");
		lblDeduction.setBounds(569, 89, 83, 17);
		frame.getContentPane().add(lblDeduction);
		
		textGrossSalary = new JTextField();
		textGrossSalary.setEnabled(false);
		textGrossSalary.setEditable(false);
		textGrossSalary.setBounds(662, 58, 86, 20);
		frame.getContentPane().add(textGrossSalary);
		textGrossSalary.setColumns(10);
		
		textDeduction = new JTextField();
		textDeduction.setEditable(false);
		textDeduction.setEnabled(false);
		textDeduction.setColumns(10);
		textDeduction.setBounds(662, 86, 86, 20);
		frame.getContentPane().add(textDeduction);
		
		lblGROSSSALARY = new JLabel("GROSS SALARY:");
		lblGROSSSALARY.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGROSSSALARY.setBounds(10, 191, 137, 16);
		frame.getContentPane().add(lblGROSSSALARY);
		
		JButton btnNewButton = new JButton("COMPUTE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rateperhour=Integer.valueOf(textRatePerHour.getText());
				int hourperday=Integer.valueOf(textHourPerDay.getText());
				int numberofdaysworked=Integer.valueOf(textNumberofdaysWorked.getText());
				int grosssalary=rateperhour*hourperday*numberofdaysworked;
				textGrossSalary.setText(String.valueOf(grosssalary));
				double tax=(double)(0.15*grosssalary);
				textTaxofMonthlyWage.setText(String.valueOf(tax));
				double health=(double)(0.05*grosssalary);
				textPhilhealth.setText(String.valueOf(health));
				double sss=(double)(0.02*grosssalary);
				textSSS.setText(String.valueOf(sss));
				double deduction=tax+health+sss;
				textDeduction.setText(String.valueOf(deduction));
				double netsal=grosssalary-deduction;
				textSalary.setText(String.valueOf(netsal));
				textGross.setText(String.valueOf(grosssalary));
				textTotalDeduction.setText(String.valueOf(deduction));
				
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 64));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(321, 233, 157, 41);
		frame.getContentPane().add(btnNewButton);
		
		lblTotalDeduction = new JLabel("TOTAL DEDUCTION:");
		lblTotalDeduction.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalDeduction.setBounds(258, 190, 163, 19);
		frame.getContentPane().add(lblTotalDeduction);
		
		lblNetSalary = new JLabel("NET SALARY:");
		lblNetSalary.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNetSalary.setBounds(545, 191, 109, 17);
		frame.getContentPane().add(lblNetSalary);
		
		textGross = new JTextField();
		textGross.setEnabled(false);
		textGross.setEditable(false);
		textGross.setBounds(157, 191, 86, 20);
		frame.getContentPane().add(textGross);
		textGross.setColumns(10);
		
		textTotalDeduction = new JTextField();
		textTotalDeduction.setEditable(false);
		textTotalDeduction.setEnabled(false);
		textTotalDeduction.setColumns(10);
		textTotalDeduction.setBounds(420, 191, 86, 20);
		frame.getContentPane().add(textTotalDeduction);
		
		textSalary = new JTextField();
		textSalary.setEnabled(false);
		textSalary.setEditable(false);
		textSalary.setColumns(10);
		textSalary.setBounds(662, 191, 86, 20);
		frame.getContentPane().add(textSalary);
	}
}
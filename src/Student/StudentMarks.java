package Student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentMarks {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarks window = new StudentMarks();
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
	public StudentMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 777, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(40, 37, 681, 353);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextPane txtnum1 = new JTextPane();
		txtnum1.setBounds(220, 87, 136, 20);
		panel.add(txtnum1);
		
		JLabel lblNewLabel = new JLabel("Marks");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(127, 87, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblMarks = new JLabel("Marks 2");
		lblMarks.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarks.setBounds(127, 140, 70, 14);
		panel.add(lblMarks);
		
		JLabel lblMarks_2 = new JLabel("Marks 3");
		lblMarks_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarks_2.setBounds(127, 177, 70, 14);
		panel.add(lblMarks_2);
		
		JTextPane txtnum2 = new JTextPane();
		txtnum2.setBounds(220, 134, 136, 20);
		panel.add(txtnum2);
		
		JTextPane txtnum3 = new JTextPane();
		txtnum3.setBounds(220, 177, 136, 20);
		panel.add(txtnum3);
		
		JTextPane txttot = new JTextPane();
		txttot.setBounds(220, 222, 136, 20);
		panel.add(txttot);
		
		JTextPane txtavg = new JTextPane();
		txtavg.setBounds(220, 260, 136, 20);
		panel.add(txtavg);
		
		JTextPane textgrade = new JTextPane();
		textgrade.setBounds(220, 302, 136, 20);
		panel.add(textgrade);
		
		JLabel lblMarks_2_1 = new JLabel("Total");
		lblMarks_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarks_2_1.setBounds(127, 228, 70, 14);
		panel.add(lblMarks_2_1);
		
		JLabel lblMarks_2_1_1 = new JLabel("Average");
		lblMarks_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarks_2_1_1.setBounds(127, 266, 70, 14);
		panel.add(lblMarks_2_1_1);
		
		JLabel lblMarks_2_1_2 = new JLabel("Grade");
		lblMarks_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarks_2_1_2.setBounds(127, 308, 70, 14);
		panel.add(lblMarks_2_1_2);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int m1 = Integer.parseInt(txtnum1.getText());
				int m2 = Integer.parseInt(txtnum2.getText());
				int m3 = Integer.parseInt(txtnum3.getText());
				
				int tot = m1 + m2 + m3;
				
				double avg = tot/3;
				
				txttot.setText(String.valueOf(tot));
				txtavg.setText(String.valueOf(avg));
				
				
				if(avg > 50)
				{
					textgrade.setText("Pass");
				}
				else
				{
					textgrade.setText("Fail");
				}
				
			}
		});
		btnNewButton.setBounds(494, 67, 112, 59);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtnum1.setText("");
				txtnum2.setText("");
				txtnum3.setText("");
				
				txttot.setText("");
				txtavg.setText("");
				textgrade.setText("");
				
				txtnum1.requestFocus();
			}
		});
		btnNewButton_1.setBounds(494, 157, 112, 59);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(494, 246, 112, 59);
		panel.add(btnNewButton_2);
		
		JLabel lblStudentMarks = new JLabel("Student Marks");
		lblStudentMarks.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblStudentMarks.setBounds(127, 11, 298, 55);
		panel.add(lblStudentMarks);
	}
}

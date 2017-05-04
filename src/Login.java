import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import javax.swing.border.EtchedBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private ButtonGroup botones= new ButtonGroup();
	/**ct
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.r
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), Color.BLACK));
		textField.setBackground(Color.WHITE);
		textField.setBounds(247, 82, 130, 23);
		contentPane.add(textField);
		
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.BLACK);
		passwordField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, new Color(0, 0, 0)));
		passwordField.setBackground(Color.WHITE);
		
		passwordField.setBounds(247, 146, 130, 23);
		contentPane.add(passwordField);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Carter One", Font.PLAIN, 16));
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setBounds(247, 44, 130, 28);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Carter One", Font.PLAIN, 16));
		lblContrasea.setForeground(new Color(255, 255, 255));
		lblContrasea.setBounds(247, 117, 130, 23);
		contentPane.add(lblContrasea);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuInicio().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(247, 181, 105, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 89, 179));
		panel.setBounds(0, 0, 141, 278);
		contentPane.add(panel);
	}
}

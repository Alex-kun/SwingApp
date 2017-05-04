import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;

public class Asociaciones1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField;
	private JTextField textField_8;
	private JTextField textField_9;
	

	/**ctt
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Asociaciones1 frame = new Asociaciones1();
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
	public Asociaciones1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(125, 0, 602, 44);
		contentPane.add(panel);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MenuInicio().setVisible(true);
				dispose();
			}
		});
		btnMenu.setForeground(Color.WHITE);
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMenu.setBackground(new Color(119, 136, 153));
		btnMenu.setBounds(466, 11, 107, 23);
		panel.add(btnMenu);
		
		JLabel lblAsociaciones = new JLabel("Asociaciones");
		lblAsociaciones.setBounds(140, 11, 210, 23);
		panel.add(lblAsociaciones);
		lblAsociaciones.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblAsociaciones.setForeground(new Color(255, 255, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(0, 0, 122, 502);
		contentPane.add(panel_1);
		
		JButton button_1 = new JButton("Asociaciones");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Asociaciones1().setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBackground(new Color(112, 128, 144));
		button_1.setBounds(0, 77, 122, 23);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("Esp Municipales");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EspacioMunicipal1().setVisible(true);
				dispose();
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBackground(new Color(119, 136, 153));
		button_2.setBounds(0, 145, 122, 23);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Subvenciones");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Subvenciones1().setVisible(true);
				dispose();
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setBackground(new Color(119, 136, 153));
		button_3.setBounds(0, 179, 122, 23);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("Actividades");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Actividad1().setVisible(true);
				dispose();
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setBackground(new Color(119, 136, 153));
		button_4.setBounds(0, 111, 122, 23);
		panel_1.add(button_4);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(134, 157, 583, 180);
		contentPane.add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Id", "Nombre", "CIF", "CP", "Direcci\u00F3n", "Tel\u00E9fono", "E-mail", "Tipo "
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel label_1 = new JLabel("Nombre");
		label_1.setBounds(159, 365, 65, 14);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(231, 362, 105, 20);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("CIF");
		label_2.setBounds(159, 390, 73, 14);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(231, 387, 105, 20);
		contentPane.add(textField_2);
		
		JLabel lblCpostal = new JLabel("CP");
		lblCpostal.setBounds(159, 418, 86, 14);
		contentPane.add(lblCpostal);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(231, 415, 105, 20);
		contentPane.add(textField_4);
		
		JLabel label_4 = new JLabel("Direcci\u00F3n");
		label_4.setBounds(159, 471, 92, 14);
		contentPane.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(231, 468, 242, 20);
		contentPane.add(textField_5);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setBounds(159, 446, 92, 14);
		contentPane.add(lblTelfono);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(231, 440, 105, 20);
		contentPane.add(textField_6);
		
		JLabel label_7 = new JLabel("E-mail");
		label_7.setBounds(385, 365, 56, 14);
		contentPane.add(label_7);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(503, 365, 112, 20);
		contentPane.add(textField_7);
		
		JLabel label_8 = new JLabel("Tipo de Asociaci\u00F3n");
		label_8.setBounds(385, 393, 156, 14);
		contentPane.add(label_8);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(503, 390, 112, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("A\u00F1adir/Modificar");
		btnNewButton.setBounds(503, 439, 140, 23);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("Busqueda:");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(135, 64, 72, 14);
		contentPane.add(label);
		
		JLabel label_5 = new JLabel("ID:");
		label_5.setBounds(145, 93, 59, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Nombre:");
		label_6.setBounds(141, 132, 53, 14);
		contentPane.add(label_6);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(200, 89, 81, 23);
		contentPane.add(textField);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(200, 122, 81, 23);
		contentPane.add(textField_8);
		
		JLabel lblCif = new JLabel("CIF:");
		lblCif.setBounds(306, 93, 46, 14);
		contentPane.add(lblCif);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(306, 132, 46, 14);
		contentPane.add(lblTipo);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(351, 126, 81, 20);
		contentPane.add(comboBox_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(351, 89, 81, 23);
		contentPane.add(textField_9);
		
		JButton button = new JButton("Buscar");
		button.setBounds(470, 123, 89, 23);
		contentPane.add(button);
		
		JButton button_6 = new JButton("Modificar");
		button_6.setBounds(582, 123, 112, 23);
		contentPane.add(button_6);
		
		JButton button_5 = new JButton("Eliminar");
		button_5.setBounds(503, 467, 140, 23);
		contentPane.add(button_5);
		
		
	}
}

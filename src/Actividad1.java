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
import javax.swing.JComboBox;

public class Actividad1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	

	/**rdd
	 * Launchw tthe application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad1 frame = new Actividad1();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); 
	}

	/**
	 * Create the framse s.
	 */
	public Actividad1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(132, 157, 585, 180);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Id", "Nombre", "Telefono", "Lugar", "Organizadores"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(44);
		table.getColumnModel().getColumn(1).setPreferredWidth(106);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(125, 0, 602, 44);
		contentPane.add(panel);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					new MenuInicio().setVisible(true);
					dispose();
			}
		});
		btnMenu.setForeground(Color.BLACK);
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMenu.setBackground(new Color(119, 136, 153));
		btnMenu.setBounds(466, 11, 107, 23);
		panel.add(btnMenu);
		
		JLabel lblActividad = new JLabel("Actividades");
		lblActividad.setBounds(103, 11, 194, 22);
		panel.add(lblActividad);
		lblActividad.setForeground(Color.WHITE);
		lblActividad.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 89, 179));
		panel_1.setBounds(0, 0, 122, 502);
		contentPane.add(panel_1);
		
		JButton button_1 = new JButton("Asociaciones");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Asociaciones1().setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(Color.BLACK);
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
		button_2.setForeground(Color.BLACK);
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
		button_3.setForeground(Color.BLACK);
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
		button_4.setForeground(Color.BLACK);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setBackground(new Color(119, 136, 153));
		button_4.setBounds(0, 111, 122, 23);
		panel_1.add(button_4);
		
		JLabel label = new JLabel("Busqueda:");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(132, 64, 72, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("ID:");
		label_1.setBounds(142, 93, 59, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Nombre:");
		label_2.setBounds(138, 132, 53, 14);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(197, 89, 81, 23);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(197, 122, 81, 23);
		contentPane.add(textField_1);
		
		JLabel label_3 = new JLabel("CIF:");
		label_3.setBounds(303, 93, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Tipo:");
		label_4.setBounds(303, 132, 46, 14);
		contentPane.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(348, 89, 81, 23);
		contentPane.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(348, 126, 81, 20);
		contentPane.add(comboBox);
		
		JButton button = new JButton("Buscar");
		button.setBounds(467, 123, 89, 23);
		contentPane.add(button);
		
		JButton button_5 = new JButton("Modificar");
		button_5.setBounds(579, 123, 112, 23);
		contentPane.add(button_5);
		
		JLabel label_5 = new JLabel("Nombre");
		label_5.setBounds(142, 351, 65, 14);
		contentPane.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(225, 348, 105, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(225, 373, 105, 20);
		contentPane.add(textField_4);
		
		JLabel lblLugar = new JLabel("Lugar");
		lblLugar.setBounds(142, 404, 86, 14);
		contentPane.add(lblLugar);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(225, 401, 105, 20);
		contentPane.add(textField_5);
		
		JLabel label_8 = new JLabel("Tel\u00E9fono");
		label_8.setBounds(142, 376, 92, 14);
		contentPane.add(label_8);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(225, 426, 112, 20);
		contentPane.add(textField_6);
		
		JLabel label_10 = new JLabel("E-mail");
		label_10.setBounds(397, 348, 56, 14);
		contentPane.add(label_10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(515, 348, 112, 20);
		contentPane.add(textField_8);
		
		JLabel lblTipoDeActividad = new JLabel("Tipo de Actividad");
		lblTipoDeActividad.setBounds(397, 376, 156, 14);
		contentPane.add(lblTipoDeActividad);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(515, 373, 112, 20);
		contentPane.add(comboBox_1);
		
		JButton button_6 = new JButton("A\u00F1adir/Modificar");
		button_6.setBounds(515, 425, 140, 23);
		contentPane.add(button_6);
		
		JLabel lblNewLabel = new JLabel("Organizadores");
		lblNewLabel.setBounds(142, 429, 90, 14);
		contentPane.add(lblNewLabel);
		
		JButton button_7 = new JButton("Eliminar");
		button_7.setBounds(515, 459, 140, 23);
		contentPane.add(button_7);
		
		
	}
}
//

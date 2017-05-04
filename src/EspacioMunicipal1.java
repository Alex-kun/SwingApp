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

public class EspacioMunicipal1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**ctyr
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EspacioMunicipal1 frame = new EspacioMunicipal1();
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
	public EspacioMunicipal1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(136, 159, 581, 171);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Id", "Nombre asociaciones", "Tel\u00E9fono", "Fecha solicitud", "Espacio solicitado", "E-mail"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(28);
		table.getColumnModel().getColumn(1).setPreferredWidth(117);
		table.getColumnModel().getColumn(3).setPreferredWidth(92);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		scrollPane.setViewportView(table);
		
		table_1 = new JTable();
		scrollPane.setColumnHeaderView(table_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 89, 179));
		panel.setBounds(0, 0, 122, 502);
		contentPane.add(panel);
		
		JButton button = new JButton("Asociaciones");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Asociaciones1().setVisible(true);
				dispose();
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(new Color(112, 128, 144));
		button.setBounds(0, 77, 122, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Esp Municipales");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EspacioMunicipal1().setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBackground(new Color(119, 136, 153));
		button_1.setBounds(0, 145, 122, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Subvenciones");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Subvenciones1().setVisible(true);
				dispose();
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBackground(new Color(119, 136, 153));
		button_2.setBounds(0, 179, 122, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Actividades");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Actividad1().setVisible(true);
				dispose();
			}
		});
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setBackground(new Color(119, 136, 153));
		button_3.setBounds(0, 111, 122, 23);
		panel.add(button_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(125, 0, 602, 44);
		contentPane.add(panel_1);
		
		JButton button_4 = new JButton("Menu");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuInicio().setVisible(true);
				dispose();
			}
		});
		button_4.setForeground(Color.BLACK);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setBackground(new Color(119, 136, 153));
		button_4.setBounds(466, 11, 107, 23);
		panel_1.add(button_4);
		
		JLabel lblEspaciosMunicipales = new JLabel("Espacios Municipales");
		lblEspaciosMunicipales.setBounds(86, 11, 322, 22);
		panel_1.add(lblEspaciosMunicipales);
		lblEspaciosMunicipales.setForeground(Color.WHITE);
		lblEspaciosMunicipales.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		
		JLabel label = new JLabel("Busqueda:");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(132, 66, 72, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("ID:");
		label_1.setBounds(142, 95, 59, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(197, 91, 81, 23);
		contentPane.add(textField);
		
		JLabel label_2 = new JLabel("Nombre:");
		label_2.setBounds(138, 134, 53, 14);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(197, 124, 81, 23);
		contentPane.add(textField_1);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(289, 95, 46, 14);
		contentPane.add(lblFecha);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(334, 91, 81, 23);
		contentPane.add(textField_2);
		
		JLabel lblEspacioSolicitado_2 = new JLabel("Espacio");
		lblEspacioSolicitado_2.setBounds(289, 134, 46, 14);
		contentPane.add(lblEspacioSolicitado_2);
		
		JButton button_5 = new JButton("Buscar");
		button_5.setBounds(453, 125, 89, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Modificar");
		button_6.setBounds(565, 125, 112, 23);
		contentPane.add(button_6);
		
		JLabel label_5 = new JLabel("Nombre");
		label_5.setBounds(136, 362, 65, 14);
		contentPane.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(219, 359, 105, 20);
		contentPane.add(textField_3);
		
		JLabel label_6 = new JLabel("Tel\u00E9fono");
		label_6.setBounds(136, 387, 92, 14);
		contentPane.add(label_6);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(219, 384, 105, 20);
		contentPane.add(textField_4);
		
		JLabel lblEspacioSolicitado = new JLabel("Fecha solicitud");
		lblEspacioSolicitado.setBounds(136, 415, 86, 14);
		contentPane.add(lblEspacioSolicitado);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(219, 412, 105, 20);
		contentPane.add(textField_5);
		
		JLabel lblEspacioSolicitado_1 = new JLabel("Espacio solicitado");
		lblEspacioSolicitado_1.setBounds(136, 440, 90, 14);
		contentPane.add(lblEspacioSolicitado_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(219, 437, 105, 20);
		contentPane.add(textField_6);
		
		JLabel label_9 = new JLabel("E-mail");
		label_9.setBounds(391, 359, 56, 14);
		contentPane.add(label_9);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(509, 359, 112, 20);
		contentPane.add(textField_7);
		
		JButton button_7 = new JButton("A\u00F1adir/Modificar");
		button_7.setBounds(509, 436, 140, 23);
		contentPane.add(button_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(334, 130, 81, 23);
		contentPane.add(textField_8);
		
		JButton button_8 = new JButton("Eliminar");
		button_8.setBounds(509, 470, 140, 23);
		contentPane.add(button_8);
		
		
	}
}

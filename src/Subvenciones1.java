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
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Subvenciones1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**ce
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Subvenciones1 frame = new Subvenciones1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**g
	 * Create the frame.
	 */
	public Subvenciones1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(132, 161, 585, 171);
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
			},
			new String[] {
				"Id", "Nombre", "Tel\u00E9fono", "Fecha Solicitud", "Importe Solicitado", "E-mail"
			}
		));
		scrollPane.setViewportView(table);
		
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
		
		JLabel lblSubvenciones = new JLabel("Subvenciones");
		lblSubvenciones.setBounds(112, 11, 210, 33);
		panel_1.add(lblSubvenciones);
		lblSubvenciones.setForeground(Color.WHITE);
		lblSubvenciones.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		
		JLabel label = new JLabel("Busqueda:");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(132, 64, 72, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("ID:");
		label_1.setBounds(142, 93, 59, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(197, 89, 81, 23);
		contentPane.add(textField);
		
		JLabel label_2 = new JLabel("Nombre:");
		label_2.setBounds(138, 132, 53, 14);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(197, 122, 81, 23);
		contentPane.add(textField_1);
		
		JLabel label_3 = new JLabel("Fecha");
		label_3.setBounds(289, 93, 46, 14);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(334, 89, 81, 23);
		contentPane.add(textField_2);
		
		JLabel lblImporte = new JLabel("Importe");
		lblImporte.setBounds(289, 132, 46, 14);
		contentPane.add(lblImporte);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(334, 128, 81, 23);
		contentPane.add(textField_3);
		
		JButton button_5 = new JButton("Buscar");
		button_5.setBounds(453, 123, 89, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Modificar");
		button_6.setBounds(565, 123, 112, 23);
		contentPane.add(button_6);
		
		JLabel label_5 = new JLabel("Nombre");
		label_5.setBounds(142, 345, 65, 14);
		contentPane.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(230, 342, 112, 20);
		contentPane.add(textField_4);
		
		JLabel label_6 = new JLabel("Tel\u00E9fono");
		label_6.setBounds(142, 370, 92, 14);
		contentPane.add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(230, 367, 112, 20);
		contentPane.add(textField_5);
		
		JLabel label_7 = new JLabel("Fecha solicitud");
		label_7.setBounds(142, 398, 86, 14);
		contentPane.add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(230, 395, 112, 20);
		contentPane.add(textField_6);
		
		JLabel lblImporteSolicitado = new JLabel("Importe solicitado");
		lblImporteSolicitado.setBounds(366, 345, 90, 14);
		contentPane.add(lblImporteSolicitado);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(454, 343, 112, 20);
		contentPane.add(textField_7);
		
		JLabel label_9 = new JLabel("E-mail");
		label_9.setBounds(366, 371, 56, 14);
		contentPane.add(label_9);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(454, 371, 112, 20);
		contentPane.add(textField_8);
		
		JButton button_7 = new JButton("A\u00F1adir/Modificar");
		button_7.setBounds(426, 419, 140, 23);
		contentPane.add(button_7);
		
		JLabel label_4 = new JLabel("Justificacion subvenci\u00F3n");
		label_4.setBounds(197, 423, 153, 14);
		contentPane.add(label_4);
		
		JButton button_8 = new JButton("Imprimir");
		button_8.setBounds(590, 419, 127, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("Enviar E-Mail");
		button_9.setBounds(590, 459, 127, 23);
		contentPane.add(button_9);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(144, 448, 242, 44);
		contentPane.add(textField_9);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(426, 459, 140, 23);
		contentPane.add(btnEliminar);
		
		
	}
}

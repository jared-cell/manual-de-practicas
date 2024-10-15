package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorJComboBox;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JcomboboxVista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtDESCC;
	private JTextField txtTIPOS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JcomboboxVista frame = new JcomboboxVista();
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
	public JcomboboxVista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton GUARDAR = new JButton("GUARDAR");
		GUARDAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorJComboBox cp=new ControladorJComboBox();
				cp.conexion();
			}
		});
		GUARDAR.setBounds(28, 216, 89, 23);
		contentPane.add(GUARDAR);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(10, 28, 46, 14);
		contentPane.add(lblID);
		
		JLabel lblDESCC = new JLabel("DESCC");
		lblDESCC.setBounds(10, 63, 46, 14);
		contentPane.add(lblDESCC);
		
		JLabel lblTIPOS = new JLabel("TIPOS");
		lblTIPOS.setBounds(10, 101, 46, 14);
		contentPane.add(lblTIPOS);
		
		txtID = new JTextField();
		txtID.setBounds(66, 25, 86, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtDESCC = new JTextField();
		txtDESCC.setBounds(66, 60, 86, 20);
		contentPane.add(txtDESCC);
		txtDESCC.setColumns(10);
		
		txtTIPOS = new JTextField();
		txtTIPOS.setBounds(66, 98, 86, 20);
		contentPane.add(txtTIPOS);
		txtTIPOS.setColumns(10);
	}
}

package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ControladorJComboBox {
	 Connection con;
	public Connection conexion() {
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/g311","root","");

			JOptionPane.showMessageDialog(null,"conectado: " );

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Error al conectar: " +e);
		}
		return con;
	}
	
}



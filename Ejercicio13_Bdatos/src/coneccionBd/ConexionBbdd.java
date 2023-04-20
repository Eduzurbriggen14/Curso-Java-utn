package coneccionBd;

import java.sql.*;

public class ConexionBbdd {
	
	private String driver="com.mysql.cj.jdbc.Driver";
	private String servidor="jdbc:mysql://localhost:3307/";
	private String bbdd="Qatar2022";
	private String usuario ="root";
	private String clave="Zurdo123";
	
	private Connection con;
	
	public void Conexion() {
		
		try {
			Class.forName(driver);
			
			con= DriverManager.getConnection(servidor + bbdd, usuario,clave);
			
			System.out.println("La coonexion fue exitosa \n");
			
		}catch(ClassNotFoundException | SQLException e ){
			
			System.out.println("Error, la conexion fallo");
			
			
		}
	}
	
	

	public Connection getConnection() {		
		Conexion();
		
		return con;
	}
}

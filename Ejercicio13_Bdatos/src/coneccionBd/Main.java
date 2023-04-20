package coneccionBd;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;

public class Main {

	private static final String PrepareStatement  = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Conexion();
		Conexion2();
		

	}
	/*public static void Conexion(){
		
		String driver="com.mysql.cj.jdbc.Driver";
		String servidor="jdbc:mysql://localhost:3307/";
		String bbdd="Qatar2022";
		String usuario ="root";
		String clave="Zurdo123";
		
		Connection con;
		
		try {
			
		
		Class.forName(driver);
		
		con= DriverManager.getConnection(servidor + bbdd, usuario,clave);
		
		System.out.println("La coonexion fue exitosa \n");
		
		Statement st= con.createStatement();
		
		ResultSet rs=st.executeQuery("select * from empleados"); 
		
		while(rs.next()) {  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		}
		st.close();
		con.close();  

		
		}
		catch(ClassNotFoundException | SQLException e ){
			
			System.out.println("Error, la conexion fallo");
			
			
		}
	}*/
	
	public static void Conexion2() {
		
		try {
			ConexionBbdd conexion2= new ConexionBbdd();
			Connection conexion= conexion2.getConnection();
			
			String insertar= "INSERT INTO empleados (dni, nombre, apellido, nacionalidad, id_departamento)\n "+ "VALUES" + "(?,?,?,?,?)";
			
			PreparedStatement ps= conexion.prepareStatement(insertar);
			
			ps.setInt(1, 36563241);
			ps.setString(2, "Emilse");
			ps.setString(3, "Yanstensqui");
			ps.setString(4, "Ucraniana");
			ps.setInt(5, 1);
			
			//ps.executeUpdate();
			
			//System.out.println("registro exitoso");
			
			String modNacionalidad= "update empleados\r\n"
					+ "set nacionalidad= 'Brasil'\r\n"
					+ "where id_empleado= '2'";
			
			PreparedStatement ps1= conexion.prepareStatement(modNacionalidad);
			
			//ps1.executeUpdate();
			
			//System.out.println("Se realizo el cambio de nacionaliad para el empleado cuyo id=2");
			
			String borrarDato= "DELETE from departamento\r\n"+ "WHERE id_departamento=6";
			
			PreparedStatement ps2= conexion.prepareStatement(borrarDato);
			
			//ps2.executeUpdate();
			
			//System.out.println("Se borro correctamente el departamento");
			
			String empleadosCompra= "select nombre, apellido\r\n"
					+ "from empleados\r\n"
					+ "where id_departamento= '2'";
			
			Statement ps3 = conexion.createStatement();
			
			//ResultSet res= ps3.executeQuery(empleadosCompra);
			
			/*while(res.next()) {
				
				System.out.println("Registro numero: " + res.getRow()+ "\n Nombre y apellido :"+ res.getString("nombre")+ " "+ res.getString("apellido"));
			}*/
			
			String mostrarDepartamentos= "select * from departamento\r\n"
					+ "order by descripcion asc";
			
			Statement ps4 = conexion.createStatement();
			
			ResultSet res1 = ps4.executeQuery(mostrarDepartamentos);
			
			while(res1.next()) {
				
				System.out.println("Fila/Registro numero "+ res1.getRow()+ "---> ID departamento , Descripcion: "+ res1.getString("id_departamento")+ ","+ res1.getString("descripcion"));
			}		
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			
			
			
		}
			
	}
}

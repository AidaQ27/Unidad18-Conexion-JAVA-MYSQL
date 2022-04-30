package Test07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conexionMysql {
	//Atributo de la clase
		private static Connection conexion;
		
		// Metodo para crear la conexion
		public static Connection mysqlConexion() {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conexion=DriverManager.getConnection("jdbc:mysql://192.168.1.48:3306?useTimezone=UTC", "remote", "Reus_2022");
				System.out.println("Servidor conectado");
				return conexion;
				
			}catch(SQLException | ClassNotFoundException ex) {
				System.out.println("No se ha podido conectar a la base de datos");
				System.out.println(ex);
				return null;
			}
		}
		
		// Metodo para crear la Base de datos
		public static void createBD(String name) {
			 conexion = mysqlConexion();  
			
			try {
				           
				String Query = "CREATE DATABASE " + name;	// Creamos la Query
				Statement st = conexion.createStatement(); 		// Realizamos el statement	
				st.executeUpdate(Query);					//Executo la Query
				System.out.println("Se ha creado la base de datos " + name);
				cerrarConexion();
				
				
			}catch (SQLException ex){
				System.out.println("No se ha podido crear la base de datos ");
				System.out.println(ex.getMessage());
				try{
					conexion.close();
				}catch(SQLException e) {
					System.out.println(e.getMessage());
					
				}
			}
			
			
		}
		
		// Metodo para crear la tabla
		public static void createTable(String bd, String name) {
			
		try {
			conexion = mysqlConexion();
			String Querybd = "USE "+bd+";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querybd);
			
			String Query = "CREATE TABLE "+name+""
					+ "(ID INT PRIMARY KEY , NOMBRE NVARCHAR(255), HORAS INT)";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada");
			cerrarConexion();
			
		}catch (SQLException ex) {
			System.out.println("Error al crear la tabla");
			System.out.println(ex.getMessage());
		}
			
			
	}	
		
		public static void createTable2(String bd, String name) {
			
		try {
			conexion = mysqlConexion();
			String Querybd = "USE "+bd+";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querybd);
			
			String Query = "CREATE TABLE "+name+""
					+ "(DNI VARCHAR(8) PRIMARY KEY , NOMBRE NVARCHAR(255))";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada");
			cerrarConexion();
			
		}catch (SQLException ex) {
			System.out.println("Error al crear la tabla");
			System.out.println(ex.getMessage());
		}
			
			
	}	
		
		
		public static void createTable3(String bd, String name) {
			
		try {
			conexion = mysqlConexion();
			String Querybd = "USE "+bd+";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querybd);
			
			String Query = "CREATE TABLE "+name+"("	
					+ "ID_ASIGNADO CHAR(10) PRIMARY KEY, "
					+ "ID_CIENTIFICO VARCHAR(8),"
					+ "KEY (ID_CIENTIFICO),"
					+ "FOREIGN KEY (ID_CIENTIFICO) REFERENCES CIENTIFICOS(DNI) "
					+ "ON DELETE CASCADE ON UPDATE CASCADE, "
					+ "ID_PROYECTO INT,"
					+ "KEY (ID_PROYECTO),"
					+ "FOREIGN KEY (ID_PROYECTO) REFERENCES PROYECTO(ID)  "
					+ "ON DELETE CASCADE ON UPDATE CASCADE)";
			
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada");
			cerrarConexion();
			
		}catch (SQLException ex) {
			System.out.println("Error al crear la tabla");
			System.out.println(ex.getMessage());
		}
			
			
	}	// Metodo para insertar datos
		public static void insertarDatos(String bd, String nombre_tabla, int id_proyecto, String nombre, int horas) {
			
			try {
				conexion = mysqlConexion();
				String Querybd = "USE "+bd+";";
				Statement stbd= conexion.createStatement();
				stbd.execute(Querybd);
				
				String Query = "INSERT INTO " + nombre_tabla + " (ID, NOMBRE, HORAS) VALUE("
						+ "\"" + id_proyecto+ "\", "
						+ "\"" + nombre+ "\", "
						+ "\""  + horas + "\"); ";
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);
				
				System.out.println("Datos almacenados correctamente");
				cerrarConexion();
				
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error al insertar");
			}
			
		}
		
		public static void insertarDatos2(String bd, String nombre_tabla, int dni, String nombre) {
			
			try {
				conexion = mysqlConexion();
				String Querybd = "USE "+bd+";";
				Statement stbd= conexion.createStatement();
				stbd.execute(Querybd);
				
				String Query = "INSERT INTO " + nombre_tabla + " (DNI, Nombre) VALUE("
						+ "\"" + dni + "\", "
						+ "\"" + nombre + "\"); ";
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);
				
				System.out.println("Datos almacenados correctamente");
				cerrarConexion();
				
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error al insertar");
			}
			
		}
		
		public static void insertarDatos3(String bd, String nombre_tabla,String id_asignado, int id_cientifico, int id_proyecto) {
			
			try {
				conexion = mysqlConexion();
				String Querybd = "USE "+bd+";";
				Statement stbd= conexion.createStatement();
				stbd.execute(Querybd);
				
				String Query = "INSERT INTO " + nombre_tabla + " (ID_ASIGNADO, ID_CIENTIFICO, ID_PROYECTO) VALUE("
						+ "\"" + id_asignado + "\", "
						+ "\"" + id_cientifico + "\", "		
						+ "\"" + id_proyecto + "\"); ";
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);
				
				System.out.println("Datos almacenados correctamente");
				cerrarConexion();
				
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error al insertar");
			}
			
		}
		
		
		
		
		// Metodo para consultar
		public static void consultaProyecto (String bd, String nombre_tabla) {
			
			try {
				conexion = mysqlConexion();
				String Querydb = "USE "+bd+";";
				Statement stbd = conexion.createStatement();
				stbd.execute(Querydb);
				
				String Query = "SELECT *  FROM " + nombre_tabla;
				Statement st = conexion.createStatement();
				java.sql.ResultSet resultSet;
				resultSet = st.executeQuery(Query);
				
				while (resultSet.next()) {
					System.out.println("ID: " + resultSet.getString("ID") + " "
							+ "-> Nombre: " + resultSet.getString("Nombre") + " "
							+ "-> Horas: " + resultSet.getString("Horas") + "");
					
				}
				cerrarConexion();
				
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error al recuperar los datos de " + nombre_tabla + " ");
			}
		}
		
		public static void consultaCientifico (String bd, String nombre_tabla) {
			
			try {
				conexion = mysqlConexion();
				String Querydb = "USE "+bd+";";
				Statement stbd = conexion.createStatement();
				stbd.execute(Querydb);
				
				String Query = "SELECT *  FROM " + nombre_tabla;
				Statement st = conexion.createStatement();
				java.sql.ResultSet resultSet;
				resultSet = st.executeQuery(Query);
				
				while (resultSet.next()) {
					System.out.println("DNI: " + resultSet.getString("DNI") + " "
							+ "-> Nombre: " + resultSet.getString("Nombre") + " ");
						
				}
				cerrarConexion();
				
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error al recuperar los datos de " + nombre_tabla + " ");
			}
		}
		
		public static void consultaAsignado (String bd, String nombre_tabla) {
			
			try {
				conexion = mysqlConexion();
				String Querydb = "USE "+bd+";";
				Statement stbd = conexion.createStatement();
				stbd.execute(Querydb);
				
				String Query = "SELECT *  FROM " + nombre_tabla;
				Statement st = conexion.createStatement();
				java.sql.ResultSet resultSet;
				resultSet = st.executeQuery(Query);
				
				while (resultSet.next()) {
					System.out.println("ID_ASIGANDO: " + resultSet.getString("ID_ASIGNADO") + " "
							+ "-> ID_CIENTIFICO: " + resultSet.getString("ID_CIENTIFICO") + " "
							+ "-> ID_PROYECTO: " + resultSet.getString("ID_PROYECTO") + "");
					
				}
				cerrarConexion();
				
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error al recuperar los datos de " + nombre_tabla + " ");
			}
		}
		
		
		// Metodo para borrar registro
		public static void borrarRegistro (String bd, String nombre_tabla, String ID) {
			
			try {
				conexion = mysqlConexion();
				String Querybd = "USE "+bd+";";
				Statement stbd = conexion.createStatement();
				stbd.execute(Querybd);
				String Query = "DELETE FROM " + nombre_tabla + " WHERE ID = \"" + ID + "\"";
				Statement st = conexion.createStatement();
				st.execute(Query);
				System.out.println("El registro " +ID+ " se ha borrado correctamente");
				cerrarConexion();
				
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error al borrar el registro");
			}
		}
		
		
		//Metodo para cerrar conexion
		public static void cerrarConexion () {
			try {
				conexion.close();
				//System.out.println("Se ha finalizado la conexion");
			} catch (SQLException ex) {
				System.out.println("No se podido cerrar la conexion.");
				System.out.println(ex.getMessage());
			}
			
		}
	}
		





package test06;

import java.sql.Statement;
import conexionMySQL.ConexionMysql;

public class mainApp {

	public static void main(String[] args) {
		
		ConexionMysql cmysql = new ConexionMysql();
		
		cmysql.conectar();
		
		/*
		 * Crear base de datos "piezas y proveedores"
		 */
//		cmysql.createDB("piezasProveedores");
		
		/*
		 * Crear tabla piezas
		 */
//		cmysql.insertQuery("piezasProveedores", "CREATE TABLE piezas (ID INT PRIMARY KEY, nombre VARCHAR(100) NOT NULL);");
		
		/*
		 * Crear tabla proveedores
		 */
//		cmysql.insertQuery("piezasProveedores", "CREATE TABLE proveedores (ID CHAR(4) PRIMARY KEY"
//				+ ", nombre VARCHAR(100) NOT NULL);");
		 
		/*
		 * Crear tabla intermedia suministra 
		 */
//		cmysql.insertQuery("piezasProveedores", "CREATE TABLE suministra ("
//				+ "ID_suministra INT PRIMARY KEY AUTO_INCREMENT, "
//				+ "ID_codigo_pieza INT,"
//				+ "KEY (ID_codigo_pieza),"
//				+ "FOREIGN KEY (ID_codigo_pieza) REFERENCES piezas(ID) ON DELETE CASCADE ON UPDATE CASCADE, "
//				+ "ID_proveedor CHAR(4),"
//				+ "KEY (ID_proveedor),"
//				+ "FOREIGN KEY (ID_proveedor) REFERENCES proveedores(ID) ON DELETE CASCADE ON UPDATE CASCADE, "
//				+ "precio INT)");
		
		/*
		 * Insertar registros en la tabla piezas		
		 */
//		String sqlQuery = "INSERT INTO piezas(nombre) VALUE"
//				+ "(\"ventilador\"),"
//				+ "(\"retrovisor\"),"
//				+ "(\"minitelevisor\"),"
//				+ "(\"tornillo\");";	
//		cmysql.insertQuery("piezasProveedores", sqlQuery);
		
		cmysql.desconectar();

	}

}

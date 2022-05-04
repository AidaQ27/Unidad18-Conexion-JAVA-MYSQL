package test08;

import conexionMySQL.ConexionMysql;

public class mainApp {

	public static void main(String[] args) {

		ConexionMysql mysql = new ConexionMysql();
		String sqlQuery = "";

		/*
		 * Conectar a mysql server
		 */
		mysql.conectar();

		/*
		 * Crear base de datos ciencia
		 */
//		mysql.createDB("grandes_almacenes");

		/*
		 * Crear tabla productos
		 */
//		sqlQuery = "CREATE TABLE productos ("
//				+ "codigo INT PRIMARY KEY AUTO_INCREMENT,"
//				+ "nombre VARCHAR(100) NOT NULL,"
//				+ "precio INT);";
//		mysql.insertQuery("grandes_almacenes", sqlQuery);

//		/*
//		 * Crear tabla cajeros
//		 */
//		sqlQuery = "CREATE TABLE cajeros ("
//				+ "codigo INT PRIMARY KEY AUTO_INCREMENT,"
//				+ "nom_apels VARCHAR(255) NOT NULL);";
//		mysql.insertQuery("grandes_almacenes", sqlQuery);
//		
//		/*
//		 * Crear tabla maquinas_registradoras
//		 */
//		sqlQuery = "CREATE TABLE maquinas_registradoras ("
//				+ "codigo INT PRIMARY KEY AUTO_INCREMENT,"
//				+ "piso int)";
//		mysql.insertQuery("grandes_almacenes", sqlQuery);
		
		/*
		 * Crear tabla ventas
		 */
//		sqlQuery = "CREATE TABLE ventas("
//				+ "ID_venta INT NOT NULL,"
//				+ "cajero INT,"
//				+ "maquina INT,"
//				+ "producto INT,"
//				+ "CONSTRAINT FK_cajero FOREIGN KEY (cajero) REFERENCES cajeros(codigo) ON DELETE CASCADE ON UPDATE CASCADE,"
//				+ "CONSTRAINT FK_maquina FOREIGN KEY (maquina) REFERENCES maquinas_registradoras(codigo) ON DELETE CASCADE ON UPDATE CASCADE,"
//				+ "CONSTRAINT FK_producto FOREIGN KEY (producto) REFERENCES productos(codigo) ON DELETE CASCADE ON UPDATE CASCADE);";
//		mysql.insertQuery("grandes_almacenes", sqlQuery);
		
		
		/*
		 * Desconectar de mysql server
		 */
		mysql.desconectar();

	}

}

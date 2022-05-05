package test03;

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
		 * Crear base de datos Almacenes
		 */
		mysql.createDB("Almacenes");

		/*
		 * Crear tabla almacen
		 */
		sqlQuery = "CREATE TABLE almacen ("
				+ "Codigo INT PRIMARY KEY AUTO_INCREMENT, Lugar VARCHAR(100) NOT NULL , Capacidad INT);";
		mysql.insertQuery("Almacenes", sqlQuery);

		/*
		 * Crear tabla cajas
		 */
		sqlQuery = "CREATE TABLE cajas ("
				+ "ID INT AUTO_INCREMENT PRIMARY KEY, Contenido VARCHAR(100) NOT NULL,"
				+ "Valor INT,"
				+ "Codigo INT,"
				+ "CONSTRAINT FK_almacen FOREIGN KEY (Codigo) REFERENCES almacen(Codigo) ON DELETE CASCADE ON UPDATE CASCADE);";
		mysql.insertQuery("Almacenes", sqlQuery);

		/*
		 * Insertar registros en la tabla almacen
		 */

		sqlQuery = "INSERT INTO almacen(Lugar, Capacidad) VALUE" 
		+ "(\"Barcelona\", 5),"
		+ "(\"Málaga\", 10),"
		+ "(\"Madrid\", 2),"
		+ "(\"San Sebastian\", 7),"
		+ "(\"Zaragoza\", 12);";
		mysql.insertQuery("Almacenes", sqlQuery);
		
		/*
		 * Insertar registros en la tabla cajas
		 */
		sqlQuery = "INSERT INTO cajas(Contenido, Valor, Codigo) VALUE" 
		+ "(\"Vino\", 25, 1),"
		+ "(\"Carne\", 12, 2),"
		+ "(\"Harina\", 5, 3),"
		+ "(\"Legumbres\", 50, 2),"
		+ "(\"Pescado\", 32, 4);";
		mysql.insertQuery("Almacenes", sqlQuery);
		
		/*
		 * Desconectar de mysql server
		 */
		mysql.desconectar();

	}

}

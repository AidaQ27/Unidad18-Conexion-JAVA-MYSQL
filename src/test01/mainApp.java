package test01;

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
		 * Crear base de datos informatica
		 */
		mysql.createDB("informatica");

		/*
		 * Crear tabla fabricantes
		 */
		sqlQuery = "CREATE TABLE fabricantes ("
				+ "ID INT PRIMARY KEY AUTO_INCREMENT, nombre VARCHAR(100) NOT NULL);";
		mysql.insertQuery("informatica", sqlQuery);

		/*
		 * Crear tabla articulos
		 */
		sqlQuery = "CREATE TABLE articulos ("
				+ "ID INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(100) NOT NULL,"
				+ "precio INT,"
				+ "fabricante INT,"
				+ "FOREIGN KEY (fabricante) REFERENCES fabricantes(ID) ON DELETE CASCADE ON UPDATE CASCADE);";
		mysql.insertQuery("informatica", sqlQuery);

		/*
		 * Insertar registros en la tabla fabricantes
		 */

		sqlQuery = "INSERT INTO fabricantes(nombre) VALUE" 
		+ "(\"Sony\"),"
		+ "(\"Iomega\")," 
		+ "(\"Fujitsu\");";
		mysql.insertQuery("informatica", sqlQuery);
		
		/*
		 * Insertar registros en la tabla articulos 
		 */
		sqlQuery = "INSERT INTO articulos(nombre, precio, fabricante) VALUE" 
		+ "(\"Hard Drive\", 206, 1),"
		+ "(\"Memory\", 108, 2)," 
		+ "(\"Monitor\", 299, 3);";
		mysql.insertQuery("informatica", sqlQuery);
		
		/*
		 * Desconectar de mysql server
		 */
		mysql.desconectar();

	}

}

package test09;

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
		 * Crear base de datos Investigadores
		 */
		mysql.createDB("Investigadores");

		/*
		 * Crear tabla investigadores
		 */
		sqlQuery = "CREATE TABLE investigadores ("
				+ "DNI VARCHAR(10) PRIMARY KEY, NomApellidos VARCHAR(100) NOT NULL , Facultad INT);";
		mysql.insertQuery("Investigadores", sqlQuery);

		/*
		 * Crear tabla facultad
		 */
		sqlQuery = "CREATE TABLE facultad ("
				+ "Codigo INT AUTO_INCREMENT PRIMARY KEY, Nombre VARCHAR(100) NOT NULL);";
		mysql.insertQuery("Investigadores", sqlQuery);
		
		/*
		 * Crear tabla equipos
		 */
		sqlQuery = "CREATE TABLE equipos ("
				+ "NumSerie CHAR(4) PRIMARY KEY, Nombre VARCHAR(100) NOT NULL, Facultad INT, Codigo INT,"
				+ "CONSTRAINT FK_facultad FOREIGN KEY (Codigo) REFERENCES facultad(Codigo) ON DELETE CASCADE ON UPDATE CASCADE);";
		mysql.insertQuery("Investigadores", sqlQuery);

		/*
		 * Crear tabla reserva
		 */
		sqlQuery = "CREATE TABLE reserva ("
				+ "ID INT AUTO_INCREMENT PRIMARY KEY, DNI VARCHAR(10) NOT NULL, NumSerie CHAR(4) NOT NULL,"
				+ "CONSTRAINT FK_DNI FOREIGN KEY (DNI) REFERENCES investigadores(DNI),"
				+ "CONSTRAINT FK_NumSerie FOREIGN KEY (NumSerie) REFERENCES equipos(NumSerie) ON DELETE CASCADE ON UPDATE CASCADE);";
		mysql.insertQuery("Investigadores", sqlQuery);
		
		
		/*
		 * Insertar registros en la tabla investigadores
		 */

		sqlQuery = "INSERT INTO investigadores(DNI, NomApellidos, Facultad) VALUE" 
		+ "(\"39324562B\",\"Maria Ramirez\", 2),"
		+ "(\"39247289V\",\"Manolo Lama\", 1),"
		+ "(\"39183471G\",\"Belen Gutierrez\", 3),"
		+ "(\"39183948J\",\"Juan Garcia\", 4),"
		+ "(\"39192398I\",\"Azucena Monte\", 1);";
		mysql.insertQuery("Investigadores", sqlQuery);
		
		/*
		 * Insertar registros en la tabla facultad
		 */

		sqlQuery = "INSERT INTO facultad(Codigo, Nombre) VALUE" 
		+ "(1 , \"Economicas\"),"
		+ "(2 , \"Derecho\"),"
		+ "(3 ,  \"Medicina\"),"
		+ "(4 , \"Arquitectura\"),"
		+ "(5 , \"Ciencias Politicas\");";
		mysql.insertQuery("Investigadores", sqlQuery);
		
		/*
		 * Insertar registros en la tabla equipo
		 */

		sqlQuery = "INSERT INTO equipos (NumSerie, Nombre, Facultad) VALUE" 
		+ "(1 , \"Equipo1\",1),"
		+ "(2 , \"Equipo2\",2),"
		+ "(3 ,  \"Equipo3\",3),"
		+ "(4 , \"Equipo4\",4),"
		+ "(5 , \"Equipo5\",5);";
		mysql.insertQuery("Investigadores", sqlQuery);
		
		
		/*
		 * Insertar registros en la tabla reserva
		 */
		sqlQuery = "INSERT INTO reserva(ID, DNI, NumSerie) VALUE" 
		+ "(1,\"39324562B\",1),"
		+ "(2,\"39247289V\",2),"
		+ "(3,\"39183471G\",3),"
		+ "(4,\"39183948J\",4),"
		+ "(5,\"39192398I\",5);";
		mysql.insertQuery("Investigadores", sqlQuery);
		
		/*
		 * Desconectar de mysql server
		 */
		mysql.desconectar();
	}

}

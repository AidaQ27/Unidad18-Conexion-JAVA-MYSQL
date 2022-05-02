package conexionMySQL;

public class mainApp {

	public static void main(String[] args) {
		ConexionMysql conexionMysql = new ConexionMysql();
		
		conexionMysql.conectar();
//		conexionMysql.createTable("pepe", "juguetes", "nombre");
//		conexionMysql.dropTable("pepe", "asd");
//		conexionMysql.insertRow("pepe", "INSERT INTO juguetes (nombre) VALUES (\"bloques\");");
//		conexionMysql.deleteRow("pepe", "juguetes", 11);
//		conexionMysql.showRows("pepe", "juguetes", 13);
		conexionMysql.createDB("informatica");
		// Tabla  fabricantes
		
//		conexionMysql.insertQuery("informatica", "CREATE TABLE fabricantes (Codigo INT PRIMARY KEY AUTO_INCREMENT, Nombre VARCHAR(100))");
	
		// Tabla articulos

		conexionMysql.desconectar();

	}

}

package conexionMySQL;

public class mainApp {

	public static void main(String[] args) {
		ConexionMysql conexionMysql = new ConexionMysql();
		
		conexionMysql.conectar();
		
		// Crear bd informatica - Ej1
//		conexionMysql.createDB("informatica");
		
		// Tabla  fabricantes
//		conexionMysql.insertQuery("informatica", "CREATE TABLE fabricantes (Codigo INT PRIMARY KEY AUTO_INCREMENT, Nombre VARCHAR(100))");
	
		// Tabla articulos
		conexionMysql.insertQuery("informatica", "CREATE TABLE articulos (Codigo INT PRIMARY KEY AUTO_INCREMENT, Nombre VARCHAR(100))");

		conexionMysql.desconectar();

	}

}

package conexionMySQL;

public class InformaticaDB {
	
	public static void createDB() {
		
		// Connect to mysql server
		ConexionMysql conexionMysql = new ConexionMysql();
		conexionMysql.conectar();
		
		// Create DB
		
		// Create tables
		
		// Disconnect from mysql server
		conexionMysql.desconectar();
		
		
		
	}

}

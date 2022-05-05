package Test04;


import conexionMySQL.ConexionMysql_EX4_EX5;

public class mainApp {

	public static void main(String[] args) {

		ConexionMysql_EX4_EX5.openConnection();

		ConexionMysql_EX4_EX5.createDB("Peliculas_y_Salas");


		ConexionMysql_EX4_EX5.createTable("Peliculas_y_Salas", "Peliculas", Peliculas.tablaPeliculas);
		ConexionMysql_EX4_EX5.createTable("Peliculas_y_Salas", "Salas", Peliculas.tablaSalas);

		ConexionMysql_EX4_EX5.insertData("Peliculas_y_Salas", "Peliculas", Peliculas.insercionPeliculas);
		ConexionMysql_EX4_EX5.insertData("Peliculas_y_Salas", "Salas", Peliculas.insercionSalas);

		ConexionMysql_EX4_EX5.getValores_ex04("Peliculas_y_Salas", "Peliculas");

		ConexionMysql_EX4_EX5.deleteRecord_ex04("Peliculas_y_Salas", "Peliculas", 1);

		ConexionMysql_EX4_EX5.getValores_ex04("Peliculas_y_Salas", "Peliculas");

		ConexionMysql_EX4_EX5.closeConnection();

	}

}

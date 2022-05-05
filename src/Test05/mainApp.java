package Test05;

import conexionMySQL.ConexionMysql_EX4_EX5;

public class mainApp {

	public static void main(String[] args) {

		ConexionMysql_EX4_EX5.openConnection();

		ConexionMysql_EX4_EX5.createDB("Los_Directores");


		ConexionMysql_EX4_EX5.createTable("Los_Directores", "Despachos", Directores.tablaDespachos);
		ConexionMysql_EX4_EX5.createTable("Los_Directores", "Directores", Directores.tablaDirectores);

		ConexionMysql_EX4_EX5.insertData("Los_Directores", "Despachos", Directores.insercionDespachos);
		ConexionMysql_EX4_EX5.insertData("Los_Directores", "Directores", Directores.insercionDirectores);

		ConexionMysql_EX4_EX5.getValores_ex05("Los_Directores", "Directores");

		ConexionMysql_EX4_EX5.deleteRecord_ex05("Los_Directores", "Directores", 1);

		ConexionMysql_EX4_EX5.getValores_ex05("Los_Directores", "Directores");

		ConexionMysql_EX4_EX5.closeConnection();

	}

}
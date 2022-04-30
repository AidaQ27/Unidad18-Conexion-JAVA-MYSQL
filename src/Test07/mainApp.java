package Test07;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		conexionMysql.mysqlConexion();
		//conexionMysql.createBD("Ej07");
		
		//conexionMysql.createTable("Ej07", "PROYECTO");
		//conexionMysql.createTable2("Ej07", "CIENTIFICOS");
		//conexionMysql.createTable3("Ej07", "ASIGNADO_A");
		
		//conexionMysql.insertarDatos("Ej07", "PROYECTO", 1, "XET", 140);
		//conexionMysql.insertarDatos("Ej07", "PROYECTO", 2, "POT", 120);
		//conexionMysql.insertarDatos("Ej07", "PROYECTO", 3, "FRE", 300);
		//conexionMysql.insertarDatos("Ej07", "PROYECTO", 4, "DFF", 510);
		//conexionMysql.insertarDatos("Ej07", "PROYECTO", 5, "XES", 250);
		//conexionMysql.insertarDatos("Ej07", "PROYECTO", 6, "POT", 190);
		
		//conexionMysql.insertarDatos2("Ej07", "CIENTIFICOS", 39958471, "Ramón Maldonado");
		//conexionMysql.insertarDatos2("Ej07", "CIENTIFICOS", 30258974, "Julieta Venegas");
		//conexionMysql.insertarDatos2("Ej07", "CIENTIFICOS", 39987842, "Rebeca Brown");
		//conexionMysql.insertarDatos2("Ej07", "CIENTIFICOS", 39021458, "Katty Perry");
		
		//conexionMysql.insertarDatos3("Ej07", "ASIGNADO_A", "B01",39021458, 2);
		//conexionMysql.insertarDatos3("Ej07", "ASIGNADO_A", "B22",30258974, 3);
		//conexionMysql.insertarDatos3("Ej07", "ASIGNADO_A", "C11",39987842, 5);
		//conexionMysql.insertarDatos3("Ej07", "ASIGNADO_A", "D09",39958471, 2);
		//conexionMysql.insertarDatos3("Ej07", "ASIGNADO_A", "F33",30258974, 1);
		
		conexionMysql.consultaProyecto("Ej07", "PROYECTO");
		conexionMysql.consultaCientifico("Ej07", "CIENTIFICOS");
		conexionMysql.consultaAsignado("Ej07", "ASIGNADO_A");
		
		conexionMysql.borrarRegistro("Ej07", "PROYECTO", "1");
	}

}

package Test02;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		conexionMysql.createBD("empleados");
		conexionMysql.createTable("empleados", "departamento");
		conexionMysql.createTable2("empleados", "empleado");

		conexionMysql.insertarDatos("empleados", "departamento", "RRHH", 25000);
		conexionMysql.insertarDatos("empleados", "departamento", "Logistica", 35000);
		conexionMysql.insertarDatos("empleados", "departamento", "Marketing", 36000);
		conexionMysql.insertarDatos("empleados", "departamento", "Compras", 27000);
		conexionMysql.insertarDatos("empleados", "departamento", "Publicidad", 29000);
		
	conexionMysql.insertarDatos2("empleados", "empleado", 39902256, "Maria", "Porto", 1);
	conexionMysql.insertarDatos2("empleados", "empleado", 39905256, "Marta", "Parra", 1);
	conexionMysql.insertarDatos2("empleados", "empleado", 38902266, "Martin", "Marín", 2);
	conexionMysql.insertarDatos2("empleados", "empleado", 32102223, "Magda", "Potrillo", 3);
	conexionMysql.insertarDatos2("empleados", "empleado", 39021545, "Inés", "Bonet", 4);
	conexionMysql.insertarDatos2("empleados", "empleado", 39987841, "Fran", "Abella", 5);
	
	conexionMysql.consultaDept("empleados", "departamento");
	conexionMysql.consultaEmpl("empleados", "empleado");
	
	conexionMysql.borrarRegistro("empleados","departamento", "1");
	
	}

}

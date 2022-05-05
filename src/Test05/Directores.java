package Test05;

public class Directores {
		
		public static String tablaDespachos = "(Numero int,"
				+ "Capacidad int DEFAULT NULL,"
				+ "PRIMARY KEY (Numero));";

		public static String tablaDirectores = "(DNI varchar(8),"
				+ "NomApels varchar(255) DEFAULT NULL,"
				+ "DNIJefe varchar(8) DEFAULT NULL,"
				+ "Despacho int DEFAULT NULL,"
				+ "PRIMARY KEY (DNI),"
				+ "KEY DNIJefe (DNIJefe),"
				+ "KEY Despacho (Despacho),"
				+ "CONSTRAINT Directores_ibfk_1 FOREIGN KEY (DNIJefe) REFERENCES Directores (DNI) ON DELETE CASCADE,"
				+ "CONSTRAINT Directores_ibfk_2 FOREIGN KEY (Despacho) REFERENCES Despachos (Numero) ON DELETE CASCADE);";
					
		public static String insercionDespachos = "(Numero, Capacidad) values "
				+ "(1, 300),"
				+ "(2, 50),"
				+ "(3, 68),"
				+ "(4, 74),"
				+ "(5, 33);";
		
		public static String insercionDirectores = "(DNI, NomApels, DNIJefe, Despacho) values "
				+ "('75395182O', 'Gerard Sanchez', 369968527, 1),"
				+ "('15935746A', 'Aida Queralt', '321789654', 2),"
				+ "('25874196D', 'Constantin Vlad', '357951852', 3),"
				+ "('36985214C', 'Gerard Viñuela', '365478912', 4),"
				+ "('74963215B', 'Pepe Fernandez', '325174896', 5);";

	}
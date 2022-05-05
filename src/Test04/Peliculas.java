package Test04;

public class Peliculas {

	public static String tablaPeliculas = "(Codigo int NOT NULL AUTO_INCREMENT, "
			  + "Nombre varchar(100) DEFAULT NULL, "
			  + "CalificacionEdad int DEFAULT NULL, "
			  + "PRIMARY KEY (Codigo))";

	public static String tablaSalas = "(Codigo int NOT NULL AUTO_INCREMENT, "
			  + "Nombre varchar(100) DEFAULT NULL, "
			  + "Pelicula int DEFAULT NULL, "
			  + "PRIMARY KEY (Codigo), "
			  + "KEY Pelicula (Pelicula), "
			  + "CONSTRAINT Salas_ibfk_1 FOREIGN KEY (Pelicula) REFERENCES Peliculas (Codigo) "			  
			  + "ON DELETE CASCADE);";
				
	public static String insercionPeliculas = "(Nombre, CalificacionEdad) values "
			+ "('Doctor Strange en el Multiverso de la Locura', 12),"
			+ "('The Northman', 16),"
			+ "('X', 18),"
			+ "('Sonic 2, la película', 7),"
			+ "('Downton Abbey: A New Era', 0);";
	
	public static String insercionSalas = "(Nombre, Pelicula) values "
			+ "('Sala luna', 1),"
			+ "('Sala estrella', 2),"
			+ "('Sala sol', 4),"
			+ "('Sala polar', 5),"
			+ "('Sala carro', 3)";
}


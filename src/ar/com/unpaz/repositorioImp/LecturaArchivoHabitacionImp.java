package ar.com.unpaz.repositorioImp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Habitacion;
import ar.com.unpaz.repositorio.LecturaArchivoHabitacion;

public class LecturaArchivoHabitacionImp implements LecturaArchivoHabitacion{

	@Override
	public List<Habitacion> obtenerHabitaciones() {
		List<Habitacion> habitaciones = new ArrayList<>();
		File sFile = new File("habitaciones.txt");
		FileReader sFileReader;
		try {
			sFileReader = new FileReader(sFile);
			BufferedReader sBuffer = new BufferedReader(sFileReader);
			String linea = "";
			while ((linea = sBuffer.readLine())!=null) {
				String [] array = linea.split(";");
				int numeroHabitacion = Integer.parseInt(array[0]);
				String tipoHabitacion = array[1];
				double precioPorNoche = Double.parseDouble(array[2]);
	
				habitaciones.add(new Habitacion(numeroHabitacion, tipoHabitacion, precioPorNoche));
				
			}
		} catch (Exception e) {
		    System.out.println("❌ saltó el catch en la lectura de habitaciones! El error es:");
		    e.printStackTrace();
		}
		
		return habitaciones;
	}

}

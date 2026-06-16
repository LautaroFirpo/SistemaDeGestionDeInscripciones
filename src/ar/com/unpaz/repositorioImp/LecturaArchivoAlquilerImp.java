package ar.com.unpaz.repositorioImp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import ar.com.unpaz.model.*;
import ar.com.unpaz.repositorio.LecturaArchivoAlquiler;
import ar.com.unpaz.repositorio.LecturaArchivoHabitacion;

public class LecturaArchivoAlquilerImp implements LecturaArchivoAlquiler{

	private LecturaArchivoHabitacion repoHabitacion;
	
	public LecturaArchivoAlquilerImp(LecturaArchivoHabitacion repoHabitacion) {
		this.repoHabitacion = repoHabitacion;
	}


	@Override
	public List<Alquiler> obtenerAlquileres() {
		List<Alquiler> alquileres = new ArrayList<>();
		
		List<Habitacion> habitacionesLocal = this.repoHabitacion.obtenerHabitaciones();
		
		if (habitacionesLocal == null || habitacionesLocal.isEmpty()) {
	        System.out.println("Error: No se pudieron precargar las habitaciones.");
	        return alquileres;
	    }
		File sFile = new File("alquileres.txt");
		FileReader sFileReader;
		try {
			sFileReader = new FileReader(sFile);
			BufferedReader sBuffer = new BufferedReader(sFileReader);
			String linea = "";
			while ((linea = sBuffer.readLine())!=null) {
				String [] array = linea.split(";");
				
				int idAlquiler = Integer.parseInt(array[0]);
				int numeroHabitacion = Integer.parseInt(array[1]);
				String cliente = array[2];
				int cantidadNoches = Integer.parseInt(array[3]);
				
				Habitacion habitacion = null;
				for (Habitacion h : habitacionesLocal) {
					if (h.getNumeroHabitacion() == numeroHabitacion) {
						habitacion = h;
						break;
					}
				}
				if (habitacion == null)continue;
				
				if (habitacion.getTipoHabitacion().equalsIgnoreCase("COMUN")) {
					alquileres.add(new AlquilerComun(idAlquiler,numeroHabitacion,cliente,cantidadNoches, habitacion));
				} else if (habitacion.getTipoHabitacion().equalsIgnoreCase("PREMIUM")) {
					String datoExtra = array[4];
					alquileres.add(new AlquilerPremium(idAlquiler,numeroHabitacion,cliente,cantidadNoches,habitacion,datoExtra));
				}
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return alquileres;
	}



	


}

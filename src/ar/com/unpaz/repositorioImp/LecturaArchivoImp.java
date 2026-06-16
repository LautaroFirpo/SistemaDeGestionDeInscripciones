package ar.com.unpaz.repositorioImp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Inscripcion;
import ar.com.unpaz.model.InscripcionInicial;
import ar.com.unpaz.model.InscripcionPaseLibre;
import ar.com.unpaz.repositorio.LecturaArchivo;

public class LecturaArchivoImp implements LecturaArchivo{

	@Override
	public List<Inscripcion> obtenerInscripciones() {
		List<Inscripcion> inscripciones = new ArrayList<>();
		File sFile = new File("inscripciones.txt");
		FileReader sFileReader;
		try {
			sFileReader = new FileReader(sFile);
			BufferedReader sBuffer = new BufferedReader(sFileReader);
			String linea = "";
			while ((linea = sBuffer.readLine()) != null) {
				String [] array = linea.split(";");
				String tipo = array[0];
				int codigo = Integer.parseInt(array[1]);
				String socio = array[2];
				int mesesContratados = Integer.parseInt(array[3]);
				double precioPorMes = Double.parseDouble(array[4]);
				if (tipo.equalsIgnoreCase("I")) {
					inscripciones.add(new InscripcionInicial(tipo, codigo, socio, mesesContratados, precioPorMes));
				}
				if (tipo.equalsIgnoreCase("P")) {
					String disciplinaExtra = array[5];
					inscripciones.add(new InscripcionPaseLibre(tipo, codigo, socio, mesesContratados, precioPorMes, disciplinaExtra));
				}
			}
				
		} catch(Exception e) {
			e.printStackTrace();
		}
		return inscripciones;
	}

}

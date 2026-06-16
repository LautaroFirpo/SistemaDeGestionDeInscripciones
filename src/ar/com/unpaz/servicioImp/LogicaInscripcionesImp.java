package ar.com.unpaz.servicioImp;

import java.util.List;

import ar.com.unpaz.model.Inscripcion;
import ar.com.unpaz.model.InscripcionInicial;
import ar.com.unpaz.model.InscripcionPaseLibre;
import ar.com.unpaz.servicio.LogicaInscripciones;

public class LogicaInscripcionesImp implements LogicaInscripciones{

	@Override
	public void mostrarInsNombreYCostoFinal(List<Inscripcion> inscripciones) {
		for (Inscripcion i : inscripciones) {
			System.out.println("Socio: "+ i.getSocio() + ", Costo final: " + i.calcularCostoFinal());
		}
	}

	@Override
	public void buscarInscripcion(List<Inscripcion> inscripciones, int codigo) {
		boolean existe = false;
		for (Inscripcion i : inscripciones) {
			if (i.getCodigo() == codigo) {
				System.out.println(i);
				existe = true;
				break;
			}
		}
		if (!existe) {
			System.out.println("No se encontro la ins con el codigo: " + codigo);
		}
	}

	@Override
	public void calcularRecaudacionTotal(List<Inscripcion> inscripciones) {
		double total= 0;
		for (Inscripcion i : inscripciones) {
			total += i.calcularCostoFinal();
		}
		System.out.println("La recaudacion total es: " + total);
	}

	@Override
	public void mostrarInsMayorCostoFinal(List<Inscripcion> inscripciones) {
		double mayor = 0;
		Inscripcion ins = null;
		for (Inscripcion i : inscripciones) {
			if (i.calcularCostoFinal() > mayor) {
				mayor = i.calcularCostoFinal();
				ins = i;
			}
		}
		System.out.println("La ins mayor es: " + ins);
	}

	@Override
	public void mostrarCuantasInsPaseLibre(List<Inscripcion> inscripciones) {
		int cont = 0;
		for (Inscripcion i : inscripciones) {
			if (i instanceof InscripcionPaseLibre){
				cont += 1;
			}
		}
		System.out.println("La cant de pase libre es: " + cont);
	}

	@Override
	public void mostrarSociosCostoFinalMayor80000(List<Inscripcion> inscripciones) {
		for (Inscripcion i : inscripciones) {
			if (i.calcularCostoFinal() > 80000) {
				System.out.println(i);
			}
		}
	}

	@Override
	public void calcularPromedioCostoFinalInsInicial(List<Inscripcion> inscripciones) {
		int cant = 0;
		double total = 0;
		for (Inscripcion i : inscripciones) {
			if (i instanceof InscripcionInicial){
				total += i.calcularCostoFinal();
				cant +=1;
			}
		}
		if (cant > 0) {
			double prom = total/cant;
			System.out.println("El promedio de ins inicial es: " + prom);
		} else {
			System.out.println("No hay inscripciones para promediar");
		}
		
	}

	@Override
	public void mostrarNombresMayus(List<Inscripcion> inscripciones) {
		for (Inscripcion i : inscripciones) {
			System.out.println(i.getSocio().toUpperCase());
		}
	}

}

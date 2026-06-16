package ar.com.unpaz.servicioImp;

import java.util.List;

import ar.com.unpaz.model.Alquiler;
import ar.com.unpaz.model.AlquilerPremium;
import ar.com.unpaz.servicio.LogicaAlquiler;

public class LogicaAlquilerImp implements LogicaAlquiler{

	@Override
	public void mostrarAlquileres(List<Alquiler> alquileres) {
		if (alquileres.isEmpty()) return;
		for (Alquiler a : alquileres) {
			System.out.println(a);
		}
		
	}

	@Override
	public void calcularRecaudacionTotal(List<Alquiler> alquileres) {
		if (alquileres.isEmpty()) return;
		double total = 0;
		for (Alquiler a : alquileres) {
			total += a.calcularCostoFinal();
		}
		System.out.println("La recaudacion total: " + total);
	}

	@Override
	public void buscarAlquilerPorNombre(List<Alquiler> alquileres, String nombre) {
		if (alquileres.isEmpty()) return;
		boolean encontrado = false;
		for (Alquiler a : alquileres) {
			if (a.getCliente().equalsIgnoreCase(nombre)) {
				System.out.println("Alquiler encontrado \n" + a);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("El Alquiler no ha sido encontrado");
		}
	}

	@Override
	public void cuantosServiciosSPAAlquileresPremium(List<Alquiler> alquileres) {
		if (alquileres.isEmpty()) return;
		int cant = 0;
		for (Alquiler a : alquileres) {
			if (a instanceof AlquilerPremium) {
				if((((AlquilerPremium) a).getServicioExtra().equalsIgnoreCase("SPA"))) {
					cant +=1;
				}
			}
		}
		System.out.println("La cantidad es: " + cant);
	}

	@Override
	public void mostrarAlquilerBarato(List<Alquiler> alquileres) {
		if (alquileres.isEmpty()) return;
		Alquiler alquiler = alquileres.get(0);
		double minimo = alquiler.calcularCostoFinal();
		for (Alquiler a : alquileres) {
			if (a.calcularCostoFinal() < minimo) {
				minimo = a.calcularCostoFinal();
				alquiler = a;
			}
		}
		System.out.println("El mas barato es: " + alquiler);
	}

	@Override
	public void promedioNochesPasadasAlquileresPremium(List<Alquiler> alquileres) {
		if (alquileres.isEmpty()) return;
		int cant = 0;
		double total = 0;
		for (Alquiler a : alquileres) {
			if (a instanceof AlquilerPremium) {
				cant += 1;
				total += a.getCantidadNoches();
			}
		}
		if (cant > 0) {
		    double prom = (double) total / cant;
		    System.out.println("El promedio de noches en alquileres Premium es: " + prom);
		} else {
		    System.out.println("No se registraron alquileres Premium.");
		}
	}

}

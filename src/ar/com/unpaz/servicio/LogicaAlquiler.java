package ar.com.unpaz.servicio;

import java.util.List;

import ar.com.unpaz.model.Alquiler;

public interface LogicaAlquiler {
	void mostrarAlquileres(List<Alquiler> alquileres);
	void calcularRecaudacionTotal(List<Alquiler> alquileres);
	void buscarAlquilerPorNombre(List<Alquiler> alquileres, String nombre);
	void cuantosServiciosSPAAlquileresPremium(List<Alquiler> alquileres);
	void mostrarAlquilerBarato(List<Alquiler> alquileres);
	void promedioNochesPasadasAlquileresPremium(List<Alquiler> alquileres);
}

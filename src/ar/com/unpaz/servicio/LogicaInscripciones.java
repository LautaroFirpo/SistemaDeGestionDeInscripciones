package ar.com.unpaz.servicio;

import java.util.List;

import ar.com.unpaz.model.Inscripcion;

public interface LogicaInscripciones {
	void mostrarInsNombreYCostoFinal(List<Inscripcion> inscripciones);
	void buscarInscripcion(List<Inscripcion> inscripciones, int codigo);
	void calcularRecaudacionTotal(List<Inscripcion> inscripciones);
	void mostrarInsMayorCostoFinal(List<Inscripcion> inscripciones);
	void mostrarCuantasInsPaseLibre(List<Inscripcion> inscripciones);
	void mostrarSociosCostoFinalMayor80000(List<Inscripcion> inscripciones);
	void calcularPromedioCostoFinalInsInicial(List<Inscripcion> inscripciones);
	void mostrarNombresMayus(List<Inscripcion> inscripciones);
}

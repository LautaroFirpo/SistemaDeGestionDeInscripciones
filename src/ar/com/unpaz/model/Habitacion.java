package ar.com.unpaz.model;

public class Habitacion {
	private int numeroHabitacion;
	private String tipoHabitacion;
	private double precioPorNoche;
	
	
	
	@Override
	public String toString() {
		return "Numero Habitacion: " + numeroHabitacion + ", Tipo Habitacion: " + tipoHabitacion
				+ ", Precio por noche: " + precioPorNoche;
	}

	public Habitacion() {};
	
	public Habitacion(int numeroHabitacion, String tipoHabitacion, double precioPorNoche) {
		this.numeroHabitacion = numeroHabitacion;
		this.tipoHabitacion = tipoHabitacion;
		this.precioPorNoche = precioPorNoche;
	}
	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}
	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}
	public String getTipoHabitacion() {
		return tipoHabitacion;
	}
	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	public double getPrecioPorNoche() {
		return precioPorNoche;
	}
	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}
	
	
}

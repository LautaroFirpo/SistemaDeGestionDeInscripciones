package ar.com.unpaz.model;

public abstract class Alquiler {
	private int idAlquiler;
	private int numeroHabitacion;
	private String cliente;
	private int cantidadNoches;
	private Habitacion habitacion;
	
	public abstract double calcularCostoFinal();
	
	@Override
	public String toString() {
		return "Alquiler id: " + idAlquiler + ", Numero Habitacion: " + numeroHabitacion + ", Cliente: " + cliente
				+ ", CantidadNoches: " + cantidadNoches + ", habitacion: " + habitacion + " , Costo final: " + calcularCostoFinal();
	}

	public Alquiler() {};
	
	public Alquiler(int idAlquiler, int numeroHabitacion, String cliente, int cantidadNoches, Habitacion habitacion) {
		super();
		this.idAlquiler = idAlquiler;
		this.numeroHabitacion = numeroHabitacion;
		this.cliente = cliente;
		this.cantidadNoches = cantidadNoches;
		this.habitacion = habitacion;
	}
	public int getIdAlquiler() {
		return idAlquiler;
	}
	public void setIdAlquiler(int idAlquiler) {
		this.idAlquiler = idAlquiler;
	}
	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}
	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getCantidadNoches() {
		return cantidadNoches;
	}
	public void setCantidadNoches(int cantidadNoches) {
		this.cantidadNoches = cantidadNoches;
	}
	public Habitacion getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	
	
}

package ar.com.unpaz.model;

public class AlquilerPremium extends Alquiler{
	private String servicioExtra;
	
	@Override
	public String toString() {
		return  super.toString() +  " , Servicio Extra: " + servicioExtra;
	}

	public AlquilerPremium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlquilerPremium(int idAlquiler, int numeroHabitacion, String cliente, int cantidadNoches,
			Habitacion habitacion, String servicioExtra) {
		super(idAlquiler, numeroHabitacion, cliente, cantidadNoches, habitacion);
		this.servicioExtra = servicioExtra;
	}

	public String getServicioExtra() {
		return servicioExtra;
	}

	public void setServicioExtra(String servicioExtra) {
		this.servicioExtra = servicioExtra;
	}

	@Override
	public double calcularCostoFinal() {
		double costoFinal = getCantidadNoches() * getHabitacion().getPrecioPorNoche();
		if (this.servicioExtra.equalsIgnoreCase("SPA")) {
			return costoFinal + 20000;
		} else if (this.servicioExtra.equalsIgnoreCase("COCHERA")) {
			return costoFinal + 10000;
		}
		return costoFinal + 5000;
	}

}

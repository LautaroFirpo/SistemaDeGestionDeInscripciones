package ar.com.unpaz.model;

public class AlquilerComun extends Alquiler{

	
	
	@Override
	public String toString() {
		return super.toString();
	}

	public AlquilerComun() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlquilerComun(int idAlquiler, int numeroHabitacion, String cliente, int cantidadNoches,
			Habitacion habitacion) {
		super(idAlquiler, numeroHabitacion, cliente, cantidadNoches, habitacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularCostoFinal() {
		return getCantidadNoches() * getHabitacion().getPrecioPorNoche();
	}

}

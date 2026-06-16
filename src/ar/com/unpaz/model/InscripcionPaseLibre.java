package ar.com.unpaz.model;

public class InscripcionPaseLibre extends Inscripcion{
	private String disciplinaExtra;

	public InscripcionPaseLibre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InscripcionPaseLibre(String tipo, int codigo, String socio, int mesesContratados, double precioPorMes, String disciplinaExtra) {
		super(tipo, codigo, socio, mesesContratados, precioPorMes);
		this.disciplinaExtra = disciplinaExtra;
	}

	@Override
	public String toString() {
		return  super.toString() + ", Disciplina extra" + disciplinaExtra;
	}

	@Override
	public double calcularCostoFinal() {
		double costoFinal = getMesesContratados() * getPrecioPorMes();
		if (this.disciplinaExtra.equalsIgnoreCase("PILETA")) {
			return costoFinal + 15000;
		}
		else if (this.disciplinaExtra.equalsIgnoreCase("CROSSFIT")) {
			return costoFinal + 10000;
		}
		return costoFinal + 5000;
	}
	
	
	
}

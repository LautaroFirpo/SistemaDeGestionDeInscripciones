package ar.com.unpaz.model;

public class InscripcionInicial extends Inscripcion{

	public InscripcionInicial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InscripcionInicial(String tipo, int codigo, String socio, int mesesContratados, double precioPorMes) {
		super(tipo, codigo, socio, mesesContratados, precioPorMes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public double calcularCostoFinal() {
		double costoFinal = getMesesContratados() * getPrecioPorMes();
		return costoFinal;
	}
	
	

}

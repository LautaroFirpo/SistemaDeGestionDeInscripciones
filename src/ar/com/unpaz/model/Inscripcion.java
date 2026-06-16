package ar.com.unpaz.model;

public abstract class Inscripcion {
	private String tipo;
	private int codigo;
	private String socio;
	private int mesesContratados;
	private double precioPorMes;
	
	public abstract double calcularCostoFinal();
	
	@Override
	public String toString() {
		return "tipo:" + tipo + ", Codigo:" + codigo + ", Socio:" + socio + ", Meses contratados:"
				+ mesesContratados + ", Precio por mes:" + precioPorMes + ", Costo final: " + calcularCostoFinal() ;
	}

	public Inscripcion() {};
	
	public Inscripcion(String tipo, int codigo, String socio, int mesesContratados, double precioPorMes) {
		super();
		this.tipo = tipo;
		this.codigo = codigo;
		this.socio = socio;
		this.mesesContratados = mesesContratados;
		this.precioPorMes = precioPorMes;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getSocio() {
		return socio;
	}
	public void setSocio(String socio) {
		this.socio = socio;
	}
	public int getMesesContratados() {
		return mesesContratados;
	}
	public void setMesesContratados(int mesesContratados) {
		this.mesesContratados = mesesContratados;
	}
	public double getPrecioPorMes() {
		return precioPorMes;
	}
	public void setPrecioPorMes(double precioPorMes) {
		this.precioPorMes = precioPorMes;
	}
	
	
	
}

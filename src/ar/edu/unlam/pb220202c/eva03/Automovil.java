package ar.edu.unlam.pb220202c.eva03;

public class Automovil extends Vehiculo implements Imultable  {
	private String Patente;
	private Integer VelocidadActual, limiteVelocidad;
	
	public Automovil(String Patente, Integer VelocidadActual, Integer limiteVelocidad) {
		super(Patente, VelocidadActual, limiteVelocidad);
		this.limiteVelocidad = limiteVelocidad;
		this.Patente = Patente;
		this.VelocidadActual = VelocidadActual;
	}
	
	@Override
	public String getPatente() {
		return Patente;
	}
	@Override
	public void setPatente(String patente) {
		Patente = patente;
	}
	@Override
	public Integer getVelocidadActual() {
		return VelocidadActual;
	}
	@Override
	public void setVelocidadActual(Integer velocidadActual) {
		VelocidadActual = velocidadActual;
	}
	@Override
	public void incrmentarVelocidad(Integer Velocidad) {
		this.VelocidadActual = Velocidad;
	}
	@Override
	public Integer getLimiteVelocidad() {
		return limiteVelocidad;
	}
	public void setLimiteVelocidad(Integer limiteVelocidad) {
		this.limiteVelocidad = limiteVelocidad;
	}

	@Override
	public Boolean enInfraccion() {
		if(this.VelocidadActual >limiteVelocidad) {
		return true;
		}
		else {
		return false;
		}
	}

	@Override
	public int compareTo(Vehiculo vehiculo) {
		return getPatente().compareTo(vehiculo.getPatente());
	}
	
   
	
}

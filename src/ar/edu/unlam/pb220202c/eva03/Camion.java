package ar.edu.unlam.pb220202c.eva03;


public class Camion extends Vehiculo implements Imultable {
	private String Patente;
	private Integer VelocidadActual, limiteVelocidad, cantidadDeEjes;
	
	public Camion(String Patente, Integer VelocidadActual, Integer limiteVelocidad, Integer cantidadDeEjes) {
		super(Patente, VelocidadActual, limiteVelocidad);
		this.VelocidadActual = VelocidadActual;
		this.limiteVelocidad = limiteVelocidad;
		this.cantidadDeEjes = cantidadDeEjes;
		this.Patente = Patente;
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
	public Integer getLimiteVelocidad() {
		return limiteVelocidad;
	}
    @Override
	public void setLimiteVelocidad(Integer limiteVelocidad) {
		this.limiteVelocidad = limiteVelocidad;
	}

	public Integer getCantidadDeEjes() {
		return cantidadDeEjes;
	}

	public void setCantidadDeEjes(Integer cantidadDeEjes) {
		this.cantidadDeEjes = cantidadDeEjes;
	}

	@Override
	public void incrmentarVelocidad(Integer Velocidad) {
		this.VelocidadActual = Velocidad;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Patente == null) ? 0 : Patente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camion other = (Camion) obj;
		if (Patente == null) {
			if (other.Patente != null)
				return false;
		} else if (!Patente.equals(other.Patente))
			return false;
		return true;
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
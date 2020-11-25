package ar.edu.unlam.pb220202c.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Autopista {
	private HashMap <Integer,Vehiculo> telepase;
	private HashSet <Vehiculo> vehiculosEnCirculacion;
	private String nombreDeLaAutopista;
	
	public Autopista(String nombre) {
		this.nombreDeLaAutopista = nombre;
		telepase = new HashMap<Integer,Vehiculo>(); 
		vehiculosEnCirculacion = new HashSet <>();

	}
	public Boolean registrarTelepase (Integer numeroTelpase, Vehiculo vehiculo) {
		if(numeroTelpase!= null) {
		telepase.put(numeroTelpase, vehiculo);
		return true;
		}
		return false;
    }

	public Boolean ingresarAutopista (Integer numeroTelepase) throws VehiculoNotFounException {
		if(telepase.containsKey(numeroTelepase)) {
			vehiculosEnCirculacion.add(telepase.get(numeroTelepase));
		}
		throw new VehiculoNotFounException("no ingreso");
		
	}
	
	public void salirAutpista (Vehiculo vehiculo) throws VehiculoNotFounException {
		if(telepase.containsValue(vehiculo)==false) {
		throw new 	VehiculoNotFounException("no ingreso");
		}
		else {
		vehiculosEnCirculacion.remove(vehiculo);
		}
	}
	
	
	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente(){
	 TreeSet <Vehiculo> VehiculosPasadosOrdenados  = new TreeSet <Vehiculo>();
	 VehiculosPasadosOrdenados.addAll(vehiculosPasadosDePeso());
	 return VehiculosPasadosOrdenados;
    }

	public Integer cantidadDeVehiculosENCirculacion() {
	
		return vehiculosEnCirculacion.size();
}
	
	
	public HashSet <Vehiculo> vehiculosPasadosDePeso(){
		HashSet <Vehiculo> vehiculosPasadosDePeso = new HashSet<>();
		
		for (Vehiculo vehiculo : vehiculosEnCirculacion) {
			if(vehiculo instanceof Automovil) {
				if(((Automovil) vehiculo).enInfraccion())
					vehiculosPasadosDePeso.add(vehiculo);
			}
			if(vehiculo instanceof Camion) {
				if(((Camion) vehiculo).enInfraccion())
					vehiculosPasadosDePeso.add(vehiculo);
			}
			
		}
		return vehiculosPasadosDePeso;
		
	}
	}






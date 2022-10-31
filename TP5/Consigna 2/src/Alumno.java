import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private Casa casa_actual;
	private ArrayList<String> cualidades;
	private ArrayList<Alumno> familiares;
	
	public Alumno(String nombre, Casa casa) {
		this.nombre=nombre;
		this.casa_actual = casa;
		this.cualidades = new ArrayList<>();
		this.familiares = new ArrayList<>();
	}

	public Casa getCasaActual() {
		return casa_actual;
	}

	public void setCasaActual(Casa casa_actual) {
		this.casa_actual = casa_actual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarCualidad(String cualidad) {
		if(cualidad != null){			
		this.cualidades.add(cualidad);
		}
	}
	
	public void agregarFamiliar(Alumno alumno) {
		if(alumno != null){			
		this.familiares.add(alumno);
		}
	}

	public ArrayList<String> getCualidades() {
		return new ArrayList<>(cualidades);
	}

	public ArrayList<Alumno> getFamiliares() {
		return new ArrayList<>(familiares);
	}
	
}

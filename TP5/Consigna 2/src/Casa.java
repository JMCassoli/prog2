import java.util.ArrayList;

public class Casa {

	private String nombre;
	private int max_alumnos;
	private ArrayList<String> cualidades;
	protected ArrayList<Alumno> alumnos;
	
	public Casa (String nombre, int capacidad) {
		this.nombre=nombre;
		this.max_alumnos=capacidad;
		cualidades = new ArrayList<>();
		alumnos = new ArrayList<>();
	}
		
	public boolean aceptaAlumno(Alumno alumno) {
		if(tieneCapacidad() && tieneCualidades(alumno.getCualidades())) {
			return true;
		} else return false;
	}

	public boolean tieneCualidades(ArrayList<String> cualidades_alumno) {
		for(String cualidad : cualidades) {
			
			if(!cualidades_alumno.contains(cualidad)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean tieneCapacidad() {
		if(this.alumnos.size()<getMaxAlumnos()) {
			return true;
		} else return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMaxAlumnos() {
		return max_alumnos;
	}

	public void setMax_alumnos(int max) {
			this.max_alumnos = max;
	}
			
	
	public void agregarCualidad(String cualidad) {
		if(cualidad != null){			
		this.cualidades.add(cualidad);
		}
	}
	
	public void agregarAlumno(Alumno alumno) {
		if(alumno != null){			
			this.alumnos.add(alumno);
		}
	}
	
}

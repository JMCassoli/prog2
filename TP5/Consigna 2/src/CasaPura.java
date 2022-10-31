import java.util.ArrayList;

public class CasaPura extends Casa {

	public CasaPura(String nombre, int capacidad) {
		super(nombre, capacidad);
		
	}
	
	@Override
	public boolean aceptaAlumno(Alumno alumno) {
		if(tieneLinaje(alumno.getFamiliares())) {			
			if(tieneCapacidad() && tieneCualidades(alumno.getCualidades())) {
			return true;
			} else return false;
		} else return false;
	}

	private boolean tieneLinaje(ArrayList<Alumno> familiares) {
		if(!familiares.isEmpty()) {
			for(Alumno familiar : familiares) {
				if(this.alumnos.contains(familiar)) {
					return true;
				}
			}
		}
		return false;
	}

}

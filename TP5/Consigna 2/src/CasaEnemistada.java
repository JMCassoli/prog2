
public class CasaEnemistada extends Casa {
	Casa casaEnemiga;

	public CasaEnemistada(String nombre, int capacidad, Casa casaEnemiga) {
		super(nombre, capacidad);
		this.casaEnemiga = casaEnemiga;
	}
	
	@Override
	public boolean aceptaAlumno(Alumno alumno) {
		if(!casaEnemiga.aceptaAlumno(alumno)) {
			
			if(tieneCapacidad() && tieneCualidades(alumno.getCualidades())) {
				return true;
			} else return false;
		} else return false;
		
	}

}

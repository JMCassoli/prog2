import java.util.ArrayList;

public class Hogwarts {
	
	private ArrayList<Casa> casas;
	private ArrayList<Alumno> alumnos;
	
	public Hogwarts() {
		this.casas = new ArrayList<>();
	}
	
	public void asignarCasa(Alumno alumno) {
		if(alumno.getCasaActual()!=null) {
			System.out.println("el alumno ya pertenece a una casa");
			return;
		}
		ArrayList<Casa> compatibles = new ArrayList<>();
		for(Casa casa : casas) {
			if(casa.aceptaAlumno(alumno)) {
				compatibles.add(casa);
			}
		}
		if (compatibles.isEmpty()) {
			System.out.println("el alumno no puede entrar a ninguna casa");
		}else if (compatibles.size()==1) {
			Casa casa = compatibles.get(0);
			casa.agregarAlumno(alumno);
			alumno.setCasaActual(casa);
			System.out.println("el alumno fue asignado a la casa : " + casa.getNombre());
		}else {
			Casa casa = compatibles.get((int)(Math.random()*compatibles.size()));
			casa.agregarAlumno(alumno);
			alumno.setCasaActual(casa);
			System.out.println("el alumno fue asignado por sorteo a la casa : " + casa.getNombre());
		}
	}
	
	public ArrayList<Casa> getCasas() {
		return new ArrayList<Casa>(casas);
	}

	public void agregarCasa(Casa casa) {
		if(!casas.contains(casa)) {
			this.casas.add(casa);			
		}
	}
	
}

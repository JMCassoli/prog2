
public class Main {

	public static void main(String[] args) {
		Hogwarts hogwarts = new Hogwarts();
		
		Casa casa1 = new Casa("Gryffindor", 2);
		casa1.agregarCualidad("facha");
		casa1.agregarCualidad("ludopata");
		casa1.agregarCualidad("pobre");
		
		Casa casa2 = new Casa("Slytherin", 3);
		casa2.agregarCualidad("facha");
		casa2.agregarCualidad("ludopata");
		casa2.agregarCualidad("rico");
		
		Casa casa3 = new Casa("Ravenclaw", 2);
		casa3.agregarCualidad("feo");
		casa3.agregarCualidad("amable");
		casa3.agregarCualidad("alto");
		
		hogwarts.agregarCasa(casa1);
		hogwarts.agregarCasa(casa2);
		hogwarts.agregarCasa(casa3);
		
		Alumno alumno1 = new Alumno("Sergio" , null);
		Alumno alumno2 = new Alumno("Carlos" , casa1);
		Alumno alumno3 = new Alumno("Jorge" , casa1);
		
		casa1.agregarAlumno(alumno2);
		casa2.agregarAlumno(alumno3);
		
		alumno1.agregarCualidad("facha");
		alumno1.agregarCualidad("ludopata");
		alumno1.agregarCualidad("rico");
		alumno1.agregarCualidad("pobre");
		
		hogwarts.asignarCasa(alumno1);
	}

}
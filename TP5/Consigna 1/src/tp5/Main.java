package tp5;

import java.util.ArrayList;

class Main {

	public static void main(String[] args) {
		PilaElementos pila = new PilaElementos();
		pila.push("hola");
		pila.push("hola2");
		pila.push("hola3");
		
		ArrayList aux = pila.reverse();
		
		System.out.println(pila.top());
		System.out.println(aux);

	}

}

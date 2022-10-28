package tp5;

import java.util.*;

public class PilaElementos {

	private ArrayList<Object> elementos;
	
	public PilaElementos() {
		elementos = new ArrayList<>();
	}
	
	public void push(Object o) {
		
		this.elementos.add(o);
		
	}
	
	public Object pop() {
		if(this.elementos.size() == 0) {return null;}
		return this.elementos.remove(this.elementos.size() - 1);
	}
	
	public Object top() {
		if(this.elementos.size() == 0) {return null;}
		return this.elementos.get(this.elementos.size() -1);
	}
	
	public int size() {
		return this.elementos.size();
	}
	
	public ArrayList<Object> copy() {
		return new ArrayList<Object>(this.elementos);
	}
	
	public ArrayList<Object> reverse(){
		ArrayList<Object> aux = new ArrayList<Object>(this.elementos);
		Collections.reverse(aux);
		return aux;
	}
}

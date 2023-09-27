package yoRobot;

public class Robot {	
	//Propiedades:
	private float peso; //Si fuera public, roboto.peso= 120.53f; ytMil.peso= 203.1f; comentados en Main, podrian modificar los pesos.
	
	//Constuctor
	public Robot() {
		
	}
	
	//GETTERS $ SETTERS:
	public void setPeso(float p) {
		if(p<0) this.peso=0;
		else this.peso = p;
	}
	public float getPeso() {
		return this.peso;
	}
	
}

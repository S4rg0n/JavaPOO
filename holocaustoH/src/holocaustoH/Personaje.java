package holocaustoH;

public class Personaje {
	private String nombre;
	private Posicion pos;
	
	//Constructor vacío:
	public Personaje() {
		System.out.println("Creando personaje");
	}
	
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Posicion getPos() {
		return pos;
	}
	public void setPos(Posicion pos) {
		this.pos = pos;
	}
}

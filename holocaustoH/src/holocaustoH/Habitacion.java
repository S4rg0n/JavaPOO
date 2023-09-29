package holocaustoH;

public class Habitacion {
	private Posicion Entrada;
	private Posicion Salida;

	//Constructor vacío:
	public Habitacion() {
		System.out.println("Creando habitación");
	}

	//Getters & Setter
	public Posicion getEntrada() {
		return Entrada;
	}
	public void setEntrada(Posicion entrada) {
		Entrada = entrada;
	}

	public Posicion getSalida() {
		return Salida;
	}
	public void setSalida(Posicion salida) {
		Salida = salida;
	}

}

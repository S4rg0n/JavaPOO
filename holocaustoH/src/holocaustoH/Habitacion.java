package holocaustoH;

public class Habitacion {
	//Damos tamaño a la sala para toda la partida mediante declaración de constantes:
	public static final int ancho=6;
	public static final int alto=6;
	
	//Declaramos puertas:
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

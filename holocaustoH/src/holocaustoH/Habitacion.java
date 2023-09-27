package holocaustoH;

public class Habitacion {
	private Posicion Entrada;
	private Posicion Salida;

	public Habitacion() {
		System.out.println("Creando habitación");
	}

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

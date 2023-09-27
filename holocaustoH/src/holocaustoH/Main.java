package holocaustoH;

public class Main {

	public static void main(String[] args) {
		Posicion posInicio= new Posicion();
		posInicio.setPosX(3);
		posInicio.setPosY(0);
		
		//Creamos los objetos:
		Habitacion sala = new Habitacion();
		Personaje player = new Personaje();
		player.setPos(posInicio);

	}

}

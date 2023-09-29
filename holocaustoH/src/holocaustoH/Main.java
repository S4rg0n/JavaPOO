package holocaustoH;

public class Main {

	public static void main(String[] args) {
		//Para dar posicion con constructor Posición vacío
		//Inicializaríamos con posición 0,0:
		//Posicion posInicio= new Posicion();
		//Y luego daríamos posición:
		//posInicio.setPosX(3);
		//posInicio.setPosY(0)
		//Para dar posición con constructor por parámetros:
		Posicion posInicio= new Posicion(3,0);
		
		//Creamos los objetos:
		Habitacion sala = new Habitacion();
		Personaje player = new Personaje();
		player.setPos(posInicio);
		

		Juego.pintarHabitacion(sala);

	}

}

package holocaustoH;

public class Juego {

	public Juego() {
		
	}
	
	public static void pintarHabitacion(Habitacion h) {
		for(int fila = 0; fila < Habitacion.ancho; fila++) {//En cada fila...
			for(int col = 0; col < Habitacion.alto; col++) {//... barremos cada columna...
				if(col == 0 || col == Habitacion.ancho -1) {//... pintamos bordes laterales...
					System.out.print(col == Habitacion.ancho -1 ? "|\n" : "|");
				}
				else if(fila == 0 || fila == Habitacion.alto - 1) {//... pintamos bordes sup e inf...
					System.out.print("---");
				}
				else System.out.print("   ");//... y el resto en vacío
				
			}
			
		}
			
	}

}

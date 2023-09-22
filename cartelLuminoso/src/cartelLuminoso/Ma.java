package cartelLuminoso;

public class Ma {

	public static void main(String[] args) {
		// Imprimir letras formadas por 7 filas y 5 columnas
		int alto = 7;
		int ancho = 5;
		
		//Para la L:
		for(int fila = 1; fila <= alto; fila++) {
			if(fila != alto) {
				System.out.println("*");
			}else {
				for(int columna = 1; columna <= ancho; columna++) {
					System.out.print("*");
				}
			}
		}
		System.out.println();
		System.out.println();
		
		//Para la E:
		for(int fila = 1; fila <= alto; fila++) {
			if(fila == alto || fila == 1) {
				for(int columna = 1; columna <= ancho; columna++) {
					System.out.print("*");
				}
			}else if((fila == (alto/2)+1)) {
				for(int columna = 1; columna < ancho; columna++) {
					System.out.print("*");
				}
			}else {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print(" ");
	}
}

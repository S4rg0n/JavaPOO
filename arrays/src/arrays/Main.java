package arrays;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Inicialización de arrays:
		String nombres[] = {"Paco","Lucía","Marcos","Sandra","Nate",""};
		//Declaración de array:
		float notas[] = new float[nombres.length];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime que nombre añado: ");
		String nombreFinal = sc.nextLine();
		nombres[nombres.length-1] = nombreFinal;
		sc.close();
		
		for(int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}

	}

}

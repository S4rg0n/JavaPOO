package drHouse;
import java.util.*;

public class Main {
	
	public static String pregunta(String p) {
		//Crea canal de escucha:
		Scanner sc = new Scanner(System.in);
		//Efectucamos pregunta:
		System.out.print(p);
		//Leemos dato recibido:
		String respuesta = sc.nextLine();
		//Devolvemos dato:
		return respuesta;		
	}
	
	public static void triaje(String nombre) {
		
		String respuesta = "";
		System.out.println(nombre+":\n");
		
		respuesta = pregunta("Ha sufrido una caida??: ");
		System.out.println(respuesta);
		
		respuesta = pregunta("Tiene usted fiebre??: ");
		System.out.println(respuesta);
		
	}

	public static void main(String[] args) {
		
		String paciente = pregunta("Cual es su nombre???: "); 
		triaje(paciente);		

	}

}

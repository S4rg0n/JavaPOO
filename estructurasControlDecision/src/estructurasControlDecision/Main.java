package estructurasControlDecision;

public class Main {

	public static void main(String[] args) {
		
		//Bucles o repetición
		for(int i = 14; i < 20; i++) {
			// Estructuras de control de flujo
			int edad = i;
			System.out.print("Tienes " + i + " años, ");
			if(edad >= 18) {
				System.out.println("eres mayor de edad con plenos derechos.");
			}else if(edad >= 16) {
				System.out.println("no eres mayor de edad, pero ya puedes casarte.");
			}else {
				System.out.println("no tienes potestad para nada.");
			}
		}
		
	}

}

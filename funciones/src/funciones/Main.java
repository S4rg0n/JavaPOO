package funciones;

public class Main {
	
	// Función que genera precio total.
	public static float precioTotal(float precioUd, int uds) {
		
		float total = precioUd * uds;
		System.out.println("El precio por " + uds + " de producto a " + precioUd +" asciende a " + total +"€");
		return total;		
		
	}

	public static void main(String[] args) {
		
		float precio = precioTotal(5.23f, 5);
		System.out.println(precio);
	}

}

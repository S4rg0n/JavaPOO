package yoRobot;

public class Main {

	public static void main(String[] args) {
		
		Robot roboto = new Robot();
		Robot tMil = new Robot();
		
		//roboto.peso= 120.53f;
		//tMil.peso= 203.1f;
		roboto.setPeso(120.53f);
		tMil.setPeso(203.1f);
		System.out.println(tMil.getPeso());
	}

}

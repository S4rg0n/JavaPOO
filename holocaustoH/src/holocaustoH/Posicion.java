package holocaustoH;

public class Posicion {
	private int posX, posY;

	//Constuctor vacío:
	public Posicion() {
		this.posX=0;
		this.posY=0;
	}
	//Constructor con parámetros:
	public Posicion(int px, int py) {
		this.posX=px;
		this.posY=py;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
}

package Ejercicio02;

public class Principal {
	public static void main(String[] args) {
		int[] secuencia = {2,7,5,4,9,3,6,8,1,10};
		Hilo1 h1 = new Hilo1(secuencia);
		Thread t1 = new Thread(h1);
		t1.start();
	}
}

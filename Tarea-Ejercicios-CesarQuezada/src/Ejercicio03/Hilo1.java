package Ejercicio03;

public class Hilo1 extends Thread{
	private int num;
	
	public Hilo1(int num) {
		this.num=num;
	}
	@Override
	public void run() {
		int fac = 1;
		for (int i=num;i<=1; i--) {
			fac = fac*1;
		}
		System.out.println("Hilo 1: ");
		System.out.println("Factorial del numero : "+fac);
	}
}

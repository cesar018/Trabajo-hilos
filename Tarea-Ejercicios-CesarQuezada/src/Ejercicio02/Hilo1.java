package Ejercicio02;

public class Hilo1 extends Thread{
	private int[] nums;
	public Hilo1(int[] nums) {
		this.nums = nums;
	}
	@Override
	public void run() {
		int s = 0;
		for(int n:nums) {
			s=s+ n*n*n;
		}
		System.out.println("Hilo 1 : ");
		System.out.println("La suma de cubos es : "+ s);
	}
}

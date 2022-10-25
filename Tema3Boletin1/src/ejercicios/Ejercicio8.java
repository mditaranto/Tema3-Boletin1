package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
	
		int alt, alto = 0;
		
		Scanner sc = new Scanner(System.in);
		
		alt = sc.nextInt();
		
		while (alt>0) {
			if (alt>alto) {
				alto = alt;
			}
			alt = sc.nextInt();
		}
		System.out.println("El arbol mas alto mide " + alto + " centimetros");

	}

}

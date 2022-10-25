package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int num = 0;
		double numaleat = 0;
	
		
		Scanner sc = new Scanner(System.in);
		
		numaleat = Math.random() * 100;
		numaleat = (int)numaleat;
		
		num = sc.nextInt();
		
		while (num != numaleat && num>0) {
			if (num>numaleat) {
				System.out.println("menor");
			} else {
				System.out.println("Mayor");
			}
			num = sc.nextInt();
		}
		System.out.println("Se acabo el juego");
	}

}

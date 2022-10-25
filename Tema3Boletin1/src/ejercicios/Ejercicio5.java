package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int num ,suma , cont, cero, contneg, sumaneg;  
		double media = 0;
		suma = cont = cero = contneg = sumaneg =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuacion se re velara la media de los numeros negativos, "
				+ "cuantos ceros a introducido "
				+ "y la suma de los posiivos de los proximos 10 numeros. ");
		
		num = sc.nextInt();
		while (cont<=10) {
			cont++;
			if (num>0) {
				suma += num;
			} else if (num<0) {
				contneg++;
				sumaneg += num;
			} else if (num == 0 ) {
				cero++;
			}
			media = sumaneg/contneg;
			num = sc.nextInt();
		}
		System.out.println("la media es: " + media + " los ceros son: " + cero + " y la suma es: " + suma);

	}

}

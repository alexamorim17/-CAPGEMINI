package ss;

import java.util.LinkedList;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = 0;

		System.out.print("Digite o número de andares da escada:  ");
		n = ler.nextInt();

		for (int contador = 1; contador <= n; contador++) {

			for (int b = n - contador; b >= 0; b--) {
				System.out.print(" ");
			}

			for (int asterisco = contador; asterisco > 0; asterisco--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}

package ss;

import java.util.LinkedList;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = 0;

		System.out.print("Digite o n�mero de andares da escada:  ");
		n = ler.nextInt();

		for (int cont = 1; cont <= n; cont++) {

			for (int b = n - cont; b >= 0; b--) {
				System.out.print(" ");
			}

			for (int imp = cont; imp > 0; imp--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}

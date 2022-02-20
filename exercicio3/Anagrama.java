package exercicio3;

import java.util.Scanner;

public class Anagrama {

	public static void main(String[] args) {

		System.out.print("Digite uma palavra: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		Strings s = new Strings();

		System.out.println(s.compararSubstring(s.geradorDeSubstring(str)));
		sc.close();

	}
}

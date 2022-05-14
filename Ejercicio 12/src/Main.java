import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una frase (puede tener puntos, comas y espacios): ");
		String s = sc.nextLine();


		Palindromo p = new Palindromo();
		p.EsPalindromo(s);	
	
	}
}

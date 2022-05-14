
public class Palindromo {

	
	public void EsPalindromo(String s) {
		
		s = s.toLowerCase();
		s = s.replace(" ", "");
		s = s.replace(",", "");
		s = s.replace(".", "");
		s = s.replace("á", "a");
		s = s.replace("é", "e");
		s = s.replace("í", "i");
		s = s.replace("ó", "o");
		s = s.replace("ú", "u");
		System.out.print(s);
		int fin = s.length() - 1;
		int ini = 0;
		boolean espalin = true;

		while (ini < fin) {
			if (s.charAt(ini) != s.charAt(fin)) {
				espalin = false;
			}
			ini++;
			fin--;
		}
		if (espalin)
			System.out.print("\nEs palindromo.");
		else
			System.out.print("\nNo es palindromo.");

	}

	

}

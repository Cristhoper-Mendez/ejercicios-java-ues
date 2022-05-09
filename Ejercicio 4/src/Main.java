import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//instanciamos el objeto
		Libro libro1 = new Libro(1223, "Odisea", "Homero", 40);
		Libro libro2 = new Libro(334434, "Biblia", "?", 80);
		
		//mostramos la informacion de cada objeto en pantalla
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		//Modificar numero de pagina
		libro1.setNumPaginas(99);
		
		//comparamos quien tiene mas paginas
		if (libro1.getNumPaginas()>libro2.getNumPaginas()) {
			System.out.println("El Libro uno tiene mas paginas un total de:"+libro1.getNumPaginas());
		} else {
			System.out.println("El Libro dos tiene mas paginas un total de:"+libro2.getNumPaginas());
		}
		
	}

}

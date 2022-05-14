import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Libro libro = new Libro(null, null, 0, 0);

		int opcion, numlibro;

		while (true) {
			System.out.println(
					"Que desea realizar 1-Agregar un libro 2-Prestar un libro 3-devolver un libro 4-Libros disponibles");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Cuantos libros desea aregar:");
				numlibro = entrada.nextInt();
				for (int i = 0; i < numlibro; i++) {
					System.out.println("Introduce el titulo");
					String titulo = entrada.next();
					libro.setTitulo(titulo);

					System.out.println("Introduce el Autor");
					String autor = entrada.next();
					libro.setAutor(autor);

					
				}
				libro.setNumEjemplares(numlibro);
				break;

			case 2:
				if (libro.Prestamo() == true) {
					System.out.println("Usted a hecho un prestamo");
				} else {
					System.out.println("No hay libros para prestar");
				}
				break;

			case 3:

				if (libro.Devolucion() == true) {
					System.out.println("Usted a hecho una devolucion");

				} else {
					System.out.println("No hay libros para devolver");
				}

				break;

			case 4:
				System.out.println("Hay "+libro.getNumEjemplares()+" libros en existencias");
				

				break;

			default:
				break;
			}

		}

	}

}

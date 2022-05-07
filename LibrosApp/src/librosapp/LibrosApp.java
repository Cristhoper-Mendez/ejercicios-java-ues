package librosapp;

import entidades.Libro;

public class LibrosApp {

    public static void main(String[] args) {
        Libro libro1 = new Libro(123455, "La divina comedia", "Dante Alighieri", 5);
        Libro libro2 = new Libro(123455, "Odisea", "Omero", 50);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        System.out.println(
                libro1.getNumeroPaginas() > libro2.getNumeroPaginas()
                ? "El libro " + libro1.getTitulo() + " tiene mas paginas"
                : "El libro " + libro2.getTitulo() + " tiene mas paginas"
        );

    }

}

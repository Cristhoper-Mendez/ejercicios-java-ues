package entidades;

public class Libro {

    int isbn;
    String titulo;
    String autor;
    int numeroPaginas;

    public Libro(int isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String toString() {
        String texto = "El libro "
                + this.titulo + ", con ISBN: " + this.isbn + ", creado por el autor"
                + " " + this.autor + " tiene " + this.numeroPaginas + " paginas.";

        return texto;
    }
}

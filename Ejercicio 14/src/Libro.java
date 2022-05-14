
public class Libro {

	private String Titulo;
	private String Autor;
	private int numEjemplares;
	private int numEjemplaresPrestados;

	public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
		Titulo = titulo;
		Autor = autor;
		this.numEjemplares = numEjemplares;
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public int getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}

	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	public boolean Prestamo() {
		boolean autorizacion;

		if (this.numEjemplares > 0) {
			this.numEjemplaresPrestados++;
			this.numEjemplares--;
			autorizacion = true;
		} else {
			autorizacion = false;
		}

		return autorizacion;
	}

	public boolean Devolucion() {

		boolean autorizacion;

		if (this.numEjemplaresPrestados > 0) {
			this.numEjemplaresPrestados--;
			this.numEjemplares++;
			autorizacion = true;
		} else {
			autorizacion = false;
		}

		return autorizacion;

	}

}

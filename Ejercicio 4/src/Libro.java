
public class Libro {

	/*Atributos*/
	 private int ISBN;
	 private String titulo;
	 private String autor;
	 private int numPaginas;
	 
	 
	 
	public Libro(int iSBN, String titulo, String autor, int numPaginas) {
		
		this.ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
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
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	 
//	metodo para introducir numero de paginas
	private void SetPaginas( int NumPaginas) {
		
		this.numPaginas = NumPaginas;
		
	}
	
	
	public String toString() {
		
		return "El libro "+titulo+" con ISBN "+ISBN+""
				 + " creado por el autor "+autor
				 + " tiene "+numPaginas+" paginas";
	
	}
	
}

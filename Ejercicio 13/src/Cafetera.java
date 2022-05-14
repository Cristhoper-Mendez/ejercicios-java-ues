
public class Cafetera {

	
	//atributos
	private int capacidadMaxima;
	private int cantidadActual;
	
	//constructores
	public Cafetera() {
	 capacidadMaxima=1000;
	 cantidadActual=capacidadMaxima;
	}
	public Cafetera(int capacidadMaxima) {
	 this.capacidadMaxima = capacidadMaxima;
	 this.cantidadActual = capacidadMaxima;
	}
	
	// metodos get y set de los atributos
	public int getCapacidadMaxima() {
	 return capacidadMaxima;
	}
	
	public void setCapacidadMaxima(int capacidadMaxima) {
	 this.capacidadMaxima = capacidadMaxima;
	}
	
	public int getCantidadActual() {
	 return cantidadActual;
	}
	
	public void setCantidadActual(int cantidadActual) {
	 this.cantidadActual = cantidadActual;
	}
	
	public void llenarCafetera() {
	 cantidadActual=capacidadMaxima;
	}
	
	public void servirTaza(int taza) {
	 if (taza>cantidadActual) {
	 taza=taza-cantidadActual;
	 cantidadActual=0;
	 }
	 else {
	 cantidadActual=cantidadActual-taza;
	 
	 }
	 }
	
	 public void vaciarCafetera() {
	 cantidadActual=0;
	 }
	 
	 public void agregarCafe(int Coffe) {
	 cantidadActual=cantidadActual+Coffe;
	 }
	 
	


	
}

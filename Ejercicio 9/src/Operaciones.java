import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operaciones {

	//declaracion de arreglo
	List<Integer> Numeros = new ArrayList<>();
	Scanner entrada = new Scanner(System.in);

	//captura de datos
	public void CapturaDeDatos() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese un numero entero:");
			Numeros.add(entrada.nextInt());
		}
	}

	//Proceso para obtener media aritmetica
	public int MediaAritmetica() {
		int suma = 0;
		for (int i = 0; i < Numeros.size(); i++) {
			suma += Numeros.get(i);
		}
		return suma / Numeros.size();
	}

	//salida de datos
	public void ImprimirResultado() {
		System.out.println("La Media Aritmetica es:" + MediaAritmetica());

	}

}

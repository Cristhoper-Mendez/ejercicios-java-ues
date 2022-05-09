import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {

		List<Integer> Numeros = new ArrayList<Integer>();

		// designando tamaño de la lista
		int numerorandom = ThreadLocalRandom.current().nextInt(10, 20),numerospar=0,numerosimpar=0;

		// agregando valores a la lista
		for (int i = 0; i < numerorandom; i++) {
			int Numeroadd = ThreadLocalRandom.current().nextInt(10, 100);
			Numeros.add(Numeroadd);
		}

		//imprimiendo contenido de la lista
		for (Integer item : Numeros) {
			System.out.println(item);
		}

		for (int i = 0; i < Numeros.size(); i++) {			
			//evaluacion de numeros pares o impares de la lista
			if (Numeros.get(i)%2==0) {
				numerospar += Numeros.get(i);
			} else {
             numerosimpar++;
			}
		}
		
		//salida de datos
		System.out.println("Suma de numeros pares de la lista:"+numerospar);
		System.out.println("Total de numeros impares:"+numerosimpar);
		
			
	}

}

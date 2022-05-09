import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);

		ArrayList<Notas> examenes = new ArrayList<Notas>();
		int CantidadNotas, aprobados=0, reprobados=0;

		System.out.print("Ingrese la cantidad de notas a evaluar");
		CantidadNotas = lectura.nextInt();

		for (int i = 0; i < CantidadNotas; i++) {
			
			System.out.print("Ingrese la nota:");
			Notas nota = new Notas();
			nota.setNotas(lectura.nextDouble());
			examenes.add(nota);
			
			if (examenes.get(i).AprobadosYReprobados()==true) {
				aprobados+=1;
			}else {
				reprobados+=1;
			}			
	
		}
		
		System.out.println("El total de aprobados es:"+aprobados);
		System.out.println("El total de reprobados es:"+reprobados);
		
	}

}

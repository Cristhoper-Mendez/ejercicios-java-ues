import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner Entrada=new Scanner(System.in);
		
		//se crea objeto de la clase cafetera
		Cafetera cafe1=new Cafetera();
		int pedidoCafe;
		
		do {
		System.out.println("Bienvenido \n ¿Que desea hacer? \n 1. Pedir Cafe \n 2. Llenar Cafetera \n 3. Vaciar Cafetera \n 4. Agregar cafe" );
		pedidoCafe=Entrada.nextInt();
		switch(pedidoCafe) {
		case 1:{
		System.out.println("Bienvenido \n ¿Cuantos Cafes necesita?");
		pedidoCafe=Entrada.nextInt();
		cafe1.servirTaza(pedidoCafe);
		System.out.println("Cafe Actual "+ cafe1.getCantidadActual());
		break;
		}
		case 2:{cafe1.llenarCafetera();
		System.out.println("La cafetera ha sido llenada con exito, Cantidad Actual: "+cafe1.getCantidadActual());
		break;
		}
		case 3: {cafe1.vaciarCafetera();
		System.out.println("La cafetera ha sido vaciada con exito, Cantidad Actual: "+cafe1.getCantidadActual());
		break;
		}
		case 4: {
		System.out.println("Ingrese el valor en tazas a agregar Valor Actual: "+cafe1.getCantidadActual());
		pedidoCafe=Entrada.nextInt();
		cafe1.agregarCafe(pedidoCafe);
		System.out.println("Se agrego las tazas de cafe con exito, Cantidad Actual: "+cafe1.getCantidadActual());
		break;
		}
		}
		
		System.out.println("Proceso ejecutado con exito \n 1.Seguir \n 0. Salir");
		pedidoCafe=Entrada.nextInt();
		}while(pedidoCafe!=0);
		
		
	}

}

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    static int opcion;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Instancias
        Robots robs = new Robots();

        // Menu
        MostrarMenu();

        while (opcion > 0 && opcion < 4) {
            switch (opcion) {
                case 1:
                    robs.ImprimirOrdenado();
                    MostrarMenu();
                    break;
                case 2:
                    robs.ImprimirCantidadRobotsMasVida();
                    MostrarMenu();
                    break;
                case 3:
                    robs.Imprimir3RobotsConMasVida();
                    MostrarMenu();
                    break;
            }
        }
    }

    static void MostrarMenu() {
        System.out.println("Que desea hacer?");
        System.out.println("1. Imprimir los robots ordenados de menor vida a mayor.");
        System.out.println("2. Imprimir los robots que tienen mas de 50% de vida.");
        System.out.println("3. Imprimir los 3 robots con mas vida.");
        System.out.println("Cualquier otro numero para salir.");
        opcion = scanner.nextInt();

        limpiar(20);
    }

    static void limpiar(int lineas) {
        for (int i = 0; i < lineas; i++) {
            System.out.println("");
        }
    }
}

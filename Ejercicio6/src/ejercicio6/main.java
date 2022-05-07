package ejercicio6;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<Double>();

        numeros.add(2.2);
        numeros.add(25.2);
        numeros.add(76.2);
        numeros.add(23.2);
        numeros.add(7.2);
        numeros.add(97.2);
        numeros.add(54.2);
        numeros.add(12.2);
        numeros.add(3.2);
        numeros.add(6.2);
        numeros.add(64.2);
        numeros.add(1.2);
        numeros.add(9.2);
        numeros.add(43.2);
        numeros.add(76.2);
        numeros.add(52.2);
        numeros.add(21.2);
        numeros.add(24.2);
        numeros.add(5.2);
        numeros.add(13.2);

        // Filtrar numeros mayores a 25.4
        ArrayList<Double> mayores = new ArrayList<Double>();

        for (Double num : numeros) {
            if (num >= 25.4) {
                mayores.add(num);
            }
        }

        // Obtener promedio de los numeros mayores a 25.4
        double promedio = 0;
        int size = mayores.size();

        for (Double num : mayores) {
            promedio += num;
        }

        promedio = promedio / size;

        System.out.println("Promedio: " + promedio);

    }

}

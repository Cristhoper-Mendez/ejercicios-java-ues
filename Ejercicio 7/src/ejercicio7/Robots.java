package ejercicio7;

import entidades.Robot;
import java.util.ArrayList;
import java.util.Collections;

public class Robots {

    ArrayList<Robot> lista = new ArrayList<Robot>();
    ArrayList<Integer> ints = new ArrayList<Integer>();

    public Robots() {
        this.lista.add(new Robot(1, 60));
        this.lista.add(new Robot(2, 30));
        this.lista.add(new Robot(3, 40));
        this.lista.add(new Robot(4, 70));
        this.lista.add(new Robot(5, 0));
        this.lista.add(new Robot(6, 75));
        this.lista.add(new Robot(7, 9));
        this.lista.add(new Robot(8, 64));
        this.lista.add(new Robot(9, 12));
    }

    public void Ordenar() {
        Collections.sort(this.lista, new SortByLife());
    }

    public void ImprimirOrdenado() {

        this.Ordenar();

        for (Robot rob : this.lista) {
            System.out.println("r " + rob.getVida());
        }
    }

    public void ImprimirCantidadRobotsMasVida() {
        int cantidad = 0;

        for (Robot rob : this.lista) {
            if (rob.getVida() > 50) {
                cantidad += 1;
            }
        }

        System.out.println("La cantidad de robots con minimo 50% de vida es " + cantidad);
    }

    public void Imprimir3RobotsConMasVida() {
        this.Ordenar();

        int size = this.lista.size();

        System.out.println("Robot con el numero de serie " + this.lista.get(size - 1).getNumeroSerie());
        System.out.println("Robot con el numero de serie " + this.lista.get(size - 2).getNumeroSerie());
        System.out.println("Robot con el numero de serie " + this.lista.get(size - 3).getNumeroSerie());
    }

}

package ejercicio7;

import entidades.Robot;
import java.util.Comparator;

public class SortByLife implements Comparator<Robot> {

    public int compare(Robot a, Robot b) {
        return a.getVida() - b.getVida();
    }
}

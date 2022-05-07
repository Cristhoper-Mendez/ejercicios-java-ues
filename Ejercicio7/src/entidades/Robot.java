package entidades;

public class Robot {

    int numeroSerie;
    int vida;

    public Robot(int numeroSerie, int vida) {
        this.numeroSerie = numeroSerie;
        this.vida = vida;
    }

    public Robot() {
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

}

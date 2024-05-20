package geometria;

public class Rettangolo extends FormaGeometrica {
    private double lunghezza;
    private double larghezza;

    public Rettangolo(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (lunghezza + larghezza);
    }

    @Override
    public double calcolaArea() {
        return lunghezza * larghezza;
    }

    @Override
    public double calcolaDiagonale() {
        return Math.sqrt(lunghezza * lunghezza + larghezza * larghezza);
    }
}

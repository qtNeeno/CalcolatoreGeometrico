package geometria;

public class Quadrato extends FormaGeometrica {
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    @Override
    public double calcolaPerimetro() {
        return 4 * lato;
    }

    @Override
    public double calcolaArea() {
        return lato * lato;
    }

    @Override
    public double calcolaDiagonale() {
        return lato * Math.sqrt(2);
    }
}

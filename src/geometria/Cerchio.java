package geometria;

public class Cerchio extends FormaGeometrica {
    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * Math.PI * raggio;
    }

    @Override
    public double calcolaArea() {
        return Math.PI * Math.pow(raggio, 2);
    }

    @Override
    public double calcolaDiagonale() {
        return 2 * raggio;
    }

    @Override
    public double calcolaRaggio() {
        return raggio;
    }
}

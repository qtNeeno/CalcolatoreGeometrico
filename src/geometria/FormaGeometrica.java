package geometria;

public abstract class FormaGeometrica {
    public abstract double calcolaPerimetro();
    public abstract double calcolaArea();
    public abstract double calcolaDiagonale();

    public double calcolaRaggio() {
        return 0;
    }
}

package geometria;

public class Trapezio extends FormaGeometrica {
    private double baseMaggiore;
    private double baseMinore;
    private double lato1;
    private double lato2;
    private double altezza;

    public Trapezio(double baseMaggiore, double baseMinore, double lato1, double lato2, double altezza) {
        this.baseMaggiore = baseMaggiore;
        this.baseMinore = baseMinore;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.altezza = altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return baseMaggiore + baseMinore + lato1 + lato2;
    }

    @Override
    public double calcolaArea() {
        return (baseMaggiore + baseMinore) * altezza / 2;
    }

    @Override
    public double calcolaDiagonale() {
        return 0;
    }
}

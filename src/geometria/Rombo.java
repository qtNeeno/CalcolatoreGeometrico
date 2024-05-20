package geometria;

public class Rombo extends FormaGeometrica {
    private double lato;
    private double diagonaleMaggiore;
    private double diagonaleMinore;

    public Rombo(double lato, double diagonaleMaggiore, double diagonaleMinore) {
        this.lato = lato;
        this.diagonaleMaggiore = diagonaleMaggiore;
        this.diagonaleMinore = diagonaleMinore;
    }

    @Override
    public double calcolaPerimetro() {
        return 4 * lato;
    }

    @Override
    public double calcolaArea() {
        return (diagonaleMaggiore * diagonaleMinore) / 2;
    }

    @Override
    public double calcolaDiagonale() {
        return Math.sqrt(Math.pow(diagonaleMaggiore / 2, 2) + Math.pow(diagonaleMinore / 2, 2)) * 2;
    }
}

import geometria.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            System.out.println("Ciao! Sono Felix e sono il tuo calcolatore geometrico. Scegli una figura:");
            System.out.println("1. Quadrato");
            System.out.println("2. Rettangolo");
            System.out.println("3. Trapezio");
            System.out.println("4. Cerchio");
            System.out.println("5. Triangolo");
            System.out.println("6. Rombo");
            System.out.println("7. Esci");
            int sceltaFigura = scanner.nextInt();

            if (sceltaFigura == 7) {
                continua = false;
                System.out.println("Arrivederci! :)");
                break;
            }

            FormaGeometrica forma = null;

            switch (sceltaFigura) {
                case 1:
                    System.out.println("Inserisci la lunghezza del lato del quadrato:");
                    double latoQuadrato = scanner.nextDouble();
                    forma = new Quadrato(latoQuadrato);
                    break;
                case 2:
                    System.out.println("Inserisci la lunghezza del rettangolo:");
                    double lunghezza = scanner.nextDouble();
                    System.out.println("Inserisci la larghezza del rettangolo:");
                    double larghezza = scanner.nextDouble();
                    forma = new Rettangolo(lunghezza, larghezza);
                    break;
                case 3:
                    System.out.println("Inserisci la lunghezza della base maggiore del trapezio:");
                    double baseMaggiore = scanner.nextDouble();
                    System.out.println("Inserisci la lunghezza della base minore del trapezio:");
                    double baseMinore = scanner.nextDouble();
                    System.out.println("Inserisci la lunghezza del lato 1 del trapezio:");
                    double lato1 = scanner.nextDouble();
                    System.out.println("Inserisci la lunghezza del lato 2 del trapezio:");
                    double lato2 = scanner.nextDouble();
                    System.out.println("Inserisci l'altezza del trapezio:");
                    double altezza = scanner.nextDouble();
                    forma = new Trapezio(baseMaggiore, baseMinore, lato1, lato2, altezza);
                    break;
                case 4:
                    System.out.println("Inserisci il raggio del cerchio:");
                    double raggio = scanner.nextDouble();
                    forma = new Cerchio(raggio);
                    break;
                case 5:
                    System.out.println("Inserisci la lunghezza del lato 1 del triangolo:");
                    double latoTriangolo1 = scanner.nextDouble();
                    System.out.println("Inserisci la lunghezza del lato 2 del triangolo:");
                    double latoTriangolo2 = scanner.nextDouble();
                    System.out.println("Inserisci la lunghezza della base del triangolo:");
                    double baseTriangolo = scanner.nextDouble();
                    System.out.println("Inserisci l'altezza del triangolo:");
                    double altezzaTriangolo = scanner.nextDouble();
                    forma = new Triangolo(latoTriangolo1, latoTriangolo2, baseTriangolo, altezzaTriangolo);
                    break;
                case 6:
                    System.out.println("Inserisci la lunghezza del lato del rombo:");
                    double latoRombo = scanner.nextDouble();
                    System.out.println("Inserisci la lunghezza della diagonale maggiore del rombo:");
                    double diagonaleMaggiore = scanner.nextDouble();
                    System.out.println("Inserisci la lunghezza della diagonale minore del rombo:");
                    double diagonaleMinore = scanner.nextDouble();
                    forma = new Rombo(latoRombo, diagonaleMaggiore, diagonaleMinore);
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    continue;
            }

            if (forma != null) {
                boolean continuaCalcolo = true;
                while (continuaCalcolo) {
                    System.out.println("Scegli un calcolo da eseguire:");
                    System.out.println("1. Area");
                    System.out.println("2. Perimetro");
                    System.out.println("3. Diagonale");
                    System.out.println("4. Raggio");
                    System.out.println("5. Torna indietro");
                    int sceltaCalcolo = scanner.nextInt();

                    switch (sceltaCalcolo) {
                        case 1:
                            System.out.println("Area: " + forma.calcolaArea());
                            break;
                        case 2:
                            System.out.println("Perimetro: " + forma.calcolaPerimetro());
                            break;
                        case 3:
                            System.out.println("Diagonale: " + forma.calcolaDiagonale());
                            break;
                        case 4:
                            System.out.println("Raggio: " + forma.calcolaRaggio());
                            break;
                        case 5:
                            continuaCalcolo = false;
                            break;
                        default:
                            System.out.println("Scelta non valida. Riprova.");
                            break;
                    }
                }
            }
        }
        scanner.close();
    }
}

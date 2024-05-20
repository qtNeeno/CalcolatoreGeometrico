# Progetto Geometria

Questo progetto in Java consente di eseguire vari calcoli geometrici su diverse forme geometriche: Quadrato, Rettangolo, Trapezio, Cerchio, Triangolo e Rombo. L'utente può selezionare una figura e scegliere quale calcolo eseguire tra area, perimetro, diagonale e raggio (dove applicabile).

## Struttura del Progetto

Il progetto è composto da diverse classi, organizzate come segue:

- `FormaGeometrica`: Classe astratta che rappresenta una forma geometrica. Definisce metodi astratti per calcolare il perimetro, l'area, la diagonale e il raggio.
- `Quadrato`: Classe che estende `FormaGeometrica` e implementa i metodi per calcolare le proprietà di un quadrato.
- `Rettangolo`: Classe che estende `FormaGeometrica` e implementa i metodi per calcolare le proprietà di un rettangolo.
- `Trapezio`: Classe che estende `FormaGeometrica` e implementa i metodi per calcolare le proprietà di un trapezio.
- `Cerchio`: Classe che estende `FormaGeometrica` e implementa i metodi per calcolare le proprietà di un cerchio.
- `Triangolo`: Classe che estende `FormaGeometrica` e implementa i metodi per calcolare le proprietà di un triangolo.
- `Rombo`: Classe che estende `FormaGeometrica` e implementa i metodi per calcolare le proprietà di un rombo.
- `Main`: Classe principale che gestisce l'interazione con l'utente.

## Utilizzo

1. Compila il progetto utilizzando un IDE Java o dalla riga di comando con `javac`.
2. Esegui la classe `Main` per avviare il programma.

### Esempio di Esecuzione

Quando avvii il programma, verrà mostrato un menu che ti permetterà di scegliere una figura geometrica:

Scegli una figura geometrica:

1. Quadrato
2. Rettangolo
3. Trapezio
4. Cerchio
5. Triangolo
6. Rombo
7. Esci


Inserisci il numero corrispondente alla figura desiderata. Successivamente, ti verrà chiesto di inserire le dimensioni necessarie per la figura scelta.

Una volta inserite le dimensioni, verrà mostrato un altro menu per scegliere quale calcolo eseguire:

Scegli un calcolo da eseguire:

1. Area
2. Perimetro
3. Diagonale
4. Raggio
5. Torna indietro

Inserisci il numero corrispondente al calcolo desiderato per visualizzare il risultato. Puoi continuare a eseguire calcoli sulla stessa figura o tornare indietro per scegliere una nuova figura.

### Esempio di Output

Scegli una figura geometrica:

1. Quadrato
2. Rettangolo
3. Trapezio
4. Cerchio
5. Triangolo
6. Rombo
7. Esci

1

Inserisci la lunghezza del lato del quadrato:

4

Scegli un calcolo da eseguire:
1. Area
2. Perimetro
3. Diagonale
4. Raggio
5. Torna indietro

1

Area: 16.0

### Requisiti di Sistema

- Java JDK 8 o superiore

### Note

- Il metodo `calcolaRaggio` ritorna `0` per le forme che non hanno un raggio applicabile.

## Autore

- qtNeeno

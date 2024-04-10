/*Scrivere un programma che contenga una classe astratta chiamata Forma ed un
metodo astratto chiamato calcolaArea(). Crea poi due sottoclassi Rettangolo e
Triangolo che estendono Forma ed implementano il metodo per il calcolo dell'area
in maniera specifica.*/

public class Main {

    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(4, 7);
        Triangolo triangolo = new Triangolo(6, 5);

        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());
        System.out.println("L'area del triangolo è: " + triangolo.calcolaArea());
    }
}

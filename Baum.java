//import javax.swing.*;

public class Baum{
    public static void main(String[] args){
        // Variablen deklarienen und Initialisieren
        int hoehe = Integer.parseInt(args[0]);
        char zeichen = args[1].charAt(0);
        String baum = "";
        int anzahlZeichen = 1;
        int leerzeichen = hoehe -1;

        //Baum
        for(int i = 0; i < hoehe; i++){

            // Leerzeichen einfügen
            for(int j = 0; j < leerzeichen; j ++){
                baum += " ";
            }
            leerzeichen--;

            // Anzahl Zeichen hinzufügen
            for(int j = 0; j < anzahlZeichen ; j++){
                baum += zeichen;
            }
            // Anzahl jede Zeile um 2 erhöhen
            anzahlZeichen += 2;
            // Zeilenumbruch am Ende einer Zeile
            baum += "\n";
        }
        // Baumstumpf
        for(int i = 0 ; i < hoehe / 2; i++){
            for(int j = 0; j < hoehe -1; j++){
                baum += " ";
            }

            baum += zeichen + "\n";
        }

        System.out.println(baum);
    }
}
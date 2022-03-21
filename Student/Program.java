package Student;

import javax.swing.JOptionPane;

public class Program {

    public static Student erfasseStudent(String name, String vorname){
        Student student = new Student(name, vorname);
        return student;
    }

    public static Student[] anzahlStudenten(int n){
        Student[] alleStudenten = new Student[n];
        String name;
        String vorname;

        for (int i = 0; i < alleStudenten.length; i++){
            name = JOptionPane.showInputDialog("Bitte den Namen eingeben:");
            vorname = JOptionPane.showInputDialog("Bitte den Vornamen eingeben:");
            alleStudenten[i] = erfasseStudent(name, vorname);
        }
        return alleStudenten;
    }

    public static String ausgabe(Student[] alleStudenten){
        String namen = "";
        for (int i = 0; i < alleStudenten.length; i++){
            namen += "Name" + alleStudenten[i].name + ", " + alleStudenten[i].vorname + "\n";

        }

        return namen;
    }




    public static void main(String[] args){
        int anzahl = Integer.parseInt(JOptionPane.showInputDialog("Wieviele Studenten möchtest du anlegen"));

        JOptionPane.showMessageDialog(null, ausgabe((anzahlStudenten(anzahl))));
    }
}

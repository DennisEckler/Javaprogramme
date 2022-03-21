package Student;

public class Student {

    int matrikelnummer;
    String name;
    String vorname;
    Adresse adresse;
    
    public Student(int matrikelnummer, String name, String vorname, Adresse adresse) {
        this.matrikelnummer = matrikelnummer;
        this.name = name;
        this.vorname = vorname;
        this.adresse = adresse;

    }

    public Student(String name, String vorname){
        this.name = name;
        this.vorname = vorname;
    }
    
}

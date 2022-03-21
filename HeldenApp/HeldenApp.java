package HeldenApp;

public class HeldenApp {

    public static void main(String[] args){
        Held sveti = new Held("Sveti", 200, 60, 70, true, new Waffe(30));
        Held dennis = new Held("Dennis", 200, 65, 50, false, new Waffe(10));


        HeldenApp.kampDerHelden(sveti, dennis, 3000);    
    }

    public static void kampDerHelden(Held angreifer, Held verteidiger, int speed){
        String nameAngreifer = angreifer.getName();
        String nameVerteidiger = verteidiger.getName();
        //String kampfgeschen = nameAngreifer + " greift " + nameVerteidiger + " an! \n\n";
        System.out.println(nameAngreifer + " greift " + nameVerteidiger + " an! \n\n");

        System.out.println(angreifer.vorstellen() + "\n\n" + verteidiger.vorstellen() + "\n\n");

        verzoegerung(speed * 2);

        while(angreifer.getLebenspunkte() > 0 && verteidiger.getLebenspunkte() > 0){
            System.out.println(nameAngreifer + " schlaegt " + nameVerteidiger + "!\n" + nameVerteidiger + " erleidet Schaden von " + angreifer.schlagen(verteidiger) + " und hat noch " + verteidiger.getLebenspunkte() + " Lebenspunkte. \n\n");
            verzoegerung(speed);
            System.out.println(nameVerteidiger + " schlaegt " + nameAngreifer + "!\n" + nameAngreifer + " erleidet Schaden von " + verteidiger.schlagen(angreifer) + " und hat noch " + angreifer.getLebenspunkte() + " Lebenspunkte. \n\n");
            verzoegerung(speed);
        }

        if( angreifer.getLebenspunkte() > 0){
            System.out.println(verteidiger.sterben());
        } else{
            System.out.println(angreifer.sterben());
        }


        //return kampfgeschen;

    }
    
    public static void verzoegerung(int millisekunden){
        try{
            Thread.sleep(millisekunden);
        } catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}

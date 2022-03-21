public class Methoden{

    public static double berechneMittelwert(double... zahlen){
        double summe = 0;
        double mittelwert = 0;
        for (double zahl : zahlen){
            summe += zahl;
        }
        mittelwert = summe / zahlen.length;
        return mittelwert;
    }

    public static String zahlevonbis(int von, int bis){
        String ausgabe = "";
        for(int i = von; i <= bis; i++){
            if (i < bis) {
                ausgabe += i + ", "; 
            } else {
                ausgabe += i;
            }    
        }
        return ausgabe;
    }

    public static long[] runden(double[] kommazahlen){
        long[] ganzeZahlen = new long[kommazahlen.length];

        for(int i = 0; i < kommazahlen.length; i++){
            ganzeZahlen[i] = Math.round(kommazahlen[i]);
        }
        return ganzeZahlen;
    }

}
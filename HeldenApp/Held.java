package HeldenApp;

public class Held {
    private String name;
    private int lebenspunkte;
    private int kraft;
    private int geschicklichkeit;
    private boolean boese;
    private Waffe waffe;

    public Held(){}

    public Held(String name, int lebenspunkte, int kraft, int geschicklichkeit, boolean boese, Waffe waffe){
        this.name = name;
        this.boese = boese;
        if(lebenspunkte > 0){
            this.lebenspunkte = lebenspunkte;
        }
        if(kraft > 0){
            this.kraft = kraft;
        }
        if(geschicklichkeit > 0){
            this.geschicklichkeit = geschicklichkeit;
        }
        if(waffe.setFrei(false)){
            this.waffe = waffe;
        }
    }

    public Held(String name, int lebenspunkte, int kraft, int geschicklichkeit, boolean boese){
        this.name = name;
        this.boese = boese;
        if(lebenspunkte > 0){
            this.lebenspunkte = lebenspunkte;
        }
        if(kraft > 0){
            this.kraft = kraft;
        }
        if(geschicklichkeit > 0){
            this.geschicklichkeit = geschicklichkeit;
        }
    }

    public void setBoese(boolean boese){
        this.boese = boese;
    }
    public boolean isBoese(){
        return boese;

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getLebenspunkte(){
        return lebenspunkte;
    }
    public boolean setLebenspunkte(int lebenspunkte){
        if(lebenspunkte >= 0){
            this.lebenspunkte = lebenspunkte;
            return true;
        }
        return false;
    }

    public int getKraft(){
        return kraft;
    }
    public boolean setKraft(int kraft){
        if(kraft >= 0){
            this.kraft = kraft;
            return true;
        }
        return false;
    }

    public int getGeschicklichkeit(){
        return geschicklichkeit;
    }
    public boolean setGeschicklichkeit(int geschicklichkeit){
        if(geschicklichkeit >= 0){
            this.geschicklichkeit = geschicklichkeit;
            return true;
        }
        return false;
    }

    // Objektmethode zum Begrüßen / Vorstellen
    public String vorstellen(){
        if (boese) {
            return "Ich bin " + name + " und ich werde dich vernichten!";
        }
        return "Ich bin " + name + " und ich freue mich.";
    }
    
    public void reduziereLebenspunkte(int schaden){
        if (schaden >= lebenspunkte){
            lebenspunkte = 0;
        } else {
            lebenspunkte -= schaden;
        }
    }

    public int schlagen(Held andererHeld) {
        int schaden = 0;
        if(lebenspunkte > 0){
            schaden = (int)(kraft * (1 - andererHeld.geschicklichkeit / 100) * Math.random());
            andererHeld.reduziereLebenspunkte(schaden);
        }
        return schaden;
    }

    public String sterben(){
        if(boese){
            return name + ": Das kann nicht sein! Ich, args, keuch, das Boese wird sich rächen";
        } else {
            return name+ ": Das gute wird immer Siegen.";
        }
    }

    public void setWaffe(Waffe waffe){
        if(this.getWaffe() !=null){
            this.waffe.setFrei(true);
        }
        this.waffe = waffe;
    }
    public Waffe getWaffe(){
        return waffe;
    }

}

package HeldenApp;

public class Waffe {

    private int schaden = 1;
    private boolean frei = true;

    public Waffe(int schaden){
        if (schaden > 0 && schaden <= 100){
            this.schaden = schaden;
        }
    }

    public int getSchaden(){
        return schaden;
    }

    public boolean setSchaden(int schaden){
        if (schaden > 0 && schaden <= 100){
            this.schaden = schaden;
            return true;
        }
        return false;
    }

    public boolean isFrei(){
        return frei;
    }

    public boolean setFrei(boolean frei){
        if(!this.frei && !frei){
            return false;
        }
        this.frei = frei;
        return true;
    }

    
}

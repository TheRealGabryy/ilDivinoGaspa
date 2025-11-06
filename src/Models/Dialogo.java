package Models;

import java.util.ArrayList;

public class Dialogo {
    private String frase;
    private ArrayList<Integer> scelte;

    public Dialogo(String frase, ArrayList<Integer> scelte) {
        this.frase = frase;
        this.scelte = scelte;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public ArrayList<Integer> getScelte() {
        return scelte;
    }

    public void setScelte(ArrayList<Integer> scelte) {
        this.scelte = scelte;
    }
}

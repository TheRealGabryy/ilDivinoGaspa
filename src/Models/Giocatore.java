package Models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Giocatore {
    private String nome;
    private int peccatiCapitali;
    private ArrayList<String> inventario;
    private int livelloMorale;
    private ArrayList<String> dialoghiSbloccati;

    public Giocatore() {
        inventario = new ArrayList<>();
        livelloMorale = 0;
        dialoghiSbloccati = new ArrayList<>();
        livelloMorale = 0;
        peccatiCapitali = 0;
    }

    public Giocatore(String nome, int peccatiCapitali, ArrayList<String> inventario, int livelloMorale, ArrayList<String> dialoghiSbloccati) {
        this.nome = nome;
        this.peccatiCapitali = peccatiCapitali;
        this.inventario = inventario;
        this.livelloMorale = livelloMorale;
        this.dialoghiSbloccati = dialoghiSbloccati;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeccatiCapitali() {
        return peccatiCapitali;
    }

    public void setPeccatiCapitali(int peccatiCapitali) {
        this.peccatiCapitali = peccatiCapitali;
    }

    public ArrayList<String> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<String> inventario) {
        this.inventario = inventario;
    }

    public int getLivelloMorale() {
        return livelloMorale;
    }

    public void setLivelloMorale(int livelloMorale) {
        this.livelloMorale = livelloMorale;
    }

    public ArrayList<String> getDialoghiSbloccati() {
        return dialoghiSbloccati;
    }

    public void setDialoghiSbloccati(ArrayList<String> dialoghiSbloccati) {
        this.dialoghiSbloccati = dialoghiSbloccati;
    }

    public void aggiungiOggetto(Oggetto oggetto) {

    }
    public boolean possiedeOggetto(Oggetto oggetto) {
        return false;
    }
    public void calcolaCorruzione() {

    }
}

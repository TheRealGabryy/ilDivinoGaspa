package Levels;

import Models.Dialogo;

import java.util.ArrayList;

public class Personaggio {
    private final String nome;
    private final String peccatoPrincipale;
    private final ArrayList<Dialogo> dialoghi;
    private int livello;
    private Anima anima;

    public Personaggio(String nome, String peccatoPrincipale, ArrayList<Dialogo> dialoghi, int livello, Anima anima) {
        this.nome = nome;
        this.peccatoPrincipale = peccatoPrincipale;
        this.dialoghi = dialoghi;
        this.livello = livello;
        this.anima = anima;
    }

    public String getNome() {
        return nome;
    }

    public String getPeccato() {
        return peccatoPrincipale;
    }

    public ArrayList<Dialogo> getDialoghi() {
        return dialoghi;
    }

    public int getLivello() {
        return livello;
    }

    public void setLivello(int livello) {
        this.livello = livello;
    }

    public Anima getAnima() {
        return anima;
    }

    public void setAnima(Anima anima) {
        this.anima = anima;
    }
}

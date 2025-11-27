package Levels;

import Models.Dialogo;

import java.util.ArrayList;

public class Personaggio {
    private final String nome;
    private final ArrayList<Dialogo> dialoghi;
    private int livello;

    public Personaggio(String nome, ArrayList<Dialogo> dialoghi, int livello) {
        this.nome = nome;
        this.dialoghi = dialoghi;
        this.livello = livello;
    }

    public String getNome() {
        return nome;
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
}

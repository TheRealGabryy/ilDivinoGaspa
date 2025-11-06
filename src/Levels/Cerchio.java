package Levels;

import Models.Dialogo;

import java.util.ArrayList;

public class Cerchio {
    private String nome;
    private String descrizione;
    private ArrayList<Anima> anime;

    public Cerchio(String nome, String descrizione, ArrayList<Anima> anime) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.anime = anime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public ArrayList<Anima> getAnime() {
        return anime;
    }

    public void setAnime(ArrayList<Anima> anime) {
        this.anime = anime;
    }
}

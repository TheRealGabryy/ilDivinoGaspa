package Levels;

import Models.Dialogo;

import java.util.ArrayList;

public class Cerchio { //SI POTREBBE CONVERTIRE in una record class, lo possiamo fare più avanti ma è un argomento avanzato
    private final String nome;
    private final String descrizione;
    private final ArrayList<Anima> anime;

    public Cerchio(String nome, String descrizione, ArrayList<Anima> anime) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.anime = anime;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public ArrayList<Anima> getAnime() {
        return anime;
    }

}

package Levels;

import Models.Dialogo;

import java.util.ArrayList;

public class Personaggio {
    private final String nome;
    private final ArrayList<Dialogo> dialoghi; //<- la classe Dialogo può anche essere dichiarata a parte

    public Personaggio(String nome, ArrayList<Dialogo> dialoghi) {
        this.nome = nome;
        this.dialoghi = dialoghi;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Dialogo> getDialoghi() {
        return dialoghi;
    }

    public String printDialogo(int index) {
        return dialoghi.get(index).toString();
    }
}

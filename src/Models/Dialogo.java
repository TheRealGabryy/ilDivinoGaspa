package Models;
import java.util.Objects;

public class Dialogo {
    private final String testo;
    private final String[] opzioni;

    public Dialogo(String testo, String[] opzioni) {
        this.testo = testo;
        this.opzioni = opzioni;
    }

    public Dialogo(String testo) {
        this.testo = testo;
        this.opzioni = null;
    }

    public String toString() {
        return "> " + testo + "\n";
    }

    public void printPozioni() {
        for (int i = 0; i < Objects.requireNonNull(opzioni).length; i++) {
            System.out.println((i+1) + ": " + opzioni[i]);
        }
    }
    /*
    * COME USARE LA CLASSE DIALOGO:
    *
    * Per stampare un dialologo, puoi fare: System.out.println(new Dialogo("testo del dialogo"))
    *
    * puoi anche dichiaranrlo con le opzioni ad esempio:
    * Dialogo d = new Dialogo("testo qui", scelte) <- le scelte posso anche essere NON messe, come vedi ci sono 2 costruttori
    * System.out.println(d); <- stampa SOLO IL TESTO
    * d.printOpzioni(); <- stampa le opzioni
    * */
}

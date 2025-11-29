package GameBuilder;

import Levels.Personaggio;
import Models.Dialogo;

import java.util.ArrayList;

public class Inferno {
    //SEZIONE CERCHI. qui abbiamo ogni cerchio di quelli PRESENTI NELL'ENUMERATORE. sono dei metodi boolean perchè ritornano true se il giocatore ha vinto. e false se decide di arrendersi.
    public static boolean cerchioLimbo() throws InterruptedException {
        System.out.println("Ti trovi nel Limbo");

        /*
        * ESEMPIO di dichiarazione di un personaggio:
        *
        * 1) Fare i dialoghi in un array List.
        * 2) Creare il personaggio passando come parametro i dialoghi, anche se non ce ne sono subito
        *
        * POI: per dialoghi LUNGHI, dobbiamo generalizzare come creare i dialoghi, perchè
        * non possiamo fare diecimila .get() e .add() come dialoghi, ma questo vale solo per monologhi lunghi.*/


        ArrayList<Dialogo> dialoghiOrazio = new ArrayList<>();
        Personaggio p = new Personaggio("Orazio", dialoghiOrazio);
        dialoghiOrazio.add(new Dialogo("Dialogo 1")); //Posso aggiungere i dialoghi anche DOPO aver assegnato l'arrayList a Orazio
        dialoghiOrazio.add(new Dialogo("Dialogo 2"));
        dialoghiOrazio.add(new Dialogo("Dialogo 3"));

        System.out.println(p.printDialogo(0)); //STAMPO UN DIALOGO, con il metodo "printDialogo" che trovi nella classe PERSONAGGIO

        dialoghiOrazio.add(new Dialogo("Dialogo 4")); //anche se aggiungo un dialogo DOPO aver fatto dei print, posso comumque aggiungerli.
        System.out.println(p.printDialogo(3));

        /*
        * TO DO: Creare i dialoghi per il tutorial
        * far vedere tutte le meccaniche.
        * per far si che si aspetti un po per stampare i dialoghi, si usa:
        * Thread.sleep(1000); dove 1000 sono i MILLISECONDI, quindi quel
        * comando li ora fa aspettare un solo secondo
        *
        * Il metodo Thread.sleep(); deve per forza implementare:
        *
        *  throws InterruptedException
        *
        * che puoi trovare nella firma del metodo.
        * */



        return true;
    }

    public static boolean cerchioLussuriosi() {
        System.out.println("Ti trovi nei Lussuriosi");
        return true;
    }

    public static boolean cerchioGolosi() {
        System.out.println("Ti trovi nei Golosi");
        return true;
    }
    public static boolean cerchioAvari() {
        System.out.println("Ti trovi nei Avari");
        return true;
    }
    public static boolean cerchioIracondi() {
        System.out.println("Ti trovi negli Iracondi");
        return true;
    }
    public static boolean cerchioEretici() {
        System.out.println("Ti trovi negli Eretici");
        return true;
    }
    public static boolean cerchioViolenti() {
        System.out.println("Ti trovi nei Violenti");
        return true;
    }
    public static boolean cerchioFraudolenti() {
        System.out.println("Ti trovi nei Fraudolenti");
        return true;
    }
    public static boolean cerchioTraditori() {
        System.out.println("Ti trovi nei Traditori");
        return true;
    }
}

import GameBuilder.Cerchi;
import System.*;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in); //Scanner finale perchè non ha bisogno di essere modificato
    public static String nome;
    public static final Cerchi[] cerchi = Cerchi.values(); //Creo un array finale che si adatta in base a quanti cerchi metto nell'ENUMERATORE cerchi nella cartella gameBuilder


    public static final String[] mainMenu = {  //gli array di stringhe dei menu come questo devo essere TUTTE fatte così per essere organizzati
            "Nuova Partita",
            "Carica partita (Coming Soon)",
            "Esci"
    };
    public static void printBasicTutorial() throws InterruptedException/*questo è semplicemente l'errore che da quando il THREAD fallisce
    (mai essendo che è un banalissimo .sleep), lo da intelliJ in automatico*/
    { //questo è il tutorial BASE BASE del gioco, come comandi, e come funziona in termini di tasti.
        System.out.println("Ti trovi all'inferno");
        Thread.sleep(1500);
        System.out.println("Non hai idea di come ci sei finito qui...");
        Thread.sleep(1500);
        System.out.println("Il tuo obiettivo è quello di uscire.");
        Thread.sleep(1500);
        System.out.println("Potrai parlare con dei personaggi");
        System.out.println("che ti daranno oggetti necessari per avanzare");
        Thread.sleep(1500);
        System.out.println("Troverai sfide, ostacoli, e punti ciechi");
        Thread.sleep(1500);
        System.out.println("Ma puoi sempre fare affidamento sulla tua Guida.");
        System.out.println("Nuon Divertimento!");
    }

    public static void iniziaGioco() {
        boolean haVinto = false;
        for (int i = 0; i < cerchi.length; i++) { // Quando inizio la partita, devo completare tutti i cerchi, dove "tutti i cerchi" sono definiti con cerchi.lenght

            /*Switch efficente ed efficace, ad cosa deriva? dal fatto che:
            avendo i metodi bool, la variabile hai vinto viene assegnata a ciascuno, come in una espressione matematica, è come
            se facessi il raccoglimento della variabile, e gli assegno il valore che butta fuori ogni case.*/

            /*DILEMMA:
            *
            * SE FARE CHE C'è UN METODO SOLO CHIMATATO "Gioca Cerchio" dove gli passo come parametro il cerchio, e nel cerchio che passo come paramentro ho contenute tutte le info-
            *
            * OPPURE SE FARE QUALCOSA DI UN MINIMO MENO "EFFICENTE" in termini di codifica, ma più leggibile, ovvero diversi metodi per i diversi cerchi.
            *
            * se facciamo un metodo UNIVOCO per tutti i cerchi allora risulterebbe anche più facile aggiungere cerchi*/
            haVinto = switch (cerchi[i]) {
                case Limbo -> cerchioLimbo();
                case Lussuriosi -> cerchioLussuriosi();
                case Golosi -> cerchioGolosi();
                case Avari_e_Prodighi -> cerchioAvari();
                case Iracondi_e_Accidiosi -> cerchioIracondi();
                case Eretici -> cerchioEretici();
                case Violenti -> cerchioViolenti();
                case Fraudolenti -> cerchioFraudolenti();
                case Traditori -> cerchioTraditori();
            };

            if (!haVinto) { //se ha perso, torna alla schermata principale. per perdere devi schiacciare "indietro" nel gioco, sostanzialmente arrendendoti.
                System.out.println("Ti sei arreso! ritorno alla schermata principale");
            }

            //TO DO IN FUTURO: tentativi per i cerchi. così facciamo il gioc un po spicy e te lo devi imparare for real.
        }
    }

    public static void nuovaPartita() throws InterruptedException {
        //PULISCO IL BUFFER DAL TRY CATCH, non toccare.
        scanner.nextLine();
        System.out.println("Inserisci in nome del giocatore");
        do {
            System.out.print("-> ");
            nome = scanner.nextLine();
            if (!checkNome(nome)) { //se checknome ritorna FALSO.
                System.out.println("Inserisci un nome per il giocatore corretto!");
            }
        } while (!checkNome(nome)); //ATTENZIONE: INTELLIJ SBAGLIA, pensa che il metodo sia invertito ma NON LO E. ignora il warning.
        printBasicTutorial();
        System.out.println("---- Premi invio per iniziare! ");
        String invio = scanner.nextLine(); //anche se l'utente scrive qualcosa, non cabierebbe nulla perchè questa è una variabile fine a se stessa
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Benvenuto al gioco della divina commedia");
        boolean continua = true;
        int choice = 0;

        do {
            Menu.printMenu("Initial Menu", mainMenu);
            try { //semplice try catch anzichè usare "Integer.parseInt" perchè esso non permetterebbe di continuare in ogni caso. mentre try catch si.
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Non hai inserito un intero");
            }

            switch (choice) {
                case 1:
                    System.out.println("Nouva partita"); //Inizio la partita, metodi SOPRA
                    nuovaPartita();
                    break;
                case 2:
                    System.out.println("Questa feature è coming soon"); //alla fine non fa nulla
                    break;
                case 3:
                    System.out.println("Uscita programma"); //chiunde il programma
                    continua = false;
                    break;
                default: //SE l'utente inserisce qualsiasi numero diverso da quelli possibili, andrà qui, questo crea un semplicissimo controllo.
                    System.out.println("Non hai inserito un'opzione valida");
                    break;
            }
        } while (continua);
    }

    public static boolean checkNome(String nome) {
        for (int i = 0; i < nome.length(); i++) {
            if (!Character.isLetter(nome.charAt(i))) { //se il carattere analizzato NON E una lettera, allora è un numero o carattere speciale, che ritorna falso.
                return false;
            }
        }
        return true;
    }



    //SEZIONE CERCHI. qui abbiamo ogni cerchio di quelli PRESENTI NELL'ENUMERATORE. sono dei metodi boolean perchè ritornano true se il giocatore ha vinto. e false se decide di arrendersi.
    public static boolean cerchioLimbo() {

        return true;
    }

    public static boolean cerchioLussuriosi() {

        return true;
    }

    public static boolean cerchioGolosi() {

        return true;
    }
    public static boolean cerchioAvari() {

        return true;
    }
    public static boolean cerchioIracondi() {

        return true;
    }
    public static boolean cerchioEretici() {

        return true;
    }
    public static boolean cerchioViolenti() {

        return true;
    }
    public static boolean cerchioFraudolenti() {

        return true;
    }
    public static boolean cerchioTraditori() {

        return true;
    }

}

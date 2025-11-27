import System.*;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static String nome;


    public static final String[] mainMenu = {
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

    public static void nuovaPartita() throws InterruptedException {
        scanner.nextLine();
        System.out.println("Inserisci in nome del giocatore");
        do {
            System.out.print("-> ");
            nome = scanner.nextLine();
            if (!checkNome(nome)) {
                System.out.println("Inserisci un nome per il giocatore corretto!");
            }
        } while (!checkNome(nome));
        printBasicTutorial();
        System.out.println("---- Premi invio per iniziare! ");
        String invio = scanner.nextLine();


    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Benvenuto al gioco della divina commedia");
        boolean continua = true;
        int choice = 0;
        do {
            Menu.printMenu("Initial Menu", mainMenu);
            try {
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
            if (!Character.isLetter(nome.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);



    public static final String[] mainMenu = {
            "Nuova Partita",
            "Carica partita (Coming Soon)",
            "Esci"
    };


    public static void nuovaPartita() {
        System.out.println("Inserisci in nome del giocatore:");
        String nome;
        do {
            nome = scanner.nextLine();
            if (!checkNome(nome)) {
                System.out.println("Inserisci un nome del giocatore corretto");
            }
        } while (!checkNome(nome));
    }

    public static void main(String[] args) {
        System.out.println("Benvenuto al gioco della divina commedia");
    }

    public static boolean checkNome(String nome) {
        boolean hasSpecial = false;
        for (int i = 0; i < nome.length(); i++) {
            if (!Character.isLetter(nome.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

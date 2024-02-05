import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int righe = -1, colonne = -1;
        do {
            System.out.print("Inserisci il numero di righe [ > 0 ]:");
            righe = scanner.nextInt();
        }while(righe <= 0);

        do {
            System.out.print("Inserisci il numero di colonne [ > 0 ]:");
            colonne = scanner.nextInt();
        }while(colonne <= 0);

        CampoMinato cM = new CampoMinato(righe, colonne);

        System.out.println("Inizializzazione campo ...");
        cM.inizializzaCampo();
        System.out.println("Posizionamento mine ...");
        cM.posizionaMine();

        System.out.println("Campo iniziale:");
        System.out.println(cM.stampaCampo());

        while (true) {
            System.out.print("Inserisci riga: ");
            int riga = scanner.nextInt();

            System.out.print("Inserisci colonna: ");
            int colonna = scanner.nextInt();

            if (!cM.eseguiClick(riga, colonna)) {
                System.out.println("Hai colpito una mina! Il gioco è terminato.");
                break;
            }

            System.out.println("Campo dopo il click:");
            System.out.println(cM.stampaCampo());
        }

        scanner.close();
    }
}
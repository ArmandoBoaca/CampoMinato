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

        int rigaIn = 0;
        int colonnaIn = 0;
        while (true) {
            do {
                System.out.print("Inserisci riga: ");
                rigaIn = scanner.nextInt();

            }while((rigaIn > (righe - 1)) || (rigaIn <= 0));

            do {
                System.out.print("Inserisci colonna: ");
                colonnaIn = scanner.nextInt();
            }while((colonnaIn > (colonne - 1)) || (colonnaIn <= 0));

            if (!cM.eseguiClick(rigaIn, colonnaIn)) {
                System.out.println("Hai colpito una mina! Il gioco è terminato.");
                break;
            }

            System.out.println("Campo dopo il click:");
            System.out.println(cM.stampaCampo());
        }

        scanner.close();
    }
}
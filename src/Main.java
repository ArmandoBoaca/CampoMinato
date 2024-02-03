import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int righe = 11, colonne = 9;
        CampoMinato cM = new CampoMinato(righe, colonne);
        cM.inizializzaCampo();
        System.out.println(cM.stampaCampo());
        cM.posizionaMine();
        System.out.println(cM.stampaCampo());

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
import java.util.Random;

public class CampoMinato {

    private int righe;
    private int colonne;
    private int[][] campo;
    private boolean[][] celleScoperte;

    public CampoMinato(int righe, int colonne){
        this.righe = righe;
        this.colonne = colonne;
        this.celleScoperte = new boolean[righe][colonne];
    }

    public void inizializzaCampo(){
        this.campo = new int[righe][colonne];
        for (int i = 0; i < this.righe; i++ ) {
            for (int j = 0; j < this.colonne; j++) {
                this.campo[i][j] = 0;
                this.celleScoperte[i][j] = false;
            }

        }
    }

    public void posizionaMine() {
        int nMine = this.righe * this.colonne / 10;
        int Mina = -1;

        for (int i = 0; i < nMine; i++) {
            int rigaRandom = (int) (Math.random() * this.righe);
            int colonnaRandom = (int) (Math.random() * this.colonne);

            while (campo[rigaRandom][colonnaRandom] == Mina) {
                rigaRandom = (int) (Math.random() * this.righe);
                colonnaRandom = (int) (Math.random() * this.colonne);
            }

            campo[rigaRandom][colonnaRandom] = Mina;
        }
    }

    public boolean eseguiClick(int riga, int colonna){
        if (celleScoperte[riga][colonna]) {
            return true;
        }

        celleScoperte[riga][colonna] = true;

        if (campo[riga][colonna] == -1) {
            return false;
        }
        return true;
    }


    public String stampaCampo(){
        String str = "";
        for (int i = 0; i < this.righe; i++ ) {
            for (int j = 0; j < this.colonne; j++) {
                // Mostra solo le celle scoperte e il valore della mina se è stata colpita
                if (celleScoperte[i][j]) {
                    str += this.campo[i][j] + "\t";
                } else {
                    str += "X\t";  // X indica una cella non scoperta
                }
            }
            str+="\n";
        }
        return str;
    }



}

import java.util.Random;

public class CampoMinato {

    private int righe;
    private int colonne;
    private int[][] campo;

    public CampoMinato(int righe, int colonne){
        this.righe = righe;
        this.colonne = colonne;
    }

    public void inizializzaCampo(){
        this.campo = new int[righe][colonne];
        for (int i = 0; i < this.righe; i++ ) {
            for (int j = 0; j < this.colonne; j++) {
                this.campo[i][j] = 0;
            }

        }
    }

    public void posizionaMine() {
        int nMine = this.righe * this.colonne / 10;
        int Mina = -1;

        for (int i = 0; i < nMine; i++) {
            int rigaRandom = (int) (Math.random() * this.righe);
            int colonnaRandom = (int) (Math.random() * this.colonne);

            // Assicurati che la cella selezionata non contenga già una mina
            while (campo[rigaRandom][colonnaRandom] == Mina) {
                rigaRandom = (int) (Math.random() * this.righe);
                colonnaRandom = (int) (Math.random() * this.colonne);
            }

            // Posiziona la mina nella cella selezionata
            campo[rigaRandom][colonnaRandom] = Mina;
        }
    }

    public boolean eseguiClick(int riga, int colonna){

    }


    public String stampaCampo(){
        String str = "";
        for (int i = 0; i < this.righe; i++ ) {
            for (int j = 0; j < this.colonne; j++) {
                str += this.campo[i][j]+ "\t";
            }
            str += "\n";

        }
        return str;
    }



}

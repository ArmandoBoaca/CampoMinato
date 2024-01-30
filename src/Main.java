public class Main {
    public static void main(String[] args) {
        int righe = 11, colonne = 9;
        CampoMinato c = new CampoMinato(righe, colonne);
        c.inizializzaCampo();
        System.out.println(c.stampaCampo());
    }
}
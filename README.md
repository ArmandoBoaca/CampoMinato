# CampoMinato
• Implementa una classe CampoMinato che gestisce la logica del gioco del Campo Minato.

• La classe deve avere un costruttore che accetta il numero di righe e colonne del campo minato come parametri.

• La classe deve avere un metodo inizializzaCampo() che inizializza la matrice del campo minato con tutte le celle vuote.

• La classe deve avere un metodo posizionaMine() che posiziona le mine in modo casuale sulla griglia in base a una percentuale fornita dall'utente.

• La classe deve avere un metodo stampaCampo() che stampa lo stato attuale del campo minato.

• La classe deve avere un metodo eseguiClick(int riga, int colonna) che gestisce il click dell'utente su una cella e restituisce true se il gioco può continuare o false se è terminato.


• Nel metodo main, chiedi all'utente di inserire il numero di righe e colonne del campo minato.

• Crea un'istanza della classe CampoMinato con le dimensioni fornite dall'utente.

• Esegui un ciclo che chiede all'utente di effettuare un click sulla griglia e chiami il metodo corrispondente della classe CampoMinato.

• Stampa lo stato del campo minato ad ogni click.

• Termina il gioco quando l'utente clicca su una cella con una mina o quando tutte le celle sicure sono state cliccate.
Requisiti Opzionali (bonus):

• Aggiungi funzionalità extra come la visualizzazione della griglia completa con le mine al termine del gioco o statistiche finali.

• Gestisci input non validi o fornisce un'interfaccia utente più amichevole.

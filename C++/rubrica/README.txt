
(NON È STATO IMPLEMENTATO IL MAKEFILE, LA DIVISIONE TRA FILE, QUALCHE CONTROLLO BANALE e il TOUPPER)
Creare un programma per la gestione di una rubrica che permetta all'utente di:
- inserire contatti
- leggere contatti
- leggere singolo contatto
- cancellare contatti
tramite input da console

La struttura dovrà prevedere:
- uso di vector<> per la gestione dei dati
- input da console (usare ad esempio il comando std::getline() o il più diretto std::cin)
- gestione di contatti di tipo diverso (persone fisiche e aziende)
- controlli sui dati inseriti
- gestione di classi differenti (se possibile usare la modularità del progetto, quindi inserire più classi da compilare tramite makefile)

Per quanto riguarda la gestione di contatti differenti si può prevedere che le persone fisiche abbiano i seguenti dati:
- nome, cognome, codice fiscale, numero di telefono
mentre un'azienda abbia i seguenti dati:
- nominativo, partita iva, numero di telefono
Creare un'interfaccia generica per il contatto in modo da poter gestire entrambi i casi

per i controlli verificare:
- il codice fiscale di una persona fisica dovrà essere di 16 caratteri. La partita IVA di un'azienda di 12 caratteri
- trasformare nome, cognome e nominativo in maiuscolo (usare ad esempio il metodo ::to_upper() della classe string)

Per un esempio di programma finale vedere l'allegato (prevede la presenza di una classe Rubrica che applicherà i metodi indicati)

Alcuni suggerimenti:
- per la cancellazione di un contatto vedere il metodo ::erase della classe vector
- se ci dovessero essere problemi con l'input dei dati di un contatto, vedere il metodo ::ws della classe string che elimina spazi bianchi e ritorni a capo
- per rendere upperCase una stringa vedere anche il metodo ::transform della classe string

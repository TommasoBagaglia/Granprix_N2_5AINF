# Gran Prix

Questo progetto implementa una simulazione di una gara di Formula 1, consentendo agli utenti di definire un circuito, inserire piloti e assistere alla gara. Il codice è scritto in Java e utilizza diverse classi per rappresentare le entità coinvolte nella simulazione.

## Struttura del Progetto

Il progetto è suddiviso in diverse classi:


- Circuito.java: Rappresenta un circuito con la sua lunghezza, numero di giri e pitstop.

- Giocatore.java: Rappresenta un giocatore con username.

- Giudice.java: Gestisce l'annuncio dell'inizio e della fine della gara, mostra l'andamento della gara e annuncia il vincitore.

- Granprix_N2_5AINF.java: Contiene il main del programma, dove viene eseguita la simulazione della gara.

- Matrice.java: Implementa una matrice utilizzata per la cifratura e decifratura delle password dei giocatori.

- Pilota.java: Rappresenta un pilota con nome, macchina, posizione e punteggio di gara.

- Vigenere.java: Implementa una classe per la cifratura della matrice usando l'algoritmo di Vigenere.

## Come Eseguire il Programma

1. Clonare il repository.
2. Eseguire il file `Granprix_N2_5AINF.java` per avviare la simulazione della gara.

## Personalizzazione della Gara

Durante l'esecuzione del programma, l'utente può personalizzare diversi aspetti della gara, come la lunghezza del circuito, il numero di giri, il numero di pitstop e il numero di piloti.

## Contributi e Sviluppi Futuri

Il progetto può essere esteso includendo nuove funzionalità, migliorando l'interfaccia utente o implementando nuovi algoritmi di simulazione.


## Autori

Bagaglia tommaso, Mantineo Kevin & Meddiki Yassine

## librerie usate

- import java.util.Scanner;: Viene utilizzata per leggere l'input dell'utente da tastiera. Ad esempio, è utilizzata per ottenere la lunghezza del circuito, il numero di giri, il numero di pitstop, il numero di piloti e altre informazioni necessarie per il programma.

- import java.util.Random;: Viene utilizzata per generare numeri casuali. Questo è particolarmente evidente nel ciclo che randomizza le posizioni dei piloti per ogni giro di gara.

- import java.util.Arrays;: Viene utilizzata per ordinare l'array di piloti in base alle loro posizioni. Il metodo determinaVincitore fa uso di Arrays.sort per ordinare gli oggetti Pilota in base alle loro posizioni.






package com.mycompany.granprix_n2_5ainf;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Granprix_N2_5AINF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Giudice giudice = new Giudice();
  
        //Input per inserire i dati del circuito
        System.out.println("Inserisci la lunghezza del circuito:");
        int lunghezzaCircuito = scanner.nextInt();
        System.out.println("Inserisci il numero di giri:");
        int numeroGiri = scanner.nextInt();
        System.out.println("Inserisci il numero di pitstop:");
        int numeroPitstop = scanner.nextInt();
        Circuito circuito = new Circuito(lunghezzaCircuito, numeroGiri, numeroPitstop);

        //Input per i piloti in gara
        System.out.println("Inserisci il numero di piloti:");
        int numeroPiloti = scanner.nextInt();
        Pilota[] piloti = new Pilota[numeroPiloti];
        for (int i = 0; i < numeroPiloti; i++) {
            System.out.println("Inserisci il nome del pilota " + (i + 1) + ":");
            String nome = scanner.next();
            System.out.println("Inserisci la macchina del pilota " + (i + 1) + ":");
            String macchina = scanner.next();
            piloti[i] = new Pilota(nome, macchina);
        }

        giudice.annunciaInizioGara();

        for (int giro = 1; giro <= circuito.getnGiri(); giro++) {
            System.out.println("Giro " + giro + " di " + circuito.getnGiri());

            //Aggiornamento del punteggio per ogni pilota in modo randomico per ogni giro
            int[] posizioni = new int[numeroPiloti];
            for (int i = 0; i < numeroPiloti; i++) {
                posizioni[i] = i + 1; //Assegnazione della posizione
            }
            //Randomizzazione delle posizioni
            for (int i = 0; i < posizioni.length; i++) {
                int randomIndex = random.nextInt(posizioni.length);
                int temp = posizioni[i];
                posizioni[i] = posizioni[randomIndex];
                posizioni[randomIndex] = temp;
            }

            //Assegnamento delle posizioni in modo casuale
            for (int i = 0; i < piloti.length; i++) {
                piloti[i].setPosizione(posizioni[i]);
            }

            giudice.mostraAndamentoGara(piloti); //Output della classifica

            try {
                Thread.sleep(1000); //Attesa di 1 secondo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        giudice.annunciaFineGara();
        Pilota vincitore = determinaVincitore(piloti);
        giudice.annunciaVincitore(vincitore);

        scanner.close();
    }

    public static Pilota determinaVincitore(Pilota[] piloti) {
        //Ordinamento dell'array di piloti
        Arrays.sort(piloti, (p1, p2) -> Integer.compare(p1.getPosizione(), p2.getPosizione()));

        //Il pilota con indice "0" sarà il vincitore
        return piloti[0];
    }
}

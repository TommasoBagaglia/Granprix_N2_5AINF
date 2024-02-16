package com.mycompany.granprix_n2_5ainf;
// commento al 16/02/2024
public class Giudice extends Thread {
    public void annunciaInizioGara() {
        System.out.println("La gara è iniziata!");
    }

    public void annunciaFineGara() {
        System.out.println("La gara è finita!");
    }

    public void mostraAndamentoGara(Pilota[] piloti) {
        System.out.println("Andamento della gara:");
        for (Pilota pilota : piloti) {
            System.out.println("Pilota: " + pilota.Username + ", Macchina: " + pilota.Macchina + ", Posizione: " + pilota.getPosizione());
        }
    }
}
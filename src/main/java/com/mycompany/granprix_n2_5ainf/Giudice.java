package com.mycompany.granprix_n2_5ainf;

public class Giudice {
    public void annunciaInizioGara() {
        System.out.println("La gara è iniziata!");
    }

    public void annunciaFineGara() {
        System.out.println("La gara è finita!");
    }

    //Metodo per mostrare in output la posizione dei piloti ogni secondo
    public void mostraAndamentoGara(Pilota[] piloti) {
        System.out.println("Andamento della gara:");
        for (Pilota pilota : piloti) {
            System.out.println("Pilota: " + pilota.getNome() + ", Macchina: " + pilota.getMacchina() + ", Posizione: " + pilota.getPosizione());
        }
    }

    //Metodo che annuncia il vincitore della gara prendendo il pilota che ha come index "0" nell'array di piloti
    public void annunciaVincitore(Pilota vincitore) {
        System.out.println("Il vincitore della gara è: " + vincitore.getNome() + " con la macchina " + vincitore.getMacchina() + "!");
    }
}

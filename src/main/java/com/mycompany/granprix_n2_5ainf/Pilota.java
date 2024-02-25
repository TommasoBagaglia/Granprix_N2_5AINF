package com.mycompany.granprix_n2_5ainf;

public class Pilota {
    private String nome;
    private String macchina;
    private int posizione;
    private int punteggioGara = 0; //Punteggio accumulato durante la gara

    public Pilota(String nome, String macchina) {
        this.nome = nome;
        this.macchina = macchina;
    }

    public void aggiornaPunteggio(int punteggio) {
        this.punteggioGara += punteggio;
    }

    //Metodi getter e setter
    public int getPunteggioGara() {
        return this.punteggioGara;
    }

    public void setPosizione(int posizione) {
        this.posizione = posizione;
    }

    public String getNome() {
        return nome;
    }

    public String getMacchina() {
        return macchina;
    }

    public int getPosizione() {
        return posizione;
    }
}

package com.mycompany.granprix_n2_5ainf;
// commento al 16/02/2024
public class Granprix_N2_5AINF {
    public static void main(String[] args) {
        Thread giudice = new Giudice();
        Thread[] piloti = new Pilota[1];

        // Inserisci qui il codice per creare i piloti e le loro macchine
        
        giudice.annunciaInizioGara();

        // Inserisci qui il codice per far correre i piloti lungo il circuito

        giudice.annunciaFineGara();
        giudice.mostraAndamentoGara(piloti);
    }
 
    
  }

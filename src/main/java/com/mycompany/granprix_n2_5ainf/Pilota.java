package com.mycompany.granprix_n2_5ainf;

import java.util.Scanner;

public class Pilota extends Thread {
    String Password;
    String Username;
    String Macchina;

    Circuito c1;
    
    Scanner in = new Scanner(System.in); //istanzia un oggetto lettore di tipo Scanner

    public Pilota(String Username, String Password, String Macchina, Circuito c1) {
        this.Username = Username;
        this.Password = Password;
        this.Macchina = Macchina;
        this.c1 = c1;
    }
    /* 
    //Metodo Accedi
    public void Accedi(){
        System.out.println("Inserisci il tuo nome utente: ");
        Username = in.nextLine();
        System.out.println("Inserisci la tua password: ");
        Password = in.nextLine();
    }
    */

    //Metodo impostaLunghezza
    public void impostaLunghezza(int Lunghezza) {
        System.out.println("Inserisci la lunghezza del circuito: ");
        c1.Lunghezza = in.nextInt();
        if (c1.Lunghezza > 0) {
            System.out.println("Lunghezza del circuito impostata a " + c1.Lunghezza + " chilometri.");
        } else {
            System.out.println("La lunghezza deve essere > 0!");
        }
    }

    //Metodo impostaGiri
    public void impostaGiri(int nGiri) {
        System.out.println("Inserisci il numero di giri da percorrere: ");
        c1.nGiri = in.nextInt();
        if (c1.nGiri > 0) {
            System.out.println("Numero di giri impostato a " + c1.nGiri + ".");
        } else {
            System.out.println("Il numero di giri deve essere > 0!");
        }
    }


    //Metodo scegliMacchina (scelta e modifiche di prestazioni)
    public void scegliMacchina(String Macchina){
        System.out.println("Scegli la macchina (tra BMW, Mercedes e Audi): ");
        Macchina = in.nextLine();
    }

    //Metodo fermaMacchina (invoca anche la safety car)

}

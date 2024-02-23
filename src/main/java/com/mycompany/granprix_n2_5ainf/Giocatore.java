package com.mycompany.granprix_n2_5ainf;
import java.util.Scanner;
import java.io.*;
// commento al 23/02/2024 
public class Giocatore extends Thread {
  String Password;
  String Username;
  int nPitStop;
  boolean safetyCar = false; //(false = ferma, true = invocata)
  Circuito c1;
  
  Scanner in = new Scanner(System.in); //istanzia un oggetto lettore di tipo Scanner

  public Giocatore(String Username, String Password, int nPitStop, Circuito c1, boolean safetyCar) {
    this.Username = Username;
    this.Password = Password;
    this.nPitStop = nPitStop;
    this.safetyCar = safetyCar;
    this.c1 = c1;
  }
  //Metodo impostare la lunghezza del circuito
  public void impostaLunghezza(int Lunghezza) {
    System.out.println("Inserisci la lunghezza del circuito: ");
    c1.Lunghezza = in.nextInt();
    if (c1.Lunghezza > 0) {
      System.out.println("Lunghezza del circuito impostata a " + c1.Lunghezza + " chilometri.");
    } else {
      System.out.println("La lunghezza deve essere > 0!");
    }
  }

  //Metodo per impostare il numero di giri
  public void impostaGiri(int nGiri) {
    System.out.println("Inserisci il numero di giri da percorrere: ");
    c1.nGiri = in.nextInt();
    if (c1.nGiri > 0) {
      System.out.println("Numero di giri impostato a " + c1.nGiri + ".");
    } else {
      System.out.println("Il numero di giri deve essere > 0!");
    }
  }

  //Metodo per impostare il numero di possibili Pit Stop
  public void impostaPitStop(int nPitStop) {
    System.out.println("Inserisci il numero di giri da percorrere: ");
    nPitStop = in.nextInt();
    if (nPitStop > 0) {
      System.out.println("Numero di giri impostato a " + nPitStop + ".");
    } else {
      System.out.println("Il numero di giri deve essere > 0!");
    }
  }

  //Metodo scegliMacchina (scelta e modifiche di prestazioni)
  public void scegliMacchina(String Macchina){
    System.out.println("Scegli la macchina (tra BMW, Mercedes e Audi): ");
    Macchina = in.nextLine();
  }

  //Metodo fermaMacchina che servirà in caso di incidente invocando anche la safety car
  public void fermaMacchina(){
  try{
    wait();
    safetyCar = true;
    } catch(InterruptedException e){
       System.out.println("la saefty car non è partita");
    }
  }

  //Metodo avviaMacchina
  public void avviaMacchina(){
    safetyCar = false;
    try {
    notifyAll();
    } catch(InterruptedException e){
       System.out.println("la saefty car non è partita");
    }
   }
  }
 

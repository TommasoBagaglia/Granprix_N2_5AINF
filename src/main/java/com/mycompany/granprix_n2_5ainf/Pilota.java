package com.mycompany.granprix_n2_5ainf;

import java.util.Scanner;

public class Pilota extends Thread {
  String Nome;
  String Macchina;
  

  Scanner in = new Scanner(System.in); //istanzia un oggetto lettore di tipo Scanner

  public Pilota(String Nome, String Macchina) {
      this.Nome = Nome;
      this.Macchina = Macchina;
  }
 
 
  }

  public void run(){
    //Metodo scegliMacchina (scelta e modifiche di prestazioni)
    public void scegliMacchina(String Macchina){
        System.out.println("Scegli la macchina (tra BMW, Mercedes e Audi): ");
        Macchina = in.nextLine();
    }

    

  }

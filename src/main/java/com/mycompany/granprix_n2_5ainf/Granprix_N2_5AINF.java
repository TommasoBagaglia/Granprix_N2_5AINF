package com.mycompany.granprix_n2_5ainf;
// commento al 23/02/2024 
import java.io.IOException;
public class Granprix_N2_5AINF {
    public static void main(String[] args) throws IOException{
        Thread giudice = new Giudice();
        Pilota P1= new Pilota("mario","redbull");
        Thread t1 = new Thread(P1);
        // giudice.annunciaInizioGara();
        t1.start();
        try{
        t1.join();
        }
        catch(InterruptedException ex){
            System.out.println("errore");
        }
       
     

       // giudice.annunciaFineGara();
       // giudice.mostraAndamentoGara(piloti);
    }
 
    
  }

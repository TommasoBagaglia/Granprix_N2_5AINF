 import java.util.Random;
public class Main {
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

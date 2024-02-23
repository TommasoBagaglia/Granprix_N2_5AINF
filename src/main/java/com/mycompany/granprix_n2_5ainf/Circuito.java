package com.mycompany.granprix_n2_5ainf;
// commento al 23/02/2024 
public class Circuito {
  int Lunghezza;
  int nGiri;
  int nPS;
  public Circuito(int Lunghezza, int nGiri, int nPS) {
    this.Lunghezza = Lunghezza;
    this.nGiri = nGiri; 
    this.nPS = nPS;
  }
  
  //Metodi getters
  public int getLunghezza() {
    return Lunghezza;
  }

  public int getnGiri() {
    return nGiri;
  }

  public int getnPS() {
    return nPS;
  }
}
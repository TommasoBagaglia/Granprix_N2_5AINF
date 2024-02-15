package com.mycompany.granprix_n2_5ainf;

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
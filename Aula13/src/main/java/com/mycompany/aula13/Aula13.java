package com.mycompany.aula13;

public class Aula13 {

  public static void main(String[] args) {
    Cachorro c = new Cachorro();
    //Lobo l = new Lobo();
    
    //c.emitirSom();
    //l.emitirSom();
    
    c.reagir("Olá");
    c.reagir("Sai cachorro");
    c.reagir(true);
    c.reagir(false);
    c.reagir(8, 15);
    c.reagir(3, 4.5f);
  }
}

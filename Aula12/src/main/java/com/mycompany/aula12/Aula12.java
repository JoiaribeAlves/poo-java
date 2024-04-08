package com.mycompany.aula12;

public class Aula12 {

  public static void main(String[] args) {
    Mamifero m = new Mamifero();
    Ave a = new Ave();
    Peixe p = new Peixe();
    Reptil r = new Reptil();
    Canguru c = new Canguru();
    Cachorro ca = new Cachorro();
    Tartaruga t = new Tartaruga();
    
    m.locomover();
    m.emitirSom();
    
    a.locomover();
    a.emitirSom();
    
    r.locomover();
    r.emitirSom();
    
    p.locomover();
    p.emitirSom();
    
    c.locomover();
    
    ca.setPeso(5.0f);
    ca.enterrarOsso();
    ca.abanarORabo();
    
    t.locomover();
  }
}

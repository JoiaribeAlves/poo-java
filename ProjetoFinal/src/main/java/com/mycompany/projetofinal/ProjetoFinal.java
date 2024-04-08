package com.mycompany.projetofinal;

public class ProjetoFinal {

  public static void main(String[] args) {
    Video v[] = new Video[3];
    v[0] = new Video("Aula 1 de POO");
    v[1] = new Video("Aula 2 de POO");
    v[2] = new Video("Aula 3 de POO");
    System.out.println(v[0].toString());

    Gafanhoto g[] = new Gafanhoto[2];
    g[0] = new Gafanhoto("Joiaribe", 25, "M", "joiaribe123");
    g[1] = new Gafanhoto("Amanda", 29, "F", "manda123");
    System.out.println(g[0].toString());
    System.out.println(g[1].toString());

    Visualizacao visu[] = new Visualizacao[2];
    visu[0] = new Visualizacao(g[0], v[2]);
    visu[0].avaliar();
    System.out.println(visu[0].toString());
    
    visu[1] = new Visualizacao(g[0], v[0]);
    visu[0].avaliar(8);
    System.out.println(visu[1].toString());
  }
}

package aula09;

public class Aula09 {

  public static void main(String[] args) {
    Pessoa[] p = new Pessoa[3];
    Livro[] l = new Livro[3];
    
    p[0] = new Pessoa("Joiaribe", "M", 23);
    p[1] = new Pessoa("Amanda", "F", 27);
    p[2] = new Pessoa("Dieni", "F", 29);
    
    l[0] = new Livro("Introducao a linguagem Java", "Mario de Andrade", 150, p[0]);
    l[1] = new Livro("POO para iniciantes", "Mario de Andrade", 220, p[1]);
    l[2] = new Livro("Java Avancado", "Mario de Andrade", 350, p[0]);
    
    l[0].abrir();
    l[0].folhear(149);
    l[0].avancarPag();
    System.out.println(l[0].detalhes());
  }
}

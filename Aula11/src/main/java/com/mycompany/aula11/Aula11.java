package com.mycompany.aula11;

public class Aula11 {

  public static void main(String[] args) {
    // Pessoa p1 = new Pessoa();

    Visitante v1 = new Visitante();
    Aluno a1 = new Aluno();
    Bolsista b1 = new Bolsista();
    
    v1.setNome("Joiaribe");
    v1.setIdade(25);
    v1.setSexo("M");
    
    a1.setNome("Fernando");
    a1.setIdade(18);
    a1.setSexo("M");
    a1.setCurso("Contabilidade");
    a1.setMatricula(123);
    a1.pagarMensalidade();
    
    b1.setNome("Luiza");
    b1.setIdade(23);
    b1.setSexo("F");
    b1.setCurso("Matematica");
    b1.setMatricula(4444);
    b1.setBolsa(15);
    b1.pagarMensalidade();
    b1.renovarBolsa();

    System.out.println(v1.toString());
  }
}

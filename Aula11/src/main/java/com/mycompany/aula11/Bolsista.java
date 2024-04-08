package com.mycompany.aula11;

public class Bolsista extends Aluno {

  private int bolsa;

  public void renovarBolsa() {
    System.out.println("Bolsa renovada com sucesso!");
  }

  @Override
  public void pagarMensalidade() {
    System.out.println("Mensalidade de alubo bolsista paga com sucesso!");
  }

  public int getBolsa() {
    return bolsa;
  }

  public void setBolsa(int bolsa) {
    this.bolsa = bolsa;
  }

}

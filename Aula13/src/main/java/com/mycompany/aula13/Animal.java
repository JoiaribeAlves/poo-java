package com.mycompany.aula13;

public abstract class Animal {

  protected int membros;
  protected float peso;
  protected int idade;

  public abstract void emitirSom();

  public int getMembros() {
    return membros;
  }

  public void setMembros(int membros) {
    this.membros = membros;
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

}

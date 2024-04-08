package aula04;

public class Caneta {

  private String modelo;
  private String cor;
  private float ponta;
  private boolean tampada;

  public Caneta(String modelo, String cor, float ponta) {
    this.modelo = modelo;
    this.cor = cor;
    this.ponta = ponta;
    this.tampada = true;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public float getPonta() {
    return this.ponta;
  }

  public void setPonta(float ponta) {
    this.ponta = ponta;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public boolean isTampada() {
    return this.tampada;
  }

  public void setTampada(boolean tampada) {
    this.tampada = tampada;
  }

  public void status() {
    System.out.println("SOBRE A CANETA:");
    System.out.println("Modelo: " + this.getModelo());
    System.out.println("Cor: " + this.getCor());
    System.out.println("Ponta: " + this.getPonta());
    System.out.println("Tampada: " + this.isTampada());
  }
}

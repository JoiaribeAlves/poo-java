package aula03;

public class Caneta {

  public String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  private boolean tampada;

  public void status() {
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Cor: " + this.cor);
    System.out.println("Ponta: " + this.ponta);
    System.out.println("Carga: " + this.carga);
    System.out.println("Tampada? " + this.tampada);
  }

  public void rabiscar() {
    if (this.tampada) {
      System.out.println("ERRO!!! Destampe a caneta antes de rabiscar.");
    } else {
      System.out.println("Estou rabiscando...");
    }
  }

  protected void tampar() {
    this.tampada = true;
  }

  protected void destampar() {
    this.tampada = false;
  }
}

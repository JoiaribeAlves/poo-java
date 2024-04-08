package aula02;

public class Aula02 {

  public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.modelo = "BIC";
    c1.cor = "Azul";
    c1.ponta = 0.5f;
    c1.carga = 75;
    c1.tampar();
    c1.status();
    c1.rabiscar();

    Caneta c2 = new Caneta();
    c2.modelo = "BIC 2";
    c2.cor = "Vermelho";
    c2.ponta = 1.0f;
    c2.carga = 43;
    c2.destampar();
    c2.status();
    c2.rabiscar();
  }
}

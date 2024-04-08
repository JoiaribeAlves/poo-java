package aula05;

public class ContaBanco {
  // Atributos
  public int numConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private boolean status;
  
  // Construtor
  public void ContaBanco() {
    this.setSaldo(0.00f);
    this.setStatus(false);
  }
  
  // Metodos
  public void estadoAtual() {
    System.out.println("=================================");
    System.out.println("Conta: " + this.getNumConta());
    System.out.println("Tipo: " + this.getTipo());
    System.out.println("Dono: " + this.getDono());
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("Status: " + this.getStatus());
  }
  
  public void abrirConta(String tipo) {
    this.setStatus(true);
    this.setTipo(tipo);
    
    if ("CC".equals(this.getTipo())) {
      this.setSaldo(50.00f);
    } else if ("CP".equals(this.getTipo())) {
      this.setSaldo(150.00f);
    }
    
    System.out.println("Conta aberta com sucesso!");
  }
  
  public void fecharConta() {
    if (this.getSaldo() > 0) {
      System.out.println("Conta nao pode ser fechada pois ainda tem saldo.");
    } else if (this.getSaldo() < 0) {
      System.out.println("Conta nao pode ser fechada pois possui debito.");
    } else {
      this.setStatus(false);
      System.out.println("Conta fechada com sucesso!");
    }
  }
  
  public void depositar(float valor) {
    if (this.getStatus()) {
      this.setSaldo(this.getSaldo() + valor);
      System.out.println("Deposito realizado com sucesso!");
    } else {
      System.out.println("Impossivel depositar em uma conta fechada!");
    }
  }
  
  public void sacar(float valor) {
    if (this.getStatus()) {
      if (this.getSaldo() >= valor) {
        this.setSaldo(this.getSaldo() - valor);
        System.out.println("Saque realizado com sucesso!");
      } else {
        System.out.print("Nao foi possivel realizar o saque. ");
        System.out.println("Saldo insuficiente.");
        System.out.println("Seu saldo atual e de: " + this.getSaldo());
      }
    } else {
      System.out.println("Impossivel sacar de uma conta fechada!");
    }
  }
  
  public void pagarMensal() {
    int valor = 0;
    
    if ("CC".equals(this.getTipo())) {
      valor = 12;
    } else if ("CP".equals(this.getTipo())) {
      valor = 20;
    }
    
    if (this.getStatus()) {
      this.setSaldo(this.getSaldo() - valor);
      System.out.println("Mensalidade paga com sucesso!");
    } else {
      System.out.println("Impossivel pagar mensalidade de uma conta fechada!");
    }
  }
  
  // Getters e Setters
  public void setNumConta(int numero) {
    this.numConta = numero;
  }
  
  public int getNumConta() {
    return this.numConta;
  }
  
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  
  public String getTipo() {
    return this.tipo;
  }
  
  public void setDono(String dono) {
    this.dono = dono;
  }
  
  public String getDono() {
    return this.dono;
  }
  
  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }
  
  public float getSaldo() {
    return this.saldo;
  }
  
  public void setStatus(boolean status) {
    this.status = status;
  }
  
  public boolean getStatus() {
    return this.status;
  }
}

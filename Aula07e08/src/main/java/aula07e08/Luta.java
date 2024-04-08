package aula07e08;

import java.util.Random;

public class Luta {

  // Atributos
  private Lutador desafiado;
  private Lutador desafiante;
  private int rounds;
  private boolean aprovada;

  // Metodos Publicos
  public void marcarLuta(Lutador lutador1, Lutador lutador2) {
    if (lutador1.getCategoria().equals(lutador2.getCategoria()) 
            && lutador1 != lutador2) {
      this.setAprovada(true);
      this.setDesafiado(lutador1);
      this.setDesafiante(lutador2);
    } else {
      this.setAprovada(false);
      this.setDesafiado(null);
      this.setDesafiante(null);
    }
  }

  public void lutar() {
    if (this.isAprovada()) {
      System.out.println("### DESAFIADO ###");
      this.getDesafiado().apresentar();
      
      System.out.println("### DESAFIANTE ###");
      this.getDesafiante().apresentar();
      
      Random aleatorio = new Random();
      int vencedor = aleatorio.nextInt(3); // 0 1 2
      System.out.println("===== RESULTADO DA LUTA =====");
      switch (vencedor) {
        case 0 -> {
          // Empate
          System.out.println("Empatou!");
          this.getDesafiado().empatarLuta();
          this.getDesafiante().empatarLuta();
        }
        case 1 -> {
          // Desafiado vence
          System.out.println(this.getDesafiado().getNome() + " Venceu a luta");
          this.getDesafiado().ganharLuta();
          this.getDesafiante().perderLuta();
        }
        case 2 -> {
          // Desafiante vence
          System.out.println(this.getDesafiante().getNome() + " Venceu a luta");
          this.getDesafiante().ganharLuta();
          this.getDesafiado().perderLuta();
        }
      }
    } else {
      System.out.println("A luta nao pode acontecer!");
    }
  }
  
  // Metodos Especiais

  public Lutador getDesafiado() {
    return desafiado;
  }

  public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
  }

  public Lutador getDesafiante() {
    return desafiante;
  }

  public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
  }

  public int getRounds() {
    return rounds;
  }

  public void setRounds(int rounds) {
    this.rounds = rounds;
  }

  public boolean isAprovada() {
    return aprovada;
  }

  public void setAprovada(boolean aprovada) {
    this.aprovada = aprovada;
  }
  
}

package aula06;

public class ControleRemoto implements Controlador {

  // Atributos
  private int volume;
  private boolean ligado;
  private boolean tocando;

  // Metodos Especiais
  public ControleRemoto() {
    this.setLigado(true);
    this.setVolume(95);
    this.setTocando(false);
  }

  private int getVolume() {
    return this.volume;
  }

  private void setVolume(int volume) {
    this.volume = volume;
  }

  private boolean getLigado() {
    return this.ligado;
  }

  private void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  private boolean getTocando() {
    return this.tocando;
  }

  private void setTocando(boolean tocando) {
    this.tocando = tocando;
  }

  // Metodos Abstratos
  @Override
  public void ligar() {
    this.setLigado(true);
  }

  @Override
  public void desligar() {
    this.setLigado(false);
  }

  @Override
  public void abrirMenu() {
    if (this.getLigado()) {
      System.out.println("Esta ligado? " + this.getLigado());
      System.out.println("Esta tocando? " + this.getTocando());
      System.out.print("Volume: " + this.getVolume() + " ");

      for (int i = 0; i <= this.getVolume(); i += 10) {
        System.out.print("|");
      }

      System.out.println("");
    } else {
      System.out.println("Impossivel abrir o menu.");
    }
  }

  @Override
  public void fecharMenu() {
    if (this.getLigado()) {
      System.out.println("Fechando menu...");
    } else {
      System.out.println("Impossivel fechar menu.");
    }
  }

  @Override
  public void maisVolume() {
    if (this.getLigado() && this.getVolume() <= 95) {
      this.setVolume(this.getVolume() + 5);
    } else {
      System.out.println("Impossivel aumentar volume.");
    }
  }

  @Override
  public void menosVolume() {
    if (this.getLigado() && this.getVolume() >= 5) {
      this.setVolume(this.getVolume() - 5);
    } else {
      System.out.println("Impossivel diminuir volume.");
    }
  }

  @Override
  public void ligarMudo() {
    if (this.getLigado() && this.getVolume() > 0) {
      this.setVolume(0);
    }
  }

  @Override
  public void desligarMudo() {
    if (this.getLigado() && this.getVolume() == 0) {
      this.setVolume(25);
    }
  }

  @Override
  public void play() {
    if (this.getLigado() && !(this.getTocando())) {
      this.setTocando(true);
    } else {
      System.out.println("Nao consegui reproduzir.");
    }
  }

  @Override
  public void pause() {
    if (this.getLigado() && this.getTocando()) {
      this.setTocando(false);
    } else {
      System.out.println("Nao consegui pausar.");
    }
  }
}

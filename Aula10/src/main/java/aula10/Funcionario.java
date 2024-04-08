package aula10;

public class Funcionario extends Pessoa {

  // Atributos
  private String setor;
  private boolean trabalhando;

  // Metodos especiais
  public void mudarTrabalho() {
    this.trabalhando = !this.trabalhando;
  }

  public String getSetor() {
    return this.setor;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }

  public boolean isTrabalhando() {
    return this.trabalhando;
  }

  public void setTrabalhando(boolean trabalhando) {
    this.trabalhando = trabalhando;
  }
}

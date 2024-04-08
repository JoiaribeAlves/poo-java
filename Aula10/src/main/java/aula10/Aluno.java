package aula10;

public class Aluno extends Pessoa {

  // Atributos
  private int matricula;
  private String curso;

  // Metodos especiais
  public void cancelarMatricula() {
    System.out.println("Matricula cancelada.");
  }

  public int getMatricula() {
    return this.matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getCurso() {
    return this.curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }
}

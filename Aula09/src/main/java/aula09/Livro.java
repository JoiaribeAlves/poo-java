package aula09;

public class Livro implements Publicacao {

  // Atributos
  private String titulo;
  private String autor;
  private int totPag;
  private int pagAtual;
  private boolean aberto;
  private Pessoa leitor;

  // Construtor
  public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
    this.titulo = titulo;
    this.autor = autor;
    this.totPag = totPag;
    this.pagAtual = 0;
    this.aberto = false;
    this.leitor = leitor;
  }

  // Metodos especiais
  public String detalhes() {
    return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", totPag=" + totPag + ", pagAtual=" + pagAtual + ", aberto=" + aberto + ", leitor=" + leitor.getNome() + '}';
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getTotPag() {
    return totPag;
  }

  public void setTotPag(int totPag) {
    this.totPag = totPag;
  }

  public int getPagAtual() {
    return pagAtual;
  }

  public void setPagAtual(int pagAtual) {
    this.pagAtual = pagAtual;
  }

  public boolean isAberto() {
    return aberto;
  }

  public void setAberto(boolean aberto) {
    this.aberto = aberto;
  }

  public Pessoa getLeitor() {
    return leitor;
  }

  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }

  // Metodos abstratos
  @Override
  public void abrir() {
    this.setAberto(true);
  }

  @Override
  public void fechar() {
    this.setAberto(false);
  }

  @Override
  public void folhear(int pagina) {
    if (pagina < this.getTotPag()) {
      this.setPagAtual(pagina);
    }
  }

  @Override
  public void avancarPag() {
    if (this.getPagAtual() + 1 <= this.getTotPag()) {
      this.setPagAtual(this.getPagAtual() + 1);
    }
  }

  @Override
  public void voltarPag() {
    if (this.getPagAtual() - 1 >= 1) {
      this.setPagAtual(this.getPagAtual() - 1);
    }
  }
}

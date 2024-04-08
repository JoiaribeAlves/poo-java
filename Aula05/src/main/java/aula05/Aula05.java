package aula05;

public class Aula05 {
  public static void main(String[] args) {
    ContaBanco CB1 = new ContaBanco();
    CB1.setNumConta(1111);
    CB1.setDono("Joiaribe Alves");
    CB1.abrirConta("CC");
    CB1.depositar(300f);
    CB1.estadoAtual();
    
    ContaBanco CB2 = new ContaBanco();
    CB2.setNumConta(2222);
    CB2.setDono("Amanda Novais");
    CB2.abrirConta("CP");
    CB2.depositar(500f);
    CB2.sacar(100f);
    CB2.estadoAtual();
  }
}

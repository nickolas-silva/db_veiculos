package entity;


import arvoreAVL.ArvoreAVL;

public class Servidor {
  
  public ArvoreAVL dadosV = new ArvoreAVL();
  
  public Servidor(){
    System.out.println("Servidor Inicializado!");
    
    
  }

  public void addVeiculo(String k,Veiculo v){
    dadosV.inserir(k, v);
  }

  public void exibirVeiculos(){
    dadosV.ordem();
  }

  public void removerVeiculo(String k, Veiculo v){
    dadosV.remover(k, v);
  }
}

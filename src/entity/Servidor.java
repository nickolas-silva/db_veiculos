package entity;

import arvoreAVL.Arvore;

public class Servidor {
  
  public Arvore<Veiculo> dadosV = new Arvore<>();
  
  public Servidor(){
    System.out.println("Servidor Inicializado!");
    
    
  }

  public void addVeiculo(Integer k,Veiculo v){
    dadosV.inserir(k, v);
  }

  public void exibirVeiculos(){
    dadosV.ordem();
  }
}

package entity;

import arvoreAVL.Arvore;

public class Servidor {
  
  Arvore<Veiculo> dadosV = new Arvore<>();
  
  public Servidor(){
    System.out.println("Servidor Inicializado!");
    this.dadosV = new Arvore<>();
    
  }

  public void addVeiculo(Integer k,Veiculo v){
    dadosV.inserir(k, v);
  }

  public void exibirVeiculos(){
    dadosV.ordem();
  }
}

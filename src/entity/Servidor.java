package entity;


import arvoreAVL.ArvoreAVL;
import arvoreAVL.No;

public class Servidor {
  
  public ArvoreAVL dadosV = new ArvoreAVL();
  
  public Servidor(){
    System.out.println("Servidor Inicializado!");
    
    
  }

  public void addVeiculo(Veiculo v){
    dadosV.inserir(v);
  }

  public void exibirVeiculos(){
    dadosV.ordem();
  }

  public void removerVeiculo(long renavam){
    dadosV.remover(renavam);
  }
  
  public String editar(long renavam, Veiculo v){
    Veiculo veiculo_att = new Veiculo();
    var no = buscarVeiculo(renavam);
    if(no == null){
      return "Veiculo não encontrado!";
    }
    System.out.println(no.valor.toString());
    veiculo_att.renavam = no.valor.renavam;
    veiculo_att.placa = no.valor.placa;
    veiculo_att.modelo = no.valor.modelo;
    veiculo_att.ano_fabri = no.valor.ano_fabri;
    veiculo_att.cpf_condutor = no.valor.cpf_condutor;
    veiculo_att.nome_condutor = no.valor.nome_condutor;
    removerVeiculo(no.valor.renavam);
    addVeiculo(v);

    return "Veiculo atualizado!";

    
  }

  public int contarVeiculos(){
    return dadosV.contNos();
  }

  public No buscarVeiculo(long renavam){
    return dadosV.buscar(renavam);
  }
}

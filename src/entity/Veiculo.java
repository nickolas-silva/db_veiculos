package entity;

public class Veiculo {
  String placa;
  String renavam;
  String nome_condutor;
  String cpf_condutor;
  String modelo;
  String data_fabri;

  public Veiculo(String placa, String renavam, String nome_condutor, String cpf_condutor, String modelo, String data_fabri) {
    this.placa = placa;
    this.renavam = renavam;
    this.nome_condutor = nome_condutor;
    this.cpf_condutor = cpf_condutor;
    this.modelo = modelo;
    this.data_fabri = data_fabri;
  }

  @Override
  public String toString() {
    return "Veiculo [placa=" + placa + ", renavam=" + renavam + ", nome_condutor=" + nome_condutor + ", cpf_condutor="
        + cpf_condutor + ", modelo=" + modelo + ", data_fabri=" + data_fabri + "]";
  }

  public Veiculo(){
    this.placa = "";
    this.renavam = "";
    this.nome_condutor = "";
    this.cpf_condutor = "";
    this.modelo = "";
    this.data_fabri = "";
    
  }
}

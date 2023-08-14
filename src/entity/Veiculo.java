package entity;

public class Veiculo {
  public String placa;
  public long renavam;
  public String nome_condutor;
  public String cpf_condutor;
  public String modelo;
  public Integer ano_fabri;

  public Veiculo(String placa, String modelo, Integer ano_fabri, String cpf_condutor, String nome_condutor, long renavam) {
    this.placa = placa;
    this.renavam = renavam;
    this.nome_condutor = nome_condutor;
    this.cpf_condutor = cpf_condutor;
    this.modelo = modelo;
    this.ano_fabri = ano_fabri;
  }

  @Override
  public String toString() {
    return "Veiculo [placa=" + placa + ", renavam=" + renavam + ", nome_condutor=" + nome_condutor + ", cpf_condutor="
        + cpf_condutor + ", modelo=" + modelo + ", data_fabri=" + ano_fabri + "]";
  }

  public Veiculo(){
    this.placa = "";
    this.renavam = 0;
    this.nome_condutor = "";
    this.cpf_condutor = "";
    this.modelo = "";
    this.ano_fabri = 0;
    
  }
}

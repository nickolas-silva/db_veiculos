package entity;

public class Cliente {
  private String nome;
  private String senha;
  

  public Cliente(String nome, String senha) {
    this.nome = nome;
    this.senha = senha;
  }

  public Cliente(){
    this.nome = "";
    this.senha = "";

  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  

  

  

}

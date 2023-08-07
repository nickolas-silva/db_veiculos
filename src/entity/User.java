package entity;

public class User {
  private String nome;
  private Integer idade;
  private String senha;

  public User(String nome, Integer idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public User(){
    this.nome = "";
    this.idade = 0;

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

  public Integer getIdade() {
    return idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }

  

}

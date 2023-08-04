package entity;

public class Protocolo {
  String mensagem_usuario;
  String mensagem_servidor;

  public Protocolo(String mensagem_usuario, String mensagem_servidor) {
    this.mensagem_usuario = mensagem_usuario;
    this.mensagem_servidor = mensagem_servidor;
  }

  public Protocolo(){
    this.mensagem_usuario = "";
    this.mensagem_servidor = "";
    
  }
}

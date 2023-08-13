import java.io.IOException;
import java.util.Scanner;

import entity.Cliente;
import entity.Protocolo;
import entity.Veiculo;

public class App {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException, IOException{
        //INSERIR VEÍCULOS

        Protocolo p = new Protocolo();
        p.inserirVeiculosPadrao();
        

        //LOGIN DE USUÁRIO
        System.out.println("======================================");

        System.out.println("Entre com o nome do usuário: ");
        String nome = input.nextLine();
        
        System.out.println("Entre com a senha do usuário: ");
        String senha = input.nextLine();

        Cliente user = new Cliente(nome, senha);

        new ProcessBuilder("clear").inheritIO().start().waitFor();


        //MENU DE OPÇÕES   
        int opcao = 0;
        while(opcao != 6){
            System.out.println("Usuário: " + user.getNome());
            System.out.println("MENU DO SISTEMA");
            System.out.println("======================================");
            System.out.println("1 - Inserir veículo");
            System.out.println("2 - Exibir veículos");
            System.out.println("3 - Editar Veículo");
            System.out.println("4 - Remover Veículo");
            System.out.println("5 - Buscar Veículo");
            System.out.println("6 - Sair");
            System.out.println("======================================");
            System.out.println("Entre com a opção desejada: ");
            opcao = input.nextInt();
            input.nextLine();
            switch(opcao){
                case 1:
                    System.out.println("Entre com a placa do veículo: ");
                    String placa = input.nextLine();
                    System.out.println("Entre com o renavam do veículo: ");
                    Long renavam = input.nextLong();
                    System.out.println("Entre com o nome do condutor do veículo: ");
                    String nome_condutor = input.nextLine();
                    System.out.println("Entre com o cpf do condutor do veículo: ");
                    String cpf_condutor = input.nextLine();
                    System.out.println("Entre com o modelo do veículo: ");
                    String modelo = input.nextLine();
                    System.out.println("Entre com a data de fabricação do veículo: ");
                    Integer ano_fabri = input.nextInt();
                    Veiculo veiculo = new Veiculo(placa, modelo, ano_fabri, cpf_condutor, nome_condutor, renavam.toString());
                    p.inserirVeiculo(renavam, veiculo);
                    break;
                case 2:
                    p.listar();
                    break;
                case 3:
                    p.editarVeiculo();
                    break;
                case 4:
                    p.deletarVeiculo();
                    break;
                case 5:
                    p.buscarVeiculo();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }




    }
}

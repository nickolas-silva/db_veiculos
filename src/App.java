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
        while(opcao != 7){
            System.out.println("Usuário: " + user.getNome());
            System.out.println("MENU DO SISTEMA");
            System.out.println("======================================");
            System.out.println("1 - Inserir veículo");
            System.out.println("2 - Exibir veículos");
            System.out.println("3 - Editar Veículo");
            System.out.println("4 - Remover Veículo");
            System.out.println("5 - Buscar Veículo");
            System.out.println("6 - Quantidade de Veículos");
            System.out.println("7 - Sair");
            System.out.println("======================================");
            System.out.println("Entre com a opção desejada: ");
            opcao = input.nextInt();
            input.nextLine();
            switch(opcao){
                case 1:
                    System.out.println("Entre com a placa do veículo: ");
                    String placa = input.nextLine();

                    
                    System.out.println("Entre com o nome do condutor do veículo: ");
                    String nome_condutor = input.nextLine();
                    
                    System.out.println("Entre com o cpf do condutor do veículo: ");
                    String cpf_condutor = input.nextLine();
                    
                    System.out.println("Entre com o modelo do veículo: ");
                    String modelo = input.nextLine();
                    
                    System.out.println("Entre com a data de fabricação do veículo: ");
                    Integer ano_fabri = input.nextInt();
                    
                    System.out.println("Entre com o renavam do veículo: ");
                    long renavam = input.nextLong();

                    Veiculo veiculo = new Veiculo(placa, modelo, ano_fabri, cpf_condutor, nome_condutor, renavam);
                    p.inserirVeiculo(veiculo);
                    break;
                case 2:
                    p.listar();
                    break;
                case 3:
                
                System.out.println("Entre com a placa do veículo: ");
                String placa_editar = input.nextLine();
                
                    System.out.println("Entre com o nome do condutor do veículo: ");
                    String nome_condutor_editar = input.nextLine();
                    
                    System.out.println("Entre com o cpf do condutor do veículo: ");
                    String cpf_condutor_editar = input.nextLine();
                    
                    System.out.println("Entre com o modelo do veículo: ");
                    String modelo_editar = input.nextLine();
                    
                    System.out.println("Entre com a data de fabricação do veículo: ");
                    Integer ano_fabri_editar = input.nextInt();
                    
                    System.out.println("Entre com o renavam do veiculo que deseja editar: ");
                    long renavam_editar = input.nextLong();

                    Veiculo veiculo_editar = new Veiculo(placa_editar, modelo_editar, ano_fabri_editar, cpf_condutor_editar, nome_condutor_editar, renavam_editar);
                    p.editarVeiculo(veiculo_editar.renavam, veiculo_editar);
                    break;
                case 4:
                    System.out.println("Entre com o renavam do veículo: ");
                    long renavam_remover = input.nextLong();
                    p.deletarVeiculo(renavam_remover);
                    break;
                case 5:
                    System.out.println("Entre com o renavam do veículo: ");
                    long renavam_buscar = input.nextLong();
                   
                    p.buscarVeiculo(renavam_buscar);
                    break;

                case 6:
                    p.qntNos();
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }




    }
}

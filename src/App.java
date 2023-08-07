import java.io.IOException;
import java.util.Scanner;

import entity.Servidor;
import entity.User;
import entity.Veiculo;

public class App {
    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException, IOException{
        //INSERIR VEÍCULOS
        Servidor servidor = new Servidor();
        
        Veiculo teste = new Veiculo("ABC-1234", "123456789", "João", "12345678910", "Fiat", "01/01/2000");
        // Veiculo teste2 = new Veiculo("ABC-1234", "123456789", "João", "12345678910", "Fiat", "01/01/2000");
        
        for(int i = 1; i <= 50; i++){
            servidor.addVeiculo(i, teste);
        }
        
        
        //servidor.exibirVeiculos(); EXIBE TODOS OS VEICULOS DO SERVIDOR

        //LOGIN DE USUÁRIO
        System.out.println("======================================");
        User user = new User();

        System.out.println("Entre com o nome do usuário: ");
        String nome = cin.nextLine();
        user.setNome(nome);

        System.out.println("Entre com a senha do usuário: ");
        String senha = cin.nextLine();
        user.setSenha(senha);

        new ProcessBuilder("clear").inheritIO().start().waitFor();


        //MENU DE OPÇÕES   
        int opcao = 0;
        while(opcao != 5){
            System.out.println("======================================");
            System.out.println("1 - Inserir veículo");
            System.out.println("2 - Exibir veículos");
            System.out.println("3 - Editar Veículo");
            System.out.println("4 - Remover Veículo");
            System.out.println("5 - Sair");
            System.out.println("======================================");
            System.out.println("Entre com a opção desejada: ");
            opcao = cin.nextInt();
            cin.nextLine();
            switch(opcao){
                case 1:
                    System.out.println("Entre com a placa do veículo: ");
                    String placa = cin.nextLine();
                    System.out.println("Entre com o renavam do veículo: ");
                    String renavam = cin.nextLine();
                    System.out.println("Entre com o nome do condutor do veículo: ");
                    String nome_condutor = cin.nextLine();
                    System.out.println("Entre com o cpf do condutor do veículo: ");
                    String cpf_condutor = cin.nextLine();
                    System.out.println("Entre com o modelo do veículo: ");
                    String modelo = cin.nextLine();
                    System.out.println("Entre com a data de fabricação do veículo: ");
                    String data_fabri = cin.nextLine();
                    Veiculo veiculo = new Veiculo(placa, renavam, nome_condutor, cpf_condutor, modelo, data_fabri);
                    servidor.addVeiculo(1, veiculo);
                    break;
                case 2:
                    servidor.exibirVeiculos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            //new ProcessBuilder("clear").inheritIO().start().waitFor();
        }




    }
}

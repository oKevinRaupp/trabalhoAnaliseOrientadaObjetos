package kevBank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int op;
        double valor;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindo ao KevBank");
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println("Digite seu cpf: ");
        String cpf = scanner.nextLine();
        
        Conta conta = new Conta();
        Cliente cliente = new Cliente(nome,sobrenome,cpf,conta);
        
        do{
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Olá, " + cliente.getNome() + " " + cliente.getSobreNome());
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Realizar depósito");
            System.out.println("3 - Realizar saque");
            System.out.println("0 - Encerrar");
            System.out.println("Escolha uma operação, " + cliente.getNome());
            op = scanner.nextInt();
            
            switch(op){
                case 1:
                    System.out.println(" ");
                    System.out.println("---CONSULTA DE SALDO---");
                    System.out.println(cliente.getNome() + ", Seu saldo é de: " + cliente.getConta().getSaldo());
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("---REALIZAR DEPÓSITO---");
                    System.out.println(cliente.getNome() + ", Digite o valor para depositar: ");
                    valor = scanner.nextDouble();
                    cliente.getConta().depositar(valor);
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println("---REALIZAR SAQUE---");
                    System.out.println(cliente.getNome() + ", Digite o valor para sacar: ");
                    valor = scanner.nextDouble();
                    cliente.getConta().sacar(valor);
                    break;
                default:
                    break;
            }
            
        } while(op != 0);
        scanner.close();
        
    }
    
}

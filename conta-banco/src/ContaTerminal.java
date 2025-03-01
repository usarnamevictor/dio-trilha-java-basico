import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        // Criação de um objeto Scanner para ler dados do terminal
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar as informações da conta bancária
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        
        // Solicitando os dados ao usuário
        System.out.println("Por favor, digite o número da Conta:");
        numeroConta = scanner.nextInt(); // Lê o número da conta
        
        scanner.nextLine(); // Limpa o buffer de entrada (para ler a próxima linha corretamente)
        
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine(); // Lê o número da agência
        
        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine(); // Lê o nome do cliente
        
        System.out.println("Por favor, digite o saldo da Conta:");
        saldo = scanner.nextDouble(); // Lê o saldo
        
        // Exibindo a mensagem final com as informações inseridas pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                           + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fechando o scanner
        scanner.close();
    }
}

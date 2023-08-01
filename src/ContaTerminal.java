import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaração das variáveis para armazenar as informações da conta
        int numeroConta; 
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = sc.nextLine();

        System.out.print("Digite o número da conta: ");
        numeroConta = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha pendente após a leitura do número da conta

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.print("Digite o saldo da conta: ");
        saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}

import java.util.Scanner;

public class ContaTerminal {
    int Saldo = 1000;

    public static void main(String[] args) throws Exception {
        
        // Create a new instance of ContaTerminal
        ContaTerminal conta = new ContaTerminal();

        // Set the values of the attributes
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o número da Agência ! ");
        String Agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta ! ");
        String Conta = scanner.nextLine();

        System.out.print("Por favor, digite o Nome do cliente ! ");
        String NomeCliente = scanner.nextLine();

        scanner.close();

        System.out.println("Olá, " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Conta + ", e seu saldo é de R$ " + conta.Saldo);
    }
}

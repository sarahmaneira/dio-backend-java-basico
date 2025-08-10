import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta:");
        int Numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String Agencia = scanner.next();
        
        System.out.println("Por favor, digite seu nome:");
        String NomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o saldo da conta:");
        var Saldo = scanner.nextFloat();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n",
                NomeCliente, Agencia, Numero, Saldo
        );
    }
}

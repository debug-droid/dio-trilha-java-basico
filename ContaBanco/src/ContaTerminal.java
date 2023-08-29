import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Por favor, digite o seu nome completo: ");
            String NomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o número da sua agência: ");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da sua conta: ");
            int conta = scanner.nextInt();

            System.out.println("Por favor, digite o seu saldo: ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá ".concat(NomeCliente) + ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia) + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
        } catch (Exception e) {
            System.out.println("Aconteceu algo inesperado.");
          }
    }
}

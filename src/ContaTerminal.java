import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite seu NOME: ");
    String nome = scanner.next();

    System.out.println("Por favor, digite sua AGÊNCIA: ");
    String agencia = scanner.next();

    System.out.println("Por favor, digite o NÚMERO da sua conta: ");
    int numeroConta = scanner.nextInt();

    System.out.println("Por favor, digite VALOR do depósito: ");
    double saldo = scanner.nextDouble();

    String mensagem = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo "+ saldo + " já está disponível para saque.";

    System.out.println(mensagem);
  }
}

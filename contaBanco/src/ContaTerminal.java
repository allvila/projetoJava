import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" Por favor, digite seu nome:");
        String nome = scanner.nextLine(); // Permite nome completo

        System.out.println("Por favor, digite sua agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, Digite seu saldo:");
        double saldo = scanner.nextDouble();

        // Mensagem formatada com espaços adequados
                System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco. "
                + "Sua agência é " + agencia + " conta " + numero 
                + " e seu saldo R$ " + saldo + " já está disponível para saque.");

                scanner.close();
        }
        }
import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero: ");
        numero = scanner.nextInt();

        System.out.println("Digite a agencia: ");
        agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.println( "Ola " + nomeCliente + " obrigado por criar uma conta em nosso banco sua agência é " + agencia +  " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}

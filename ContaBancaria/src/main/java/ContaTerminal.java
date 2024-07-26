import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o numero da conta: ");
        numero = sc.nextInt();
        System.out.println("Por favor, digite o valor do saque: ");
        saldo = sc.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco!. Sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque!", nomeCliente,agencia,numero,saldo);
    }
}
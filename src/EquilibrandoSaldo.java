import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = 0;
        double valorDeposito;
        double valorRetirada;
        int pergunta = 2;
        do {
            if(pergunta != 1){
                System.out.println("Informe o seu saldo atual: ");
                saldoAtual = saldoAtual+scanner.nextDouble();
            }
            System.out.println("O saldo atual é: "+saldoAtual);
            System.out.println("Informe um valor para deposito: ");
            valorDeposito = scanner.nextDouble();
            saldoAtual = saldoAtual + valorDeposito;
            System.out.println("O saldo atual é: "+saldoAtual);
            System.out.println("Informe o valor de retirada: ");
            valorRetirada = scanner.nextDouble();
            saldoAtual = saldoAtual-valorRetirada;
            System.out.println("Seu saldo atualizado é: "+saldoAtual);
            System.out.println("Deseja continuar? 1 = Sim 2 = Nao");
            pergunta = scanner.nextInt();
            if (pergunta == 1){
                System.out.println("Obrigado por usar o nosso sistema. Volte sempre");
            }
        }while (pergunta == 1);



      
    }
}
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá, Bem vindo ao nosso banco!\n------------------------------------------\nDigite seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");


        System.out.print("Digite sua agência com digito seguido de '-' Ex.: xxx-x: ");
        String agencia = scanner.next();

        System.out.print("Digite o Nº de sua conta: ");
        int numCon = scanner.nextInt();

        System.out.print("Digita valor desejado de Saque: ");
        double saldo = scanner.nextDouble();
        
        //sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
        System.out.println("------------------------------------------\n" + 
                "Sua agência é:" +agencia+ ", Conta:"+numCon+" , Seu saldo de:R$"+saldo+" Já está disponível para saque.");
            
                System.out.println("Até logo Volte Sempre!!!");
    }
}
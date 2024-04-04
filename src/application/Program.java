package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
        ***********************
        Dados iniciais do cliente:

        Nome: Jacqueline Oliveira
        Tipo conta: Corrente
        Saldo inicial: R$ 2500,00
        ***********************

        Operações

        1- Consultar saldos
        2- Receber valor
        3- Transferir valor
        4- Sair

        Digite a opção desejada:
         */

        Scanner sc = new Scanner(System.in);

        //DECLARAÇÃO DAS VARIÁVEIS
        String client = "Jacqueline Oliveira";
        String typeOfAccount = "Corrente";
        double initialBalance = 2500.00;
        double balance = initialBalance;
        double withdrawl = 0;
        int awnser = 0;


        while (awnser != 4) {
            System.out.println("Olá, " + client + "!");
            System.out.println("Bem vinda a sua Conta " + typeOfAccount);
            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("Digite a Opção desejada (apenas número de 1 - 4)");

            awnser = sc.nextInt();

            switch (awnser) {
                case 1:
                    System.out.printf("Seu saldo é de: %.2f", balance);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Deseja receber qual valor?");
                    withdrawl = sc.nextDouble();
                    sc.nextLine();
                    balance += withdrawl;
                    break;

                case 3:
                    System.out.println("Qual valor da tranferência?");
                    withdrawl = sc.nextDouble();
                    sc.nextLine();
                    while (withdrawl > balance) {
                        System.out.println("Operação inválida.");
                        System.out.println("Seu saldo é inferior ao valor da tranferência.");
                        System.out.println("Seu saldo é de: " + balance);
                        System.out.println("Qual valor da transferência?");
                        withdrawl = sc.nextDouble();
                        sc.nextLine();
                    }

                    balance -= withdrawl;
                    break;

                case 4:
                    break;
            }
            System.out.println();
        }
        sc.close();
    }
}

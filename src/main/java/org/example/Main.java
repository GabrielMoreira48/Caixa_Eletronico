package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numero_conta = {1, 2, 3, 4};
        String[] usuarios = {"Ana", "Carlos", "Maria", "Guilherme"};
        String[] senha = {"Acb", "123", "1587", "asc123"};
        double[] saldo = {578.20, 1001.16, 51684.28, 187.00};
        ArrayList<String>[] historico = new ArrayList[usuarios.length];
        for (int i = 0; i < historico.length; i++) {
            historico[i] = new ArrayList<>();
        }
        
        int escolha = 0;
        int erros = 3;

        while (erros > 0) {
            // --- LOGIN DO USUÁRIO ---
            System.out.println("Insira a conta:");
            int contaDigitada = input.nextInt();

            System.out.println("Insira a senha:");
            String senhaDigitada = input.next();

            int indiceConta = -1;

            // percorre o array de contas
            for (int i = 0; i < numero_conta.length; i++) {
                if (numero_conta[i] == contaDigitada) {
                    indiceConta = i;
                    break;
                }
            }

            // agora verifica se encontrou a conta
            if (indiceConta != -1 && senha[indiceConta].equals(senhaDigitada)) {
                System.out.println("Login bem-sucedido! Bem-vindo(a), " + usuarios[indiceConta]);

                //Abertura do menu e escolha do usurario
                do {
                    System.out.println("==== Menu ===");
                    System.out.println("1 - Saque");
                    System.out.println("2 - Extrato");
                    System.out.println("3 - Deposito");
                    System.out.println("0 - Sair");
                    System.out.println("Insira sua escolha: ");
                    escolha = input.nextInt();

                    switch (escolha) {
                        //Saque
                        case 1:
                            System.out.println("Qual valor deseja sacar R$: ");
                            double valorSaque = input.nextDouble();
                            if (valorSaque > saldo[indiceConta]) {
                                System.out.println("Saldo insuficiente!");
                            } else if (valorSaque <= 0) {
                                System.out.println("Valor inválido!");
                            } else {
                                saldo[indiceConta] -= valorSaque;
                                System.out.printf("Saque concluído! Saldo atual: %.2f\n", saldo[indiceConta]);
                                historico[indiceConta].add("Saque: -R$" + valorSaque);
                            }
                            break;
                        //Extrato
                        case 2:
                            System.out.printf("Saldo atual da conta: R$: %.2f\n", saldo[indiceConta]);
                            if (historico[indiceConta].isEmpty()) {
                                System.out.println("Nenhuma transação realizada ainda.");
                            } else {
                                System.out.println("Histórico de transações:");
                                for (String transacao : historico[indiceConta]) {
                                    System.out.println(transacao);
                                }
                            }
                            break;
                        //Deposito
                        case 3:
                            System.out.println("Qual valor deseja depositar R$: ");
                            double valorDeposito = input.nextDouble();
                            if (valorDeposito <= 0) {
                                System.out.println("Valor inválido!");
                            } else {
                                saldo[indiceConta] += valorDeposito;
                                System.out.printf("Depósito concluído! Saldo atual: %.2f\n", saldo[indiceConta]);
                                historico[indiceConta].add("Depósito: +R$" + valorDeposito);
                            }
                            break;
                        //Finaliza o sistema
                        case 0:
                            System.out.println("Deseja trocar de conta? (s/n)");
                            String troca = input.next();
                            if (!troca.equalsIgnoreCase("s")) {
                                System.out.println("Encerrando sistema...");
                                return;
                            }
                        default:
                            System.out.println("Opção invalida, tente novamente!");
                    }
                } while (escolha != 0);
                // Caso usuario erre o login 3x
            } else {
                if (erros > 1) {
                    erros--;
                    System.out.println("Conta ou senha errada, tentativas restantes: " + erros);
                } else {
                    System.out.println("Conta bloqueada, entre em contato com sua agencia.");
                    break;
                }
            }
        }
    }
}
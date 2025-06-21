/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosSwitchCase;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Bem-vindo ao seu banco ****");
        System.out.println("1- Desejo sacar");
        System.out.println("2- Desejo fazer um deposito");
        System.out.println("3- Desejo ver meu saldo");
        System.out.println("Escolha uma opcao: ");

        int opcao = scanner.nextInt();
        double saldo = 350.0;
        switch (opcao) {
            case 1:
                System.out.println("Qual sera o valor do saque?");
                double saque = scanner.nextDouble();
                if (saque <= saldo) {
                    saldo = saldo - saque;
                    System.out.println("Saque foi feito com sucesso");
                } else {
                    System.out.println("Saldo insuficiente");
                }
                break;

            case 2:
                System.out.println("Digite o valor do seu deposito: ");
                double deposito = scanner.nextDouble();
                System.out.println("Seu deposito de " + deposito + " foi realizado! Seu saldo atual eh" + (saldo + deposito));
                break;
            case 3:
                System.out.println("Seu saldo eh " + saldo);
                break;

            default:
                System.out.println("Opcao nao disponivel");
    }

    }
}


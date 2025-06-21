/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDoWhile;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class ex50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 0;
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Mostrar saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depositar: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo = saldo + deposito;
                        System.out.println("Deposito realizado");
                    } else {
                System.out.println("Valor invalido");
                    }
                break;
                case 2:
                    System.out.print("Digite o valor para sacar: ");
                double saque = scanner.nextDouble();
                if (saque > 0 && saque <= saldo) {
                        saldo = saldo - saque;
                        System.out.println("Saque realizado");
                    } else {
                        System.out.println("Saldo insuficiente ou valor invalido");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
            System.out.println();
        } while (opcao != 0);
    
}
}

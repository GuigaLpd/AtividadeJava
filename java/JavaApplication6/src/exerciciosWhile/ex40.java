/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosWhile;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class ex40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
int opcao = -1;
        double num1;
        double num2;
        double resultado;

        while (opcao != 0) {
            System.out.println("Menu Calculadora:");
            System.out.println("1- Soma");
            System.out.println("2- Subtracao");
            System.out.println("3- Multiplicacao");
            System.out.println("4- Divisao");
            System.out.println("0- Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            if (opcao == 0) {
                System.out.println("Voce saiu");
                break;
            }

            System.out.print("Digite o primeiro numero: ");
            num1 = scanner.nextDouble();

            System.out.print("Digite o segundo numero: ");
            num2 = scanner.nextDouble();

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro");
                    }
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
            System.out.println();
    }
    }
}
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
public class ex43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1- Opcao 1");
            System.out.println("2- Opcao 2");
            System.out.println("3- Opcao 3");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Voce escolheu opcao 1");
            } else if (opcao == 2) {
                System.out.println("Voce escolheu opcao 2");
            } else if (opcao == 3) {
                System.out.println("Voce escolheu opcao 3");
            } else if (opcao != 0) {
                System.out.println("Opcao invalida");
            }

            System.out.println();
        } while (opcao != 0);
        System.out.println("Voce saiu");
}
}

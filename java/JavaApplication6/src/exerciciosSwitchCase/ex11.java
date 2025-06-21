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
public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** MENU ****");
        System.out.println("1- Dizer salve");
        System.out.println("2- Saiba quanto eh 2+3");
        System.out.println("3- Sair");
        System.out.println("Escolha uma opcao: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("salve.");
                break;

            case 2:
                System.out.println("Eh 5");
                break;
            case 3:
                System.out.println("Saindo... valeu");
                break;

            default:
                System.out.println("Opcao nao disponivel");
    }

    }
}

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
public class ex39 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int login;
        int senha;

        System.out.print("Digite o login (ex: 1): ");
        login = scanner.nextInt();

        System.out.print("Digite a senha (ex: 1234): ");
        senha = scanner.nextInt();

        while (login != 1 || senha != 1234) {
            System.out.println("Login ou senha incorretos. Tente novamente.");
            System.out.print("Digite o login: ");
            login = scanner.nextInt();
            System.out.print("Digite a senha: ");
            senha = scanner.nextInt();
        }

        System.out.println("Acesso liberado.");
}
}
 
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
public class ex33 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String senha;
        System.out.print("Digite a senha: ");
        senha = scanner.nextLine();

        while (!senha.equals("1234")) {
            System.out.println("Senha incorreta, tente novamente.");
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();
        }
        System.out.println("Senha correta, pode acessar");
}
}

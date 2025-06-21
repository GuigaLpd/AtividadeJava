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
public class ex49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String loginCorreto = "admin";
        String senhaCorreta = "1234";
        String login, senha;
        int tentativas = 0;
        while (tentativas < 3) {
            System.out.print("Login: ");
            login = scanner.nextLine();

            System.out.print("Senha: ");
            senha = scanner.nextLine();
           
            
            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Acesso permitido");
           break;
            } else {
                System.out.println("Login ou senha incorretos");
                tentativas = tentativas + 1;
            }
        }
        if (tentativas == 3) {
            System.out.println("Numero maximo de tentativas atingido. Acesso negado.");
        
    }
}
}

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
public class ex47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String senhaCorreta = "1234";
        String senhaDigitada;
        int tentativas = 0;

        while (tentativas <3) {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha correta. Acesso permitido.");
            break;
            } else {
           System.out.println("Senha incorreta.");
                tentativas = tentativas + 1;
            }
        }
        if (tentativas == 3) {
            System.out.println("Numero maximo de tentativas atingido. Acesso negado.");
        }
}
}

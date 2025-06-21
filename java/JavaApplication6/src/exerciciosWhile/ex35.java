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
public class ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int idade;
        int soma = 0;
        int contador = 0;

        System.out.print("Digite a idade (-1 para parar): ");
        idade = scanner.nextInt();

        while (idade != -1) {
            soma = soma + idade;
            contador = contador + 1;
            System.out.print("Digite a idade (-1 para parar): ");
            idade = scanner.nextInt();
        }
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Media das idades: " + media);
        } else {
        System.out.println("Nenhuma idade foi digitada");
    }
}
}

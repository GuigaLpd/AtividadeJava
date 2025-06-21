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
public class ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        int num;
        int soma = 0;

        System.out.print("Digite um numero (0 para parar): ");
        num = scanner.nextInt();
        
        while (num != 0) {
            soma += num;
            System.out.print("Digite um numero (0 para parar): ");
            num = scanner.nextInt();
        }
        System.out.println("Soma dos numeros: " + soma);
}
}

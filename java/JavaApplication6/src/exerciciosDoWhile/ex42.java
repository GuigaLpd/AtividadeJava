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
public class ex42 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num;
        int contadorPositivos = 0;

        System.out.print("Digite um numero (numero negativo para parar): ");
        num = scanner.nextInt();

        while (num >= 0) {
        contadorPositivos = contadorPositivos + 1;
        System.out.print("Digite um numero (numero negativo para parar): ");
        num = scanner.nextInt();
        }
        System.out.println("Quantidade de numeros positivos digitados: " + contadorPositivos);
}
}

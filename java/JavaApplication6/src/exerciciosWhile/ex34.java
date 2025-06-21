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
public class ex34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor;
        int soma = 0;
        int contador = 0;

        System.out.print("Digite um valor (negativo para parar): ");
        valor = scanner.nextInt();
        while (valor >= 0) {
            soma = soma + valor;
            contador++;
        System.out.print("Digite um valor (negativo para parar): ");
            valor = scanner.nextInt();
        }
        
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Media dos valores positivos: " + media);
        } else {
            System.out.println("Nenhum valor positivo foi digtado");
        }
}
}

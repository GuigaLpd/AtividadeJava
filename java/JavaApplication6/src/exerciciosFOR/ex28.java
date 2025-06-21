/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosFOR;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para calcular o fatorial: ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int i = numero; i >=1; i--) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + " eh: " + fatorial);

    }
}

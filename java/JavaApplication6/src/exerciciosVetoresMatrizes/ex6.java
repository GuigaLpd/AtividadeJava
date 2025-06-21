/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosVetoresMatrizes;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        int contador = 0; 
        for (int i = 0; i < 3; i++) {
            for (int g = 0; g < 3; g++) {
                System.out.print("Digite o valor para matriz[" + i + "][" + g + "]: ");
                matriz[i][g] = scanner.nextInt();

                if (matriz[i][g] > 10) {
                contador++;
                }
            }
        }
        System.out.println("Quantidade de valores que sao maiores do que 10: " + contador);
}
}

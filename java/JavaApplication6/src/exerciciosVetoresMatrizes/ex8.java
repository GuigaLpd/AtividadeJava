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
public class ex8 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        int contador = 0;

        for (int i = 0;i < 4;i++) {
        for (int g = 0; g < 4; g++) {
                System.out.print("Digite o valor para matriz[" + i + "][" + g + "]: ");
                matriz[i][g] = scanner.nextInt();
                if (matriz[i][g] % 2 == 0) {
                    contador++;
            }
        }
        }
        System.out.println("Quantidade de numeros pares: " + contador);
}
}

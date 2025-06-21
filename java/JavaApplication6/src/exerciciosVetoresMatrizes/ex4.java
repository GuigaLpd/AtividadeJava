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
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        for (int i = 0;i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        System.out.print("Digite o valor para matriz[" + i + "][" + j + "]: ");
            matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Diagonal principal:");
        for (int i = 0; i < 3; i++){
        System.out.println(matriz[i][i]);
    }
    }
}

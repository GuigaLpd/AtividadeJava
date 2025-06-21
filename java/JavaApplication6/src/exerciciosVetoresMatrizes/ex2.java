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
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int[][] matriz = new int[2][2];
        
        for(int i = 0; i <2; i++) {
            for (int g =0; g < 2; g++) {
                System.out.print("Digite o valor para matriz[" + i + "][" + g + "]: ");
                
            matriz[i][g] = scanner.nextInt();
            }
        }
        
        System.out.println("Matriz 2x2:");
        for (int i = 0; i < 2; i++){
        for (int g = 0; g < 2; g++) {
            
        System.out.print(matriz[i][g] + " ");
            }
     }
    }
}

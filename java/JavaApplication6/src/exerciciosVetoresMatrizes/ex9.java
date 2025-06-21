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
public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[5][5];
        int maior = Integer.MIN_VALUE;
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < 5; i++) {
            for (int g = 0; g < 5; g++) {
            System.out.print("Digite o valor para matriz[" + i + "][" + g + "]: ");
            matriz[i][g] = scanner.nextInt();

            if (matriz[i][g] > maior) {
                    maior = matriz[i][g];
                    linhaMaior = i;
                    colunaMaior = g;
                }
        }
        }
        System.out.println("O maior valor: " + maior);
        System.out.println("Posicao: linha " + linhaMaior + " e coluna " + colunaMaior);
}
}

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
public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] soma = new int[5];
        System.out.println("Digite os valores do seu primeiro vetor:");
        for (int i = 0; i < 5; i++) {
        System.out.print("Posicao " + (i + 1) + ": ");
        vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do seu segundo vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Posicao " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }
        System.out.println("Vetor soma:");
        for (int i = 0; i < 5; i++) {
            System.out.println(soma[i]);
   } 
}
}

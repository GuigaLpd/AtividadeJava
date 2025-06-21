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
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        
        for (int i = 0; i < 10; i++) {
        System.out.print("Digite um numero par: ");
            int num = scanner.nextInt();

            if (num % 2 == 0){
            vetor[i] = num;
            } else{
                System.out.println("Nao eh par, tente novamente");
                i--;
            }
        }
        System.out.println("Seus numeros:");
        
        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }
}
}

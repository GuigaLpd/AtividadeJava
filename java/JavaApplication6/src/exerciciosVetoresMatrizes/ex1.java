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
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int [5];;
        
        for (int i= 0; i <5; i++){ 
            System.out.print("Digite o " + (i + 1) + "o numero: ");
            vetor[i] = scanner.nextInt();

        }    
        System.out.println("Seus numeros sao:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
    }
   }
}
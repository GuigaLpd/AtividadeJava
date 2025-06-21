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
public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] notas = new double[10];
        double soma = 0;

        for (int i = 0;i < 10;i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / 10;
        System.out.println("Media das notas: " + media);
    }
}


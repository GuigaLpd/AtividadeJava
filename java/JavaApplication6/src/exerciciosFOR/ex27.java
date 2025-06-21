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
public class ex27 {
        public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] notas1 = new double[5];
        double[] notas2 = new double[5];
        double[] media = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a primeira nota de " + nomes[i] + ": ");
            notas1[i] = scanner.nextDouble();

            System.out.print("Digite a segunda nota de " + nomes[i] + ": ");
            notas2[i] = scanner.nextDouble();

            scanner.nextLine();

            media[i] = (notas1[i] + notas2[i]) / 2;
        }

        System.out.println("Media dos alunos:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i] + " - Media: " + media[i]);
        }
        }
}

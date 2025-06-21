/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDoWhile;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class ex46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroSecreto = 69;
        int chute = 0;

        System.out.println("Adivinhe de 1 a 100");

        while (chute != numeroSecreto) {
            System.out.print("Digite seu chute: ");
            chute = scanner.nextInt();

            if (chute < numeroSecreto) {
                System.out.println("Muito baixo");
            } else if (chute > numeroSecreto) {
                System.out.println("Muito alto");
            } else {
                System.out.println("Boa, acertou");
            }
        }
}
}

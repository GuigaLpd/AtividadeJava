/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosWhile;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class ex37 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota;
        double soma = 0;
        int contador = 0;

        System.out.print("Digite uma nota (0 a 10) ou valor invalido para parar: ");
        nota = scanner.nextDouble();

        while (nota >= 0 && nota <= 10) {
        soma = soma + nota;
        contador = contador + 1;
        System.out.print("Digite uma nota (0 a 10) ou valor invalido para parar: ");
        nota = scanner.nextDouble();
        }

        if (contador > 0) {
            double media = soma / contador;
        System.out.println("Media das notas: " + media);
        } else {
        System.out.println("Nenhuma nota valida foi digitada.");
        }
} 
}

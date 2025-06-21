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
public class ex24 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String[] nomes = new String[10];


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
        nomes[i] = scanner.nextLine();
        }

        System.out.println("Os nomes digitados foram:");
        
        for (String nome:nomes) {
            System.out.println(nome);
      }
}
}   
        
        
//Use for e vetor de String
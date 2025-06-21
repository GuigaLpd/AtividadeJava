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
public class ex44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nomes = new String[100];
        int contador = 0;
        String nome;

        while (true) {
            System.out.print("Digite um nome (ou fim pra parar): ");
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            nomes[contador] = nome;
            contador = contador + 1;
        }
        System.out.println("Nomes digitados:");
        for (int i = 0; i < contador; i++) {
            System.out.println(nomes[i]);
    }
}
}
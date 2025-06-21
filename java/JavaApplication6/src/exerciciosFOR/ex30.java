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
public class ex30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // entrada de N
        System.out.print("quantos numeros da sequencia de fibonacci voce quer? ");
        int n = input.nextInt();


        int num0 = 0;
        int num1 = 1;

        System.out.println("sequencia de fibonacci com " + n + " numeros:");

        for (int i = 1; i <= n; i++) {
            System.out.print(num0 + " ");

            int prox = num0 + num1;
            num0 = num1;
            num1 = prox;
        }
    }
}
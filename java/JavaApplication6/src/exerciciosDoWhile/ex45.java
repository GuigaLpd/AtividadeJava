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
public class ex45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double total = 0;
        double valor;

        while (true) {
            System.out.print("Digite o valor da compra (0 para parar): ");
            valor = scanner.nextDouble();
            if (valor == 0) {
                break;
            }
            total= total + valor;
        }
        System.out.println("Total das compras: " + total);
    }

}

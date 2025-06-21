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
public class ex38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i;

        System.out.print("Digite o numero inicial da conategm: ");
        i = scanner.nextInt();
        while (i >= 0) {
            System.out.println(i);
            i = i - 1;
        }
        System.out.println("Contagem feita");
}
}

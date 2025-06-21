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
public class ex26 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu numero: ");
                int num = scanner.nextInt();
                
                for (int i = 1; i <=10; i++){
                System.out.println(num + "x" + i + "=" + (num * i));
                }
     }
     
}
                
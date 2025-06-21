/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosFOR;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class ex22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        int i;
        int soma = 0;
                for (i= 0; i < 5;i++){
        System.out.println("Digite seu numero " + (i + 1)+": ");
                int num = scanner.nextInt();
                soma = soma + num;
                }
                System.out.println("Sua soma vai dar: " + soma);
                }
    }  
                

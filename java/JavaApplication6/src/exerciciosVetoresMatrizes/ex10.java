/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosVetoresMatrizes;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class ex10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        boolean simetrica = true;
        for (int i = 0; i < 3; i++) {
            for (int g = 0; g < 3; g++) {
        System.out.print("Digite o valor para matriz[" + i + "][" + g + "]: ");
        matriz[i][g] = scanner.nextInt();  
        }
        }
        for (int i = 0;i < 3; i++) {            
        for (int g = 0; g < 3; g++) { 
                if (matriz[i][g] == matriz[g][i]) {
                } else {  
                simetrica = false;  
            }
        }
        }

        if (simetrica == true) {
            System.out.println("A matriz é simetrica.");
        }
        if (simetrica == false) {
            System.out.println("A matriz nao eh simetrica.");
    }
}
}

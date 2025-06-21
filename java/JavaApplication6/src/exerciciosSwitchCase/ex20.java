/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosSwitchCase;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] candidatos = {"Candidato A", "Candidato B", "Candidato C"};
        int[] votos = new int[3];
        
        boolean votando = true;
        
        while (votando) {
            System.out.println("*** Sistema de Votacao ***");
            System.out.println("1- " + candidatos[0]);
            System.out.println("2- " + candidatos[1]);
            System.out.println("3- " + candidatos[2]);
            System.out.println("4- Encerrar votacao");
            System.out.print("Digite o numero do candidato para votar: ");
            
            
            int opcao = scanner.nextInt();
            
            switch (opcao) {
            case 1:
            case 2:
              case 3:
            votos[opcao - 1]++;
            
                    System.out.println("Voto computado para " + candidatos[opcao - 1] + "!");
                    break;
                case 4:
                    votando = false;
                    break;
                default:
                    System.out.println("Opcao invalida, tente novamente");
            }
        }
        System.out.println("**** Resultado Final ****");
        for (int i = 0; i < 3; i++) {
            System.out.println(candidatos[i] + ": " + votos[i] + " votos");
        }
  }
}
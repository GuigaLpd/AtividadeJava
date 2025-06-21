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
public class ex48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        double nota;
        double soma = 0;
        int contador = 0;
        String resposta;

        do {
            System.out.print("Digite o nome do aluno: ");
            nome = scanner.nextLine();

        System.out.print("Digite a nota do aluno: ");
        nota = scanner.nextDouble();
        scanner.nextLine();

          soma = soma + nota;
        contador = contador + 1;

        System.out.print("Quer continuar? (sim ou nao): ");
        resposta = scanner.nextLine();
        } while (resposta.equalsIgnoreCase("sim"));
        double media = soma / contador;
        System.out.println("Media das notas: " + media);
    }
}
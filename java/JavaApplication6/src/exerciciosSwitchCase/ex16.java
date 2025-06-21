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
public class ex16 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = scanner.nextLine();

        switch (produto.toLowerCase()) {
            case "arroz":
            case "feijao":
            case "macarrao":
                System.out.println("Categoria: Alimentacao");
                break;
            case "camisa":
            case "calca":
            case "tenis":
                System.out.println("Categoria: Vestuario");
                break;
            case "celular":
            case "tablet":
            case "notebook":
                System.out.println("Categoria: Eletronicos");
                break;
            default:
                System.out.println("Seu produto nao eh cadastrado");
}

    }
}


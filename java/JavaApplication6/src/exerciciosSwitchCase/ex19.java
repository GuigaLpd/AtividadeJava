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
public class ex19 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] clientes = new String[10];
        int quantidade = 0;
        boolean rodando = true;
        
        while (rodando) {
            
        System.out.println("*** Menu ****");
        
        System.out.println("1- Adicionar clientes");
        System.out.println("2- Listar clientes");
        System.out.println("3- Editar cliente");
        System.out.println("4- Excluir cliente");
        System.out.println("5- Sair");
           
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    if (quantidade< clientes.length) {
                        System.out.println("Digite o nome do cliente: ");
                        String nome = scanner.nextLine();
                        clientes[quantidade]  = nome;
                        quantidade++;
                        System.out.println("Cliente adicionado.");
                    } else {
                        
                        System.out.println("Limite de clientes atingido");
                    }
                    
                    break;
                case 2:  
                    System.out.println("*** Lista de Clientes ***");
                    for (int i = 0; i < quantidade; i++) {
                        System.out.println((i + 1) + " - " + clientes[i]);
                    }
                    if (quantidade == 0) {
                        System.out.println("Nenhum cliente cadastrado");
                    }   
                    break;
                    
                case 3:
                    System.out.println("Digite o numero do cliente que deseja editar: ");
                    int editar = scanner.nextInt();
                    scanner.nextLine();
                    if (editar >= 1 && editar <= quantidade) {
                    System.out.println("Digite o novo nome: ");
                        String  novoNome = scanner.nextLine();
                        clientes[editar - 1] = novoNome;
                        System.out.println("Cliente editado");
                    } else {
                        
                        System.out.println("Cliente nao encontrado");
                    }
                    break;
                    
                case 4:     
                    
                    System.out.println("Digite o numero do cliente que deseja excluir: ");
                    int excluir = scanner.nextInt();
                    scanner.nextLine();
                    if (excluir>= 1 && excluir <= quantidade) {
                    for (int i =  excluir - 1; i < quantidade - 1; i++) {
                    clientes[i] = clientes[i + 1];
                        }
                        
                        clientes[quantidade - 1]= null;
                        quantidade--;
                        System.out.println("Cliente excluido");
                    } else {
                    System.out.println("Cliente nao encontrado");
                }
                break;
                case 5:
                    rodando = false;
                    System.out.println("Saindo... valeu!");
                    break;
                default:
                    System.out.println("Opcao invalida");
        }
        }
}
}
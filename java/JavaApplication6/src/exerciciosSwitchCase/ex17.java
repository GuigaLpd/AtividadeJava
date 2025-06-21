/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosSwitchCase;
import javax.swing.JOptionPane;

public class ex17 {
    public static void main(String[] args){

        String resposta1 = JOptionPane.showInputDialog("Digite o primeiro numero:");
        double numero1 = Double.parseDouble(resposta1);
        

        String resposta2 = JOptionPane.showInputDialog("Digite o segundo numero:");
        double numero2 = Double.parseDouble(resposta2);
        

        String operacao = JOptionPane.showInputDialog("Digite a operacao desejada (+, -, *, /):");
        
        double resultado = 0;
        boolean operacaoValida = true;
        
        switch(operacao) {
         case "+":
                resultado = numero1 + numero2;
                break;
         case "-":
                resultado = numero1 - numero2;
                break;
         case "*":
                resultado = numero1 * numero2;
                break;
         case "/":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    operacaoValida = false;
                    JOptionPane.showMessageDialog(null, "Erro: divisao por zero");
}
    break;
        default:
            operacaoValida = false;
                JOptionPane.showMessageDialog(null, "Operacao invalida, use +, -, * ou /.");
        }
        
        if (operacaoValida) {
            JOptionPane.showMessageDialog(null, "O resultado da operação eh: " + resultado);
}
}
}

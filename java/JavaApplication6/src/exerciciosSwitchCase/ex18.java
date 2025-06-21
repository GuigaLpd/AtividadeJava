/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosSwitchCase;
import javax.swing.JOptionPane;

public class ex18 {
    public static void main(String[] args){

            String menu = "**** Conversor de Medidas ****     "
            + "1 - Km para m   "
            + "2 - m para cm   "
            + "3 - cm para mm   "
            + "4 - m para km   "
            + "5 - cm para m   "
            + "6 - mm para cm                  "
            + "Escolha uma opcao:";

        String respostaOpcao = JOptionPane.showInputDialog(menu);
        int opcao = Integer.parseInt(respostaOpcao);

        String respostaValor = JOptionPane.showInputDialog("Digite o valor que deseja converter:");
        double valor = Double.parseDouble(respostaValor);

        double resultado;

        switch (opcao) {
            case 1:
                resultado=valor * 1000;
                JOptionPane.showMessageDialog(null, valor + " km = " + resultado + " metros");
                break;
            case 2:
                resultado= valor * 100;
                JOptionPane.showMessageDialog(null, valor + " metros = " + resultado + " centimetros");
                break;
            case 3:
                resultado= valor * 10;
                JOptionPane.showMessageDialog(null, valor + " centimetros = " + resultado + " milimetros");
                break;
            case 4:
                resultado=valor / 1000;
                JOptionPane.showMessageDialog(null, valor + " metros = " + resultado + " km");
                break;
            case 5:
                resultado= valor / 100;
                JOptionPane.showMessageDialog(null, valor + " centimetros = " + resultado + " metros");
                break;
            case 6:
                resultado= valor / 10;
                JOptionPane.showMessageDialog(null, valor + " milimetros = " + resultado + " centimetros");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcao invalida");
    }
    }
}
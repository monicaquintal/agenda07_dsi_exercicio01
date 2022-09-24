package atividade1_fichario_dsi_agenda07;

import javax.swing.JOptionPane;

public class Atividade1_fichario_dsi_agenda07 {

    public static void main(String[] args) {
        // declaração de variáveis
        double valorOriginal, valorPromocional;
        String produto, auxiliar;
        
        // mansagem inicial
        JOptionPane.showMessageDialog(null, "Bem vindo (a) ao Aniversário da Padaria do Joaquim!");
        
        //laço de repetição for
        for (int i = 0; i <= 10; i++){
            // entrada de dados na variável produto (string)
            produto = JOptionPane.showInputDialog(null, "Insira o nome do produto:");
           
            // entrada de dados na variável auxiliar
            auxiliar = JOptionPane.showInputDialog(null, "Insira o valor do produto:");
            valorOriginal = Double.parseDouble(auxiliar); // conversão de tipo String para Double
            valorPromocional = valorOriginal * 0.5; // processamento
            
            // mensagem de saída
            JOptionPane.showMessageDialog(null, "O valor promocional do produto " + produto + " será de R$ " + valorPromocional + " !");
    
        }// fim for
    } // fim método
} // fim classe

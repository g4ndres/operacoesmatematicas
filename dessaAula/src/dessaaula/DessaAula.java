/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dessaaula;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class DessaAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String escolha = "sim";
        while(escolha.equals("sim")){
        double resultado = 0;
        String primeiroNumero =
                JOptionPane.showInputDialog("Digite o primeiro numero inteiro");
        
        String segundoNumero =
                JOptionPane.showInputDialog("Digite o segundo numero inteiro");
        
        String operacao = 
                JOptionPane.showInputDialog("Digite qual operação deseja realizar: Adição, Subtração, Divisão, Multiplicação(Sem acentos ou Cedilha)");
        
        
        double numero1 = Double.parseDouble(primeiroNumero);
        double numero2 = Double.parseDouble(segundoNumero);
        
        if(operacao.equals("adicao")){
            resultado = numero1+numero2;
        }
        
        if(operacao.equals("subtracao")){
            resultado = numero1-numero2;
        }
        if(operacao.equals("multiplicacao")){
            resultado = numero1*numero2;
        }
        if(operacao.equals("divisao")){
            resultado = numero1/numero2;
        }
        
        JOptionPane.showMessageDialog(null, "a "+operacao+" é "+resultado+" dos inteiros" ,"Resultado", JOptionPane.PLAIN_MESSAGE);
       
        escolha = 
                JOptionPane.showInputDialog("Deseja continuar? sim/nao");
        
       
       
    }
    }
    
}

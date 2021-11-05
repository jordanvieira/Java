package melao;
import java.text.DecimalFormat;//formatador
import java.util.Scanner;//para entrada de valores
/**
 *
 * @author JordanVieira
 */

public class laranja {
    
    public static void main (String[] args){
        DecimalFormat formatador = new DecimalFormat("0.00");
        //formatador.format(qtd)
        //Todo Auto-generated method stud
        Scanner input = new Scanner(System.in);//instanciando um objeto
       
        
       //variaveis
       float kg = 12.00f;
       
       
       System.out.println("Quantos kg ?");
       int qtdkg =input.nextInt();
       
       
       
       float conta = qtdkg*kg;
     
       System.out.println("O valor do prato é: "+formatador.format(conta));
       
       
       
          
    
    }
}
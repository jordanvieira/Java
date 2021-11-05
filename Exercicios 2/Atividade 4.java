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
       float broas = 1.50f;
       float pão = 0.25f;
       
       System.out.println("Quantos pães ?");
       int qtdpao =input.nextInt();
       System.out.println("Quantas broas ?");
       int qtdbroa =input.nextInt();
       
       
       float conta = (qtdbroa * broas) + (qtdpao * pão);
       float por = conta * 0.10f;
       
       System.out.println("O valor arrecadado é: "+formatador.format(conta));
       System.out.println("O valor para a poupança: "+formatador.format(por));
       
       
          
    
    }
}
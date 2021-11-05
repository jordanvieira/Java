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
   
       
       System.out.println("Digite o valor: ?");
       int valor =input.nextInt();
       
       float por = valor * 0.10f;
       float desconto = valor - por;
       float parc = desconto / 3;
      
       
       System.out.println("O valor com 10% de desconto é: "+formatador.format(desconto));
       System.out.println("O valor da parcela em 3x sem juros é: "+formatador.format(parc));
       
    }
}

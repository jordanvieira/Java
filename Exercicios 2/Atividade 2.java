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
       float tulipa = 2.80f;
       float pizza = 10.00f;
       float cobertura = 1.50f;
       
       System.out.println("Quantas pessoas ?");
       int qtdpessoas =input.nextInt();
       System.out.println("Quantos chopes ?");
       int qtdchope =input.nextInt();
       System.out.println("Quantidade de corbeturas ?");
       int qtdcorbetura=input.nextInt();
       
       float conta = (qtdchope * tulipa) + pizza + (qtdcorbetura * cobertura);
       float por = conta * 0.10f;
             conta = conta + por;
       float result = conta / qtdpessoas;
       
       System.out.println("O valor para cada é: "+formatador.format(result));
       
       
          
    
    }
}


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
       float lata = 0.350f;
       float garrafinha =0.600f;
       float garrafa = 2.0f;
       
       System.out.println("Quantas latas ?");
       int qtdlata =input.nextInt();
       System.out.println("Quantas Garrafa de 600ml ?");
       int qtdgarrafinha =input.nextInt();
       System.out.println("Quantas Garrafas de 2l ?");
       int qtdgarrafa =input.nextInt();
       
       
       
       float conta = (qtdlata*lata)+(qtdgarrafinha*garrafinha)+(qtdgarrafa*garrafa);
     
       System.out.println("A quantidade de litros que você bebeu é: "+formatador.format(conta)+" l");
       

    }
}
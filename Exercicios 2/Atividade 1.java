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
       
        
        System.out.println("Qual o nome do piloto: ");
        String nome=input.nextLine();
        System.out.println("Qual a distancia percorrida em KM: ");
        int km=input.nextInt();
        System.out.println("Quanto tempo levou para percorrer em H: ");
        int h=input.nextInt();
        
        int velocidade = km / h;
        
        System.out.println("A velocidade média do " + nome +" foi "+ velocidade +" Km/h");
       
  
    
    }
}



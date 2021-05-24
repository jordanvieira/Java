
import java.text.DecimalFormat;//formatador

public class Main
{
	public static void main(String[] args) {
	    
	DecimalFormat formatador = new DecimalFormat("000.00");//FORMATADANDO CASAS 
	    
     double V, R=3.2, A=4.9;//DECLARANDO VARIAVEIS
     
     V = 3.14159 * R * R * A;//CALCULO DE VOLUME
        
    System.out.println("O volume da lata é de " +formatador.format(V) + " m³");//PRINTANDO A SAÍDA


    }

}

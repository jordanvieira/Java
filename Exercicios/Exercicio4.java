import java.text.DecimalFormat;//formatador

public class Main
{
	public static void main(String[] args) {
	DecimalFormat formatador = new DecimalFormat("0.00");
	    
	 double hp=2.6, lp=1.6, ha=0.35, la=0.3, qtd;//declarando variáveis e valores


        qtd = (hp * lp) / (ha * la);//calculo de medida dos azuleijos 

        System.out.println("Quantidade de azulejos necessários para cobrir toda a parede é: " + formatador.format(qtd));     


    }

}


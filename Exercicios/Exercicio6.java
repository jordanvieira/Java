import java.text.DecimalFormat;//formatador

public class Main
{
	public static void main(String[] args) {
	DecimalFormat formatador = new DecimalFormat("0.00");//formatando casas
	    
	double m=21, h=2.2, t=1.4, cavalos;
       
        cavalos = (m * h / t) / 745.6999;//calculo para a quantidade de cavalos

        System.out.println("A quantidade de cavalos necessários é " + formatador.format(cavalos));//printando a saída 



    }

}

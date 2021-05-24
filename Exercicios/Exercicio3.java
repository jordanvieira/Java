import java.util.Scanner;//para entrada de valores

public class Main
{
	public static void main(String[] args) {
	    
	 int qtd, i=0;   
     double salario[];
     double media=0, resultado;//declarando variaveis e colocando valores nelaa
     salario = new double[10];
     
     Scanner ler = new Scanner(System.in);
        
     System.out.print("Digite a grade de funcionarios: ");
     qtd = ler.nextInt();//captura e armazena na varievel qtd
     //for para percorrer a quantidade
     for (i=0; i < qtd; i++) {
            
        //entrada de valores
        System.out.print("Digite o salario : ");
        salario[i] = ler.nextInt();
        media = media + salario[i];
        }


        resultado = media / qtd;
        System.out.println("A média salarial da empresa é de R$ " + resultado);
           ler.close();
    }
}

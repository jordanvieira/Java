import java.util.Scanner;//para entrada de valores

public class Main
{
	public static void main(String[] args) {
	    
	    //declarando variaveis e atribuindo valores do tipo inteiro e float
	    int qtmulheres=0, qthomens=0, sexo=0, i;
                  float somaH=0, altura=0, mediahomens=0, maior=0, menor=0;

        Scanner entrada = new Scanner(System.in);
        
        //for para percorrer a quantidade
        for (i=0; i<3; i++) {
            
            //entrada de valores
            System.out.print("Escolha o sexo da pessoa\n(1-Mulher, 2-Homem): ");
            sexo = entrada.nextInt();//captura e armazena na varievel sexo
            
            System.out.print("Digite a altura: ");
            altura = entrada.nextFloat();
            
            //if para testar se sexo for igual a 1, incrementar na var qtmulheres
            if (sexo == 1) {
                qtmulheres++;
                
            } else if (sexo == 2) //se não se, incrementar em qthomens e somar a altura dos homens
            
            {
                qthomens++;
                somaH = somaH + altura;
                
            } else {
                System.out.println("Comando invalido");
            }
            
            if (altura > maior) //se altura for maior do que a var maior, maior irar receber altura
            {
                 maior = altura;
                 
            }
            
            if(altura < menor)//menor altura 
            
            {
                menor = altura;
            }
        }
        
        mediahomens = somaH / qthomens;//calculando a media dos homens
        
        //printando a saida dos dados
        System.out.println("Maior altura do grupo é: " + maior + " m");
        System.out.println("Menor altura do grupo é: " + menor + " m");
        System.out.println("A média de altura dos homens é " + mediahomens + " m");
        System.out.println("O número de mulheres é " + qtmulheres);

        entrada.close();
    }

}

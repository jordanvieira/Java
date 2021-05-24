public class Main
{
	public static void main(String[] args) {
	    
	
	//declarando variaveis  e atribuindo valores a elas
	double C, K, F, Re, Ra;
        C = 2.43;
        F = C * 1.8 + 32;
        K = C + 273.15;
        Ra = C * 1.8 + 32 + 459.67;
        Re = C * 0.8;

    //imprimindo variaveis
        System.out.println("A temperatura em Celcius é: " + C);
        System.out.println("A temperatura em Kelvin é: " + K);
        System.out.println("A temperatura em Reaumur é: " + Ra);
        System.out.println("A temperatura em Rankine é: " + Re);
        System.out.println("A temperatura em Fahrenheit é: " + F);
    }

}

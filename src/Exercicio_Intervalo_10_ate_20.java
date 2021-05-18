import java.util.Scanner;

public class Exercicio_Intervalo_10_ate_20 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o número");
	int x = sc.nextInt();
	     
	if ( x> 10 && x<20 ) {
		System.out.println( x +  "Número dentro");
		}

	else {
		System.out.println( x + "Número Fora" );
	}
	
	
	
	sc.close();
	}

}

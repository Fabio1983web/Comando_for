import java.util.Scanner;

public class Exercicio_divisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite número de repertição:");

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite primeiro número");
			int x = sc.nextInt();
			System.out.println("Digite o segundo número");
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("Resultado %.1f%n", div);
			}
		}
		
		sc.close();
		
		
		System.out.println("Cálculo Terminado");
	}
}
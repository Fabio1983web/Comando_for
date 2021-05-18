import java.util.Locale;
import java.util.Scanner;
public class Exercicico_Media {

	public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o número repertição");

			int n = sc.nextInt();
			
			for (int i=0; i<n; i++) {
			    System.out.println("Digite o valor A");
				double a = sc.nextDouble();
				System.out.println("Digite o valor B");
				double b = sc.nextDouble();
				System.out.println("Digite o valor C");
				double c = sc.nextDouble();

				double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

				System.out.printf("%.1f%n", media);
			}
			
			sc.close();
		}
	}
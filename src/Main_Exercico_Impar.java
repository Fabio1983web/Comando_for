import java.util.Scanner;

public abstract class Main_Exercico_Impar {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o numero:");

			int x = sc.nextInt();
			
			for (int i=1; i<=x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				   
					
				}
			}
			
			sc.close();
		}
	}
import java.util.Scanner;

public class Main_Exercicio_par {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o numero:");

			int x = sc.nextInt();
			
			for (int i=1; i<=x; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				   
					
				}
			}
			
			sc.close();
		}
	}
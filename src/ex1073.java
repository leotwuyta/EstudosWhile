import java.util.Scanner;
public class ex1073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		for(int contador = 2; contador<=entrada;contador++) {
			if((contador%2)==0) 
				System.out.printf("%d^2 = %d\n", contador,(contador*contador));
		}
	}
}

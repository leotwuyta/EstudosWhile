import java.util.Scanner;
public class ex1074 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdTestes = sc.nextInt();
		for(int contador = 1;contador<=qtdTestes;contador++) {
			int teste  = sc.nextInt();
			if (teste==0)
				System.out.println("NULL");
			else{
				if((teste%2)==0) 
					System.out.print("EVEN ");
				else
					System.out.print("ODD ");
				if(teste>0)
					System.out.println("POSITIVE");
				else
					System.out.println("NEGATIVE");
			}
		}
	}
}

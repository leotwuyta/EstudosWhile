import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), impar=1;
		for (int y = x;impar<=6; y++) {
			if((y%2)==1) {
				System.out.println(y);
				impar++;
			}
		}
		
	}
}

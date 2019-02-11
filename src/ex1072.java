import java.util.Scanner;
public class ex1072 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testes = sc.nextInt(), dentroDaFaixa = 0, foraDaFaixa = 0;
		for (int contador = 1;contador<=testes;contador++){
			int entrada = sc.nextInt();
			if (entrada>=10 && entrada<=20)
				dentroDaFaixa++;
			else
				foraDaFaixa++;
		}
		System.out.printf("%d in\n%d out\n", dentroDaFaixa, foraDaFaixa);
	}
}

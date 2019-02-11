
public class Main {
	public static void main(String[] args){
		double j = 1;
		for(double i = 0; i<=2;i+=0.2) {
			if (i==0 || i==1 || i>1.999999999999999) {
				if (i<1.9999999)
					System.out.printf("I=%d J=%d\nI=%d J=%d\nI=%d J=%d\n", (int)i,(int)(j+i),(int)i,(int)(j+j+i),(int)i,(int)(j+j+j+i));
				else
					System.out.printf("I=2 J=%d\nI=2 J=%d\nI=2 J=%d\n",(int)(j+i),(int)(j+j+i),(int)(j+j+j+i));
			}
			else
				System.out.printf("I=%.1f J=%.1f\nI=%.1f J=%.1f\nI=%.1f J=%.1f\n", i,(j+i),i,(j+j+i),i,(j+j+j+i));
		}
	}
}
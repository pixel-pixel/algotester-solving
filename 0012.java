import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();

	long sum = 0;
	int sa =0;
	int sb =0;
	int sc =0;

	int []a=new int [n];
	int []b=new int [n];
	int []c=new int [n];
	
	for (int i =0; i<n; i++) {
		a[i]=scan.nextInt();
		b[i]=scan.nextInt();
		c[i]=scan.nextInt();
	}
	Arrays.sort(a);
	Arrays.sort(b);
	Arrays.sort(c);

	sa = a[(n/2)-1];
	sb = b[(n/2)-1];
	sc = c[(n/2)-1];
	
	for (int i =0; i<n; i++) {
		a[i]=Math.abs(a[i]-sa);
		b[i]=Math.abs(b[i]-sb);
		c[i]=Math.abs(c[i]-sc);
		sum = sum+a[i]+b[i]+c[i];
	}

	System.out.println(sum);
	}
}

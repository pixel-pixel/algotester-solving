import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int k;
		long t = 0;


		k = scan.nextInt();
		int []n= new int[k];

		for (int i =0; i<k; i++){
			n[i] = scan.nextInt();
			t =t+n[i]-1;

		}

		System.out.print(t);

	}
}



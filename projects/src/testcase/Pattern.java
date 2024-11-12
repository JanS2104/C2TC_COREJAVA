package testcase;
import java.util.*;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=1;i<=n;i++) {
			if (i == 1) {
				for (int j=1;j<=n;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
			else if (i == n) {
				for (int j=n;j>=1;j--) {
					System.out.print(j+" ");
				}
			}
			
			else {
				System.out.print(i+" ");
				for (int j=1;j<=n-2;j++) {
					System.out.print("  ");
				}
				System.out.print(n-i+1+" ");
				System.out.println();
			}
		}
		input.close();

	}

}

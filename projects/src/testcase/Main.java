package testcase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int m = 30;
		int N = 4;
		for (int i=n;i<=m;i++) {
			int num = i;
			int sum =0;
			while (num !=0) {
				int rem  = num %10;
				sum+=rem;
				num/=10;
			}
			if (sum == N) {
				System.out.print(i+" ");
			}
		}

	}

}

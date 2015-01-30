public class Optimizing {
	
	public static long binomial(int n, int k){
		if (k == 0) return 1;
		if (n == 0) return 0;
		return binomial(n-1,k) + binomial(n-1, k-1);
	}

	public static long fast_binomial(int N, int K){
		long[][] binomial = new long[N+1][K+1];

		for(int k = 1; k <= K; k++ ) binomial[0][k] = 0;
		for(int n = 1; n <= N; n++ ) binomial[n][0] = 1;

		//bottom-up dynamic programming
		for(int n = 1; n <= N; n++)
			for(int k = 1; k <= K; k++)
				binomial[n][k] = binomial[n-1][k-1] + binomial[n-1][k];
		return binomial[N][K];
	}
	public static <T> void print(T input){
		System.out.println(input);
	}
	public static void main(String[] args){

		long start = System.nanoTime();
		binomial(15,25);
		long end = System.nanoTime();
		print("With Recursion");
		print(end - start);
		start = System.nanoTime();
		fast_binomial(15,25);
		end = System.nanoTime();
		print("With Dynamic programming");
		print(end - start);
	}
}
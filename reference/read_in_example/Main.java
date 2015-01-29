import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int nCases = Integer.parseInt(in.readLine());

		for(int caseNum = 0; caseNum < nCases; caseNum++){
			
			int n = Integer.parseInt(in.readLine());
			n*= 567;

			System.out.println(n);
		}
	}
}
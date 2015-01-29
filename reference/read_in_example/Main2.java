//Automatic Answer with termination test case
import java.io.*;

public class Main2 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			//Parse the input number
			int n = Integer.parseInt(in.readLine());

			//Quit if the input -99999
			if(n == -99999){
				break;
			}

			n *= 567;

			System.out.println(n);
		}
	}
}
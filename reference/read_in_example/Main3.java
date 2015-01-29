//Automatic Answer reading until end of file
import java.io.*;

public class Main3{
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String line;

		while((line = in.readLine()) != null){
			//Parse the input number
			int n = Integer.parseInt(line);

			n *= 567;

			System.out.println(n);
		}
	}
}
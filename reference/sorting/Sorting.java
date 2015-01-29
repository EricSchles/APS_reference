import java.io.*;
import java.util.*;

public class Sorting {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String lin;
		ArrayList<Integer> a1 = new ArrayList<Integer>(1100000);
		while((line = in.readLine())!= null)
		{
			a1.clear();
			StringTokenizer st = new StringTokenizer(line);
			while( st.hasMoreTokens())
			{
				a1.add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(a1);
			boolean found = false;
			for(int i = 0; i < a1.size() && !found; ++i){
				if(a1.get(i) != i+1)
				{
					System.out.println(i+1);
					found = true;
				}
			}
			if (!found) System.out.println(a1.size() +1);		
		}
	}
}
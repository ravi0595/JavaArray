import java.util.*;
import java.io.*;
public class gameOfChocolate{
	public static void main(String arg[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			String inputLine[] = br.readLine().trim().split(" ");
			int N = Integer.parseInt(inputLine[0]);
			int M = Integer.parseInt(inputLine[1]);
			
			Solution17 obj  = new Solution17();
			boolean ans = obj.game(N,M);
			if(ans) {
				System.out.println("Dolly");
			}
			else {
				System.out.println("Bunty");
			}
		}
	}
}

class Solution17{
	boolean game(int n,int m) {
		if(n>m) {
			int temp = n;
			n=m;
			m = temp;
		}
		int k = m-n;
		double d = 1 + Math.sqrt(5);
		d = d/2;
		d = d*k;
		int temp = (int)d;
		if(temp ==n) {
			return false;
		}
		return true;
	}
}
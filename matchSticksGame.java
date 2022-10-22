import java.io.*;
import java.util.*;
public class matchSticksGame {

	public static void main(String arg[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -->0) {
			int N = Integer.parseInt(br.readLine());
			Solution25 obj = new Solution25();
			System.out.println(obj.findMatchNumber(N));
		}
	}
}

class Solution25{
	int findMatchNumber(int N) {
		if(N%5 ==0) {
			return -1;
		}
		return (N%5);
	}
}
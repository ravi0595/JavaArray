import java.io.*;
import java.util.*;
public class findTheSafePos {
	public static void main(String arg[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -->0) {
			int n = Integer.parseInt(br.readLine());
			int k = Integer.parseInt(br.readLine());
			
			Solution24 obj = new Solution24();
			System.out.println(obj.findTheSafePosUtil(n,k));
		}
	}
	
}

class Solution24{
	int findTheSafePosUtil(int n,int k) {
		if(n == 1) {
			return 1;
		}
		else {
			return (findTheSafePosUtil(n-1,k) + k-1) %n +1;
		}
	}
}
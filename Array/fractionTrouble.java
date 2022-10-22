import java.util.*;
import java.lang.*;
import java.io.*;
public class fractionTrouble {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -->0) {
			String S[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(S[0]);
			int d = Integer.parseInt(S[1]);
			Solution20 obj = new Solution20();
			int[] ans = obj.LargestFraction(n,d);
			for(int i=0;i<ans.length;i++) {
				System.out.print(ans[i] + " ");
				System.out.println();
			}
		}
	}
}
class Solution20{
	public int[] LargestFraction(int n,int d) {
		int num=0;
		int den=1;
		for(int i=10000;i>=2;i--) {
			int p = (n*i-1)/d;
			if(p*den >= num*i) {
				den=i;
				num=p;
			}
		}
		int total = gcdNumber(num,den);
		int[] ans = new int[2];
		ans[0] = num/total;
		ans[1] = den/total;
		return ans;
	}
	static int gcdNumber(int a,int b) {
		if(b==0) {
			return a;
		}
		return gcdNumber(b,a%b);
	}
}
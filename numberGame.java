import java.util.*;
import java.io.*;
public class numberGame {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		while( t -->0) {
			Long n = Long.parseLong(br.readLine());
			Solution22 obj = new Solution22();
			System.out.println(obj.numGame(n));
		}
	}
}
class Solution22{
	Long numGame(long n) {
		if(n==1) {
			return (long)1;
		}
		long res =1;
		for(long i=2;i<=n;i++) {
			long hcf = gcd(i,res);
			res = (res*i/hcf) % 1000000007;
		}
		return res;
	}
	static long gcd(long a,long b) {
		if(b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	}
}

import java.util.*;
import java.io.*;
public class bettingGame {

	public static void main(String arg[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -->0) {
			String result = br.readLine();
			Solution19 obj = new Solution19();
			System.out.println(obj.betBalance(result));
		}
	}
}

class Solution19{
	static int betBalance(String result){
	        // code here
		int bet=1,sum=4;
	       // char[] arr = result.toArray();
	    for(int i=0;i<result.length();i++){
	            if((result.charAt(i) == 'W') && (sum >= bet)){
	                sum = sum + bet;
	                bet=1;
	            }
	            else if(( result.charAt(i) == 'L') && (sum >= bet)){
	                sum = sum - bet;
	                bet = bet*2;
	            }
	            else {
	                return -1;
	            }
	        }
	        return sum;
	    }
	}
import java.util.*;
import java.io.*;
public class divideAndSubstract {

	public static void main(String arg[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -->0) {
			int N = Integer.parseInt(br.readLine());
			Solution18 obj = new Solution18();
			System.out.println(obj.divAndSub(N));
		}
	}
}

class Solution18{
	 String divAndSub(int N) {
		if(N==1) {
			return "Arya";
		}
		if(N<5) {
			return "Jon";
		}
		int arr[] = new int[N+1];
		for(int i=1;i<=5;i++) {
			arr[i] = 1;
		}
		for(int i=6;i<=N;i++) {
			if(arr[i/2] ==0) {
				arr[i] = 1;
			}
			else if(arr[i-2] == 0) {
				arr[i] = 1;
			}
			if(arr[i/3] ==0) {
				arr[i] = 1;
			}
			else if(arr[i-3] == 0) {
				arr[i] = 1;
			}
			if(arr[i/4] ==0) {
				arr[i] = 1;
			}
			else if(arr[i-4] == 0) {
				arr[i] = 1;
			}
			if(arr[i/5] ==0) {
				arr[i] = 1;
			}
			else if(arr[i-5] == 0) {
				arr[i] = 1;
			}
		}
		
		if(arr[N] == 1) {
			return "Jon";
		}
		else {
			return "Arya";
		}
	}
}
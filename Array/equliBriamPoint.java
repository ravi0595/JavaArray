import java.util.*;
import java.io.*;
public class equliBriamPoint {

	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -->0) {
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}
			Solution5 obj = new Solution5();
			System.out.println("EquiliBrium Point = "+obj.equiLiBriumPoint(arr,n));
		}
	}
}
class Solution5{
	int equiLiBriumPoint(int arr[],int n) {
		if(n==1) {
			return 1;
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum += arr[i];
		}
		int rightSum=0;
		for(int j=0;j<n;j++) {
			sum -= arr[j];
			if(sum == rightSum) {
				return j+1;
			}
			rightSum +=arr[j];
		}
		return -1;
	}
}

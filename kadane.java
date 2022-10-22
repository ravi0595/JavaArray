import java.io.*;
import java.util.*;
public class kadane {

	public static void main(String arg[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}
			Solution14 obj = new Solution14();
			System.out.println(obj.findMaxSumArray(arr,n));
		}
	}
}
class Solution14{
	int findMaxSumArray(int arr[],int n) {
		int maxSum =0, sum=0;
		for(int i=0;i<n;i++) {
			sum = sum+arr[i];
			if(sum > maxSum) {
				maxSum = sum;
			}
			if(sum < 0) {
				sum = 0;
			}
		}
		return maxSum;
	}
}
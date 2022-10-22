import java.io.*;
import java.util.*;
public class maxCircularSubArraySum {

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
			Solution16 obj = new Solution16();
			System.out.println("max sum is :"+obj.maxCircularSum(arr,n));
		}
	}
}

class Solution16{
	int maxCircularSum(int arr[], int n) {
		int x = kadane(arr,n);
		int revSum = 0;
		for(int i=0;i<n;i++) {
			revSum = revSum +arr[i];
			arr[i] = -arr[i];
		}
		revSum = revSum + kadane(arr,n);
		if(x <0) {
			return x;
		}
		else {
			return Math.max(x, revSum);
		}
	}
	static int kadane(int a[],int n) {
		int x = Integer.MIN_VALUE,count=0;
		for(int i=0;i<n;i++) {
			if(a[i] <0) {
				count++;
				if (a[i] > x) {
					x = a[i];
				}
			}
		}
		int sum =0,maxS = Integer.MIN_VALUE;
		if(count < n) {
			for(int i=0;i<n;i++) {
				sum += a[i];
				if(sum > maxS) {
					maxS = sum;
				}
				if(sum <0) {
					sum = 0;
				}
			}
			return maxS;
		}
		return x;
	}
}
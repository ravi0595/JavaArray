import java.util.*;
import java.io.*;
public class trappingRainWater {

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
			Solution11 obj = new Solution11();
			System.out.println(obj.trappingRainWaterUtil(arr,n));
		}
	}
}
class Solution11{
	int trappingRainWaterUtil(int arr[],int n) {
		int left[] = new int[n];
		int right[] = new int[n];
		int water=0;
		left[0] = arr[0];
		for(int i=1;i<n;i++) {
			left[i] = Math.max(arr[i], left[i-1]);
		}
		right[n-1] = arr[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i] = Math.max(arr[i], right[i+1]);
		}
		for(int i=0;i<n;i++) {
			water = water + (Math.min(left[i], right[i]) - arr[i]);
		}
		return water;
	}
}

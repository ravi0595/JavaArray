import java.util.*;
import java.io.*;
public class maximumIndex {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}
			Solution10 obj = new Solution10();
			System.out.println(obj.findMaxIndex(arr,n));
		}
	}
}

class Solution10{
	int findMaxIndex(int arr[],int n) {
		int i,j,maxDiff;
		int Lmin[] = new int[n];
		int Rmax[] = new int[n];
		Lmin[0] = arr[0];
		for(i=1;i<n;i++) {
			Lmin[i] = Math.min(arr[i], Lmin[i-1]);
		}
		Rmax[n-1] = arr[n-1];
		for(j=n-2;j>=0;j--) {
			Rmax[j] = Math.max(arr[j], Rmax[j+1]);
		}
		i=0;j=0;maxDiff=0;
		while(i<n && j<n) {
			if(Lmin[i] <= Rmax[j]) {
				maxDiff = Math.max(maxDiff, j-i);
				j++;
			}
			else {
				i++;
			}
		}
		return maxDiff;
	}
}
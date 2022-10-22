import java.util.*;
import java.io.*;
public class reArrangeSortedArray {

	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}
			Solution8 obj = new Solution8();
			obj.reArrangeArrayUtil(arr,n);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}

class Solution8{
	void reArrangeArrayUtil(int arr[],int n) {
		int k=0,j=0,temp=0;
		while(k<=n/2 && j<n) {
			temp = arr[n-1];
			for(int i=n-1;i>j;i--) {
				arr[i] = arr[i-1];
			}
			arr[j] = temp;
			k++;j=j+2;
		}
	}
}
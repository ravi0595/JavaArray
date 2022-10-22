//Rearrange an array with O(1) extra space
import java.util.*;
import java.io.*;
public class reArrangeArray {

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
			Solution9 obj = new Solution9();
			obj.reArrangeUnsortedArray(arr,n);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
class Solution9{
	void reArrangeUnsortedArray(int arr[],int n) {
		for(int i=0;i<n;i++) {
			arr[i] = n * (arr[arr[i]]%n) + arr[i];
		}
		for(int i=0;i<n;i++) {
			arr[i] = arr[i]/n;
		}
	}
}
//Minimum adjacent difference in a circular array
import java.util.*;
import java.io.*;
public class minAdjDifference {

	public static void main(String arg[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t -->0) {
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}
			Sol obj = new Sol();
			System.out.println(obj.findMinAdj(arr,n));
		}
	}
}
	

class Sol{
	public int findMinAdj(int arr[],int n) {
		int min = Integer.MAX_VALUE,abs_diff;
		for(int i=1;i<n;i++) {
			abs_diff = (Math.abs(arr[i]-arr[i-1]));
			if(min>abs_diff) {
				min = abs_diff;
			}
		}
		if(min > (Math.abs(arr[n-1] -arr[0]))) {
			return Math.abs(arr[n-1]) - Math.abs(arr[0]);
		}
		else {
			return min;
		}
	}
}

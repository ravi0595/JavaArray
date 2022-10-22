import java.util.*;
import java.io.*;
public class waveArray {

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
			Variable obj = new Variable();
			obj.waveArrayUtil(arr,n);
			for(int j=0;j<n;j++) {
				System.out.print(arr[j] + " ");
			}
		}
	}
}

class Variable{
	void waveArrayUtil(int arr[],int n) {
		for(int i=0;i<n-1;i=i+2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
	}
}
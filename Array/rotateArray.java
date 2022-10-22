import java.util.*;
import java.io.*;
public class rotateArray {
	public static void main(String arg[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t= Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			String str = br.readLine();
			String [] starr = str.split(" ");
		
			int n = Integer.parseInt(starr[0]);
			int d = Integer.parseInt(starr[1]);
			int[] arr = new int[n];
			String str1 = br.readLine();
			String []starr1 = str1.split(" ");
			for(int j=0;j<n;j++) {
				arr[j] = Integer.parseInt(starr1[j]);
			}
			new solution2().rotateArr(arr,d,n);
			StringBuffer sb = new StringBuffer();
			
			for(int t1=0;t1<n;t1++) {
				sb.append(arr[t1]+ " ");
			}
			System.out.println(sb);
		}
	}
}

class solution2{
	void rotateArr(int arr[],int d, int n) {
		for(int i=0;i<=d/2;i++) {
			int temp = arr[i];
			arr[i] = arr[d-i-1];
			arr[d-i-1] = temp;
		}
		for(int i=0;i<=(n-d)/2;i++) {
			int temp1 = arr[i+d];
			arr[i+d] = arr[n-i-1];
			arr[n-i-1] = temp1;
		}
		for(int i=0;i<=n/2;i++) {
			int temp2 = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-1-i] = temp2;
		}
	}
}

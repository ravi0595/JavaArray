//Frequencies of Limited Range Array Elements
import java.io.*;
public class frequency {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -->0) {
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}
			int p = Integer.parseInt(br.readLine());
			Solution4 obj = new Solution4();
			obj.frequencyCount(arr,n,p);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}

}

class Solution4{
	void frequencyCount(int arr[], int n, int p) {
		for(int i=0;i<n;i++) {
			arr[(arr[i]%n) - 1] +=n;
		}
		for(int i=0;i<n;i++) {
			arr[i] = arr[i]/n;
		}
	}
}
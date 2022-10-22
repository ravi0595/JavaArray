import java.io.*;
public class maXadjPair {
	
	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		while(testcases -->0) {
			int size = Integer.parseInt(br.readLine());
			int arr[] = new int[size];
			String newline = br.readLine();
			String []element = newline.trim().split(" ");
			for(int i=0;i<size;i++) {
				arr[i] = Integer.parseInt(element[i]);
			}
			Strongestnbr nbr = new Strongestnbr();
			nbr.strongestNbrUtil(arr,size);
		//	for(int index = 0;index<size;index++) {	
		//	System.out.print(arr[index] + " ");
		//	}
		}
	}

}

class Strongestnbr
{
	public void strongestNbrUtil(int arr[],int size) {
		int temp=0,temp1 = 0;
		for(int i=0;i<size-1;i++) {
			temp = arr[i];
			temp1 = arr[i+1];
			if(temp>temp1) {
				System.out.print(temp + " ");
			}
			else {
				System.out.print(temp1 + " ");
			}
		}
	}
}
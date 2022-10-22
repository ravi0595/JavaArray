import java.util.Scanner;
import java.util.*;
public class InsertAtEnd {

	public static void main(String arg[]) {
		System.out.println("Please start the procedure by Entering number of test cases:");
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		while(testcases --> 0) {
			System.out.println("Please Enter the Size:");
			int sizeOfArray = sc.nextInt();
			int arr[] = new int[sizeOfArray];
			for(int i=0;i<sizeOfArray-1;i++) {
				System.out.print("Please Enter Each Existing Member: ");
				int x = sc.nextInt();
				arr[i] = x;
			}
			System.out.println("Please Enter new Element: ");
			int element = sc.nextInt();
			Insert obj = new Insert();
			obj.insertAtEndUtil(arr,sizeOfArray,element);
			for(int i=0;i<sizeOfArray;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}
class Insert
{
	void insertAtEndUtil(int arr[],int size, int element) {
		arr[size-1] = element;
	}
}


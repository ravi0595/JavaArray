import java.util.*;
public class insertAtIndex {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		while(testcases -->0) {
			int size = sc.nextInt();
			int arr[] = new int[size];
			for(int i=0;i<size-1;i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the Index: ");
			int index  = sc.nextInt();
			System.out.println(("Enter the element: "));
			int element  = sc.nextInt();
			InsertUtil obj = new InsertUtil();
			obj.insertAtIndex(arr,size,index,element);
			for(int i=0;i<size;i++) {
				System.out.println(arr[i] + " ");
			}
		}
		sc.close();
	}
}

class InsertUtil
{
	public void insertAtIndex(int arr[],int size,int index,int element) {
		
		for(int i = size -1 ;i>index;i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = element;
	}
}
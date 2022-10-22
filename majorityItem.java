import java.util.Scanner;
public class majorityItem {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		while(testcases -->0) {
			int size = sc.nextInt();
			int arr[] = new int[size];
			for(int i=0;i<size;i++) {
				 arr[i] = sc.nextInt();
			}
			System.out.print("Please Enter num1: ");
			int a = sc.nextInt();
			System.out.print("Please Enter num2: ");
			int b = sc.nextInt();
			Majority obj = new Majority();
			System.out.println("element :"+obj.majorityItemUtil(arr,size,a,b));
		}
		sc.close();
	}
}
class Majority
{
	public int majorityItemUtil(int arr[],int size,int a, int b) {
		int count1=0,count2=0;
		for(int i=0;i<size;i++) {
			if(arr[i] == a){
				count1++;
			}
			else if(arr[i] == b) {
				count2++;
			}		
		}
		if (count1 == count2) {
			if(a<b) {
				return a;
			}
			else {
				return b;
			}
		}
		else if(count1>count2) {
			return a;
		}
		else {
			return b;
		}
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner (System.in);

		 System.out.println("Enter the Size of array");

		 int size=sc.nextInt();

		 int arr[]=new int[size];

		 System.out.println("Enter the element of array");

		 for(int i=0;i<arr.length;i++)

		 {

		  arr[i]=sc.nextInt();

		 }

		 Arrays.sort(arr);










	}

}

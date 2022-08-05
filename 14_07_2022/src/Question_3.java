import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		
		int count=0;
		System.out.println("Enter Number to check it is Prime or Not");
		
		Scanner scan= new Scanner(System.in);
		int input=scan.nextInt();
		
		for (int i=1; i<=input; i++) {
			if(input%i == 0) {
				count++;
			}
		}
		if(count==2) {
				System.out.println("It is Prime Number");
			}
			else {
				System.out.println("It is not Prime Number");
			}
		}
		
		
	}

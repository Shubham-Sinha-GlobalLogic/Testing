
import java.util.Scanner;
public class Question_6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char input = scan.next().charAt(0);
		int i;
		
		if(input>='a'&&input<='z') {
		
		i= input;
		input=(char)(i-32);
		System.out.println(input);
		}
		
		else {
			
		    i=input;
		    input=(char)(i+32);
			System.out.println(input);
		}
	}
}



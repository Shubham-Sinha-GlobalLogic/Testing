	import java.util.Scanner;
	
	public class Question_2
	{
	    public static void main(String[] args) 
	    {
	        int input;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the number you want to check:");
	        input = scan.nextInt();

	        if(input % 2 == 0)
	        {
	            System.out.println("The given number "+input+" is Even ");
	        }
	        else
	        {
	            System.out.println("The given number "+input+" is Odd ");
		}
	    }
	}
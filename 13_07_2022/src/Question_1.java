import java.util.Scanner;

public class Question_1
{
    public static void main(String[] args) 
    {
    	int input;
    	Scanner Scan= new Scanner(System.in);
    	System.out.println("Enter Any Number to Check if its a Positive or Negative");
    	input = Scan.nextInt();
       
        if(input>0)
            System.out.println(input + " is POSITIVE NUMBER.");
        else if(input<0)
            System.out.println(input + " is NEGATIVE NUMBER.");
        else
            System.out.println("IT's ZERO.");
        }
    }


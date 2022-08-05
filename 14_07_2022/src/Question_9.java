import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
		int input,s=0,c,r;
	 
	      Scanner scan = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      input = scan.nextInt();  
	      c=input;
	      while(input>0)
	      {
	    	  r=input%10;
	          s=(s*10)+r;
	          input=input/10;
	      }
	      if (c==s)  
	         System.out.println("Entered number is a palindrome.");  
	      else  
	         System.out.println("Entered number is not a palindrome.");   
	   }  
	}  

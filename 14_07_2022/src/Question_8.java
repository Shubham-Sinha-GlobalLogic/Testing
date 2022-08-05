import java.util.Scanner;

class Question_8 {
  public static void main(String[] args) {
    
	  int reverse;
	  System.out.println("Enter number to get reversed number :");
	  Scanner scan = new Scanner(System.in);
	  int input=scan.nextInt();
	  
	  while(input>0) {
		  
		  reverse=input%10;
			  System.out.print(reverse);
			  input=input/10;
		  
	  }
	  
	 
	  

  }
}

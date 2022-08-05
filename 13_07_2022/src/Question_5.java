import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Male or Female ?");
		 String gender = scan.nextLine();
		
		 
		 System.out.println("Enter Age");
		 int age = scan.nextInt();


		if(gender.equals("Female")) {
			
	
			   if( age>=1&&age<=58)
			        System.out.println("Interest=8.2%");
	
				else if(age>58&&age<=100)
				    System.out.println("Interest=9.2%");
	
				else
					System.out.println("No result");

		}
		
		else {

		       if(age>=1&&age<=58)
			      System.out.println("Interest=8.4%");

		       else if(age>58&&age<=100)
			       System.out.println("Interest=10.5%");

			   else 
				   System.out.println("No result");

		}
	}

}

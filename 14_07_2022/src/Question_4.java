
public class Question_4 {

	   public static void main (String[] args)
	   {		
	       int i =0;
	       int num =0;

	       String  flag = "";

	       for (i = 10; i <= 99; i++)         
	       { 		  	  
	          int count=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		count = count + 1;
		     }
		  }
		  if (count ==2)
		  {

		     flag = flag + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(flag);
	   }
	}
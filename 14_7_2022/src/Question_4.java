
public class Question_4 {

	public static void main(String[] args) {

	       int i =0;
	       int num =0;
	      

	       for (i = 10; i <=99; i++)         
	       { 		  	  
	          int myFlag=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		myFlag = myFlag + 1;
		     }
		  }
		  if (myFlag ==2)
		  {

		  }	
	       }	
	       System.out.println("Prime numbers from 10 to 99 are :");
	       System.out.println(num);
	   }
	}



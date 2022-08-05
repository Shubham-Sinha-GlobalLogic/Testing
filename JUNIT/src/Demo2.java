public class Demo2 {

 StringBuilder sb=new StringBuilder();

  boolean palindromeCheck(String S1)

  {

   sb.append(S1);

   sb=sb.reverse();

   if(sb.toString().equals(S1))

   {

   return true;

   }

   else {

   return false;

   }

  }

}
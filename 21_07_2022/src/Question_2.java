//2) Create an ArrayList that can store only Strings.
//Create a printAll method that will print all the elements of the ArrayList using an Iterator.

import java.util.*;

  

public class Question_2{

  

  public static void main(String[] args)

  {

     

    ArrayList<String> list= new ArrayList<>();

  

    list.add("we");

    list.add("are");

    list.add("going");

    list.add("on");

    list.add("picnic");

     

  

     

    System.out.println("The list is: \n"

              + list);

  

    

    Iterator<String> iter

      = list.iterator();

  

     

    System.out.println("\nThe iterator values"

              + " of list are: ");

    while (iter.hasNext()) {

      System.out.print(iter.next() + " ");

    }

  }

}






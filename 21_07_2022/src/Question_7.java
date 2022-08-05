



import java.util.HashSet;

import java.util.Iterator;



public class Question_7 {



 public static void main(String[] args) {

 HashSet<String> set = new HashSet<>();

  

 set.add("ram");

 set.add("jkke");

 set.add("John");

 set.add("rohan");

  

 Iterator<String> it = set.iterator();

 while (it.hasNext())

  System.out.println(it.next());



 }



}
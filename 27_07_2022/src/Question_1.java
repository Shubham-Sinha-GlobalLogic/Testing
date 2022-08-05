

import java.util.ArrayList;

import java.util.List;

import java.util.function.Predicate;





public class Question_1 {

 public static void main(String args[]) {

 List <Integer> list=new ArrayList<>();



  

 list.add(1);

 list.add(2);

 list.add(3);

 list.add(4);

 list.add(5);

 list.add(6);

 list.add(7);

 list.add(8);

 list.add(9);

 System.out.println("all number :");

 eval(list,(num)->true);

 System.out.println("\n");

  System.out.println("even number :");

  eval(list,(num)->num%2==0);

  System.out.println("\n");

  System.out.println("number greater than 3: ");

  eval(list,(num)->num>3);

  }

 public static void eval(List<Integer> list,Predicate<Integer> pre)

 {

 for(int i=1;i<=list.size();i++) {

  if(pre.test(i))

  {

  System.out.println(i + " ");

  }

 }

 }

	

	

	



}
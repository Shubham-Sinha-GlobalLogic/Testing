import java.util.Scanner;

@FunctionalInterface

interface Helloworld{

 void hello(String str);

}

public class Question_1 {

public static void main(String[] args) {

 Scanner sc=new Scanner(System.in);

 System.out.println("Enter the word to displayed");

 String s=sc.nextLine();

 Helloworld h=(str)->{System.out.println("Hello "+str);};

 h.hello(s);

}

}
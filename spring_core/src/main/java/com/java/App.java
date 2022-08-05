package com.java;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App

{

  public static void main( String[] args )

  {

    ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");

 Customer cb=ctx.getBean(Customer.class);

 System.out.println( cb.toString());

 boolean s=true;

 while(s)

 {

 System.out.println("1.) Deposit \t2.) Withdrawing \t3.)Exit");

 Scanner sc=new Scanner(System.in);

 System.out.println("Enter key to process");

 int n=sc.nextInt();

  switch(n)

  {

  case 1: cb.getAccount().deposit();

  break;

  case 2: cb.getAccount().withdraw();

  break;

  case 3:

  System.out.println("Welcome Back again");

  s=false;

  }

 }

  }

}


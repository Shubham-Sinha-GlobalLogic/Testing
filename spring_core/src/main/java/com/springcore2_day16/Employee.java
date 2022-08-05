package com.springcore2_day16;



public class Employee {

 private int id;

 private String name;

 private Address address;//Aggregation

 public int getId() {

 return id;

 }

 public void setId(int id) {

 this.id = id;

 }

 public String getName() {

 return name;

 }

 public void setName(String name) {

 this.name = name;

 }

 public Address getAddress() {

 return address;

 }

 public void setAddress(Address address) {

 this.address = address;

 }

 public void show(){

   System.out.println(id+" "+name);

   System.out.println(address.toString());

 }

}
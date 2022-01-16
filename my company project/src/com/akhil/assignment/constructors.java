package com.akhil.assignment;
public class constructors 
{ 
//Declaration of Instance variables. 
    String name; 
    int age; 
    String address; 

//Declare a default constructor. 
    constructors() 
    { 
//Initialization of values of Instance variables. 
      name = "Akhil"; 
      age = 21; 
      address = "Gandhi Nagar"; 

//Print the values on the console. 
    System.out.println(name+ " " +age+ " " +address); 
   } 
//Static method or the main method. 
    public static void main(String[] args) 
    { 
// Create the object of the class using new keyword. 
      constructors p = new constructors(); // Calling default constructor. 
    } 
}
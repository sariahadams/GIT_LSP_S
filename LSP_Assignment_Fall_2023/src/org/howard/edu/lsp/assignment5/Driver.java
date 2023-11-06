package org.howard.lsp.assignment5;

import java.util.Set;

//Here goes the test code for IntegerSet
public class Driver {

	public static void main(String[] args) {
		// Tests the IntegerSet class
		//Creates Set A
		IntegerSet setA = new IntegerSet();
		setA.add(-3);
		setA.add(20);
		setA.add(32);
		setA.add(17);
		setA.add(0);
		
		System.out.println("Value of Set A is: " + setA.toString());
		System.out.println("Smallest Value in Set A is: " + setA.smallest());
		System.out.println("Largest Value in Set A is: " + setA.largest());
		
		
		//Creates Set B
		IntegerSet setB = new IntegerSet();
		setB.add(5);
		setB.add(2);
		setB.add(4);
		setB.add(4);
		setB.add(-1);
		setB.add(-10);
		
		System.out.println("Value of Set B is: " + setB.toString());
		System.out.println("Smallest Value in Set B is: " + setB.smallest());
		System.out.println("Largest Value in Set B is: " + setB.largest());
		
		
		
		System.out.println("Union of SetA and SetB");
		//Calls the union function
		System.out.println("Value of Set A is:" + setA.toString());
		System.out.println("Value of Set B is:" + setB.toString());
		
		IntegerSet setC = new IntegerSet();
		setC.add(10);
		setC.add(100);
		setC.add(20);
		setC.add(30);
		setC.add(40);
		setC.add(60);
		
		System.out.println("Value of Set C is: " + setC.toString());
		System.out.println("Smallest Value in Set B is: " + setC.smallest());
		System.out.println("Largest Value in Set B is: " + setC.largest());
		
		System.out.println("Testing of Union " + setA.toString() );
	}

}



/**
*
* demonstration of the simplist Java application program
*
* Written by: Charles Thomas
*
* First Written: date
*
* Last Rewritten: date
*
*
*/

import java_first_contact.lancs.*;

public class Chapter3n1 {

   	/**
   	*
   	* main
   	*
   	*/

   	public static void main(String[] args) {

   		// Step 1 - delcare two "Person" variables
   		Person person1 = new Person();
   		Person person2 = new Person();

   		// Step 2 - set the attributes of "person1"
   		person1.setForename("John");
   		person1.setSurname("Smith");
   		person1.setAge(24);

   		// Step 3 - set the attributes of "person2"
   		person2.setForename("Peter");
   		person2.setSurname("Wright");
   		person2.setAge(19);

   		// Step 4 - display the attributes of "person2"
   		System.out.print("the second person is ");
   		System.out.print(person2.getForename());
   		System.out.print(" ");
   		System.out.print(person2.getSurname());
   		System.out.print(" ");
   		System.out.print(" (");
   		System.out.print(person2.getAge());
   		System.out.println(")");	

   		// Step 5 - leave a blank line
   		System.out.println();

   		// Step 6 - display the attributes of "person1"
   		System.out.print("the first person is ");
   		System.out.print(person1.getForename());
   		System.out.print(" ");
   		System.out.print(person1.getSurname());
   		System.out.print(" ");
   		System.out.print(" (");
   		System.out.print(person1.getAge());
   		System.out.println(")");

   		

   	} // end of method main

} // end of class ClassName
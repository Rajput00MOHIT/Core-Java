package java_metod;

import java.time.LocalDate;
import java.time.Period;

import in.co.Exercise.i20car;

public class testPerson1 {
public static void main(String[] args) {
	person1 s = new person1();
	i20car  r = new i20car ();
	//account_Balance d = new account_Balance();

	

////---agee----/////

LocalDate  today = LocalDate.now();

LocalDate dob = LocalDate.of(2002, 07, 25);

Period diff = Period.between(today, dob);
System.out.print("i am    ");


System.out.print(diff);
System.out.println("    old ");
    s.setadd("inodre");
    s.setnum(769404160);
	
    
    System.out.println(s.getname());
    System.out.println(s.getage());
    System.out.println(s.getadd());
    System.out.println(s.getnum());
    
    
    
    ////----speed and gear-----/////
    
    int a = 100;
    if (a>=90 && a<=220) {
    	System.out.println("the car is moving in, fifth gear");}
    	else if (a>=60 && a<=90) {
System.out.println("the car is moving in, fourth gear");}
    	else if (a>=40 && a<=60) {
    		System.out.println("the car is moving in, third gear");}
    	else if (a>=20 && a<=40) {
    		System.out.println("the car is moving in, second gear");}
    	else if (a>=01 && a<=20) {
    		System.out.println("the car is moving in, first gear");}
    	else System.out.println("car is nuetral");
 
    
    /////----account----/////
    
    
    
    
    
    
}
}

import java.util.Scanner;

class Vehicle {

private String name;
String num;

Vehicle (String name , String num ){
//Vehicle () {
this.name = name ;
this.num = num ;
System.out.println(" Vehical is good to go "); 
System.out.println( this.name + " : " + this.num ); 

}


void display_vehicle () {
System.out.println(" \n \n ultimate driving experience "); 
// System.out.println( this.name + " : " + this.num ); 
}

String get_name() {
return this.name;
}


}

class Car extends Vehicle {

Car (String name , String num ) {
super(name , num );
super.display_vehicle();

}

void display_vehicle () {
// System.out.println(" ultimate driving experience ");
super.display_vehicle(); 
System.out.println( this.get_name() + " : " + this.num + " \n \n " ); 
}


}

public class Programm1 {

public static void main(String[] args ) {

Vehicle v = new Car(" BMW " , " 2806 ");
// Vehicle v = new Car();

v.display_vehicle();
v.get_name();

}

}

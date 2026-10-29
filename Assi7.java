

import java.util.Scanner;

abstract class Shape {                                                       // abstract parent class 

abstract void calculate_area () ;
abstract void calculate_perimeter () ;

void display () {

System.out.println( " \n Shape is created what you want to do ");                   // commen method for all 

}

} 

class Circle extends Shape {                                                              // all child class that over ides abstract parent class 
double radius;
Circle  (double radius ) {
this.radius = radius;
super.display();
} 

void calculate_area () {
System.out.println(" area of circle is : " + 3.14*this.radius*this.radius );
}

void calculate_perimeter () {
System.out.println( " perimetrer of circle : " + this.radius*3.14*2 );
}

}

class Square  extends Shape {
double side ;
Square  (double side ) {
this.side  = side;
super.display();
} 

void calculate_area () {
System.out.println(" area of square is : " + this.side*this.side  );
}

void calculate_perimeter () {
System.out.println( " perimetrer of square : " + this.side*2 );
}

}

class Rectangle  extends Shape {
double length;
double breadth;
Rectangle  (double length , double breadth ) {
this.length = length;
this.breadth = breadth;

super.display();
} 

void calculate_area () {
System.out.println(" area of rectangle  is : " + this.breadth*this.length );
}

void calculate_perimeter () {
System.out.println( " perimetrer of rectangle : " + ( this.breadth*2 + this.length*2 ) );
}

}

class Triangle  extends Shape {
double base ;
double height ;
Triangle (double base  , double height ) {
this.base = base;
this.height = height;

super.display();
} 

void calculate_area () {
System.out.println(" area of triangle  is : " + this.height*this.base*0.5 );
}

void calculate_perimeter () {
Scanner sc = new Scanner(System.in);
System.out.println(" enter sides : ");



double s2 ;
double s1;
double s;
try {

s2 = sc.nextDouble();
s1 = sc.nextDouble();
s = sc.nextDouble();
System.out.println( " perimetrer of triangle : " +  ( s2+s1+s ) );

}catch ( java.util.InputMismatchException i) {

	System.out.println( " input mis match exception caught " ); 

}

// 	System.out.println( " after catch  " ); 




}

}


class Cylinder extends Shape {
double radius;
double height;

Cylinder (double radius , double height ) {
this.radius = radius;
this.height = height;

super.display();
} 

void calculate_area () {
System.out.println(" area of cylinder is : " + (this.height*this.radius*3.14*2 + this.radius*this.radius*2*3.14) );
}

void calculate_perimeter () {
System.out.println( " perimetrer of cylinder : " + this.radius*2*3.14 );
this.calculate_volume();
}

void calculate_volume () {                                                                                                                                                 // method which doesnot over ride any method of abstract calss 
System.out.println(" volume of cylinder is : " + this.height*this.radius*this.radius*3.14*2 );
try{
	 this.calculate_perimeter();

}catch ( StackOverflowError s ) {
	System.out.println(" stack overflow exception caughat ");

}
}

}

public class Assi7 {

public static void main(String[] args ) {

	Shape r = new Circle(28);
	r.calculate_area();
	r.calculate_perimeter();
	System.out.println();

	Shape r1 = new Square(06);
	r1.calculate_area();
	r1.calculate_perimeter();
	System.out.println();

	Shape r2 = new Rectangle(28,06);
	r2.calculate_area();
	r2.calculate_perimeter();
	System.out.println();

	 Shape r3 = new Triangle(28,06);
	r3.calculate_area();
	r3.calculate_perimeter();
	System.out.println(); 

	Shape r4 = new Cylinder(28,06);
	r4.calculate_area();
	r4.calculate_perimeter();
	// r4.calculate_volume();      // volume not included in abstract class which is parent so when i am usoing parent refrende and child object it gives error  rituja@rituja-Swift-SFG14-71:~/all/java$ javac Assi5.java 

/* Assi5.java:158: error: cannot find symbol
	r4.calculate_volume();
	  ^
  symbol:   method calculate_volume()
  location: variable r4 of type Shape
1 error
rituja@rituja-Swift-SFG14-71:~/all/java$ 

:wq
*/
	((Cylinder)r4).calculate_volume();                                     // i can typecast it              								
									
	Cylinder c = (Cylinder)r4;
	c.calculate_volume() ;          


	System.out.println();



	Cylinder r5 = new Cylinder(28,06);                      // instead when i give refrence of child class only then i can access methods which are not overridden 
	
	r5.calculate_area();
	r5.calculate_perimeter();
	r5.calculate_volume();
	System.out.println();

	try {
		System.out.println( 28/0  );
	}catch( ArithmeticException a) {
		System.out.println( " floating point exception caught " );
	}

	int assi[] = {1,2,3};

	int i = 0;
	while( i != 4 ) {
		try{
			assi[i] = 0;	
		}catch( ArrayIndexOutOfBoundsException a) {
			System.out.println( " array index out of bound exception " + i );
		}
			i++;
	}



	
	{
		try{
	String n = null;
	int l = n.length();
		}catch( NullPointerException e ) {System.out.println( e.getMessage());}
	
	}











}


}














/*


************8 output ******************



rer of square : 12.0

 
 Shape is created what you want to do 
 area of rectangle  is : 168.0
 perimetrer of rectangle : 68.0

 
 Shape is created what you want to do 
 area of triangle  is : 84.0
 enter sides : 
as

 input mis match exception caught 

 


 perimetrer of cylinder : 175.84
 volume of cylinder is : 29541.120000000003
 perimetrer of cylinder : 175.84
 volume of cylinder is : 29541.120000000003
 perimetrer of cylinder : 175.84
 volume of cylinder is : 29541.120000000003
 perimetrer of cylinder : 175.84
 volume of cylinder is : 29541.120000000003
 perimetrer of cylinder : 175.84
 volume of cylinder is : 29541.120000000003
 perimetrer of cylinder : 175.84
 volume of cylinder is : 29541.120000000003
 perimetrer of cylinder : 175.84
 volume of cylinder is : 29541.120000000003
 perimetrer of cylinder : 175.84
 volume of cylinder is : 29541.120000000003
 perimetrer of cylinder : 175.84
 volume of cylinder is : 29541.120000000003
 perimetrer of cylinder : 175.84
 volume of cylinder is : 29541.120000000003
 perimetrer of cylinder : 175.84
 volume of cylinder is : 29541.120000000003
 perimetrer of cylinder : 175.84
 volume of cylinder is : 29541.120000000003
 perimetrer of cylinder : 175.84
 volume of cylinder is : 29541.120000000003
 perimetrer of cylinder : 175.84
 volume of cylinder is : 29541.120000000003
 perimetrer of cylinder : 175.84
 volume of cylinder is : 29541.120000000003
 perimetrer of cylinder : 175.84

 stack overflow exception caughat 

 floating point exception caught 
 array index out of bound exception 3
Cannot invoke "String.length()" because "<local10>" is null




*/ 





import java.util.Scanner;
import java.lang.Math;

class Calculate {

void area_perimeter (double length , double breadth ) {
	
	System.out.println("");
	System.out.println(" area of rectangle is : "  + length*breadth );
	System.out.println(" perimeter of rectangle is : "  + (2*length + breadth*2) );
	System.out.println("");
}

void area_perimeter (int length , int breadth ) {

	System.out.println("");
	System.out.println(" area of rectangle is : "  + length*breadth );
	System.out.println(" perimeter of rectangle is : "  + (2*length + breadth*2) );
	System.out.println("");
}


void area_perimeter (float radius ) {


	System.out.println("");
	System.out.println("");
	System.out.println(" in float ");
	System.out.println("");

	System.out.println(" area of circle  is : "  + (3.14)*radius*radius );
	System.out.println(" perimeter of circle is : "  + (3.14)*radius*2 );
	System.out.println("");
}

/*void area_perimeter (double radius ) {

	System.out.println("");
	System.out.println(" in double ");

	System.out.println(" area of circle  is : "  + (3.14)*radius*radius );
	System.out.println(" perimeter of circle is : "  + (3.14)*radius*2 );
	System.out.println("");
}*/

void area_perimeter (double s , double s1 , double s2 ) {

	System.out.println("");
	double a  = (s + s1 + s2) / 2; 
	System.out.println(" area of trangle is : "  + Math.sqrt(a*(a - s1)*(a - s2)*(a - s)) );
	System.out.println(" perimiter of triangle is : "  + (s + s1 + s2 ) );
	System.out.println("");

}


}


public class Assi4_a {

public static void main(String[] args) {

	Calculate c = new Calculate();
	int x = 1;
	float y = 2806;
	double z = 6789.9876978;

	c.area_perimeter(x,x);                           // internal type casting allowed in java 
	c.area_perimeter(y,z);					 // no matters where i write function it give no error 
	c.area_perimeter(28.06,03.03);
	c.area_perimeter(1,1,1);
	c.area_perimeter(1);


	// c.area_perimeter((double)1);                           // if i restrict type o r  type cast then it gives error: incompatible types: lossly conversion from  double to float 
                         
							       
}


}

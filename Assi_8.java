
import java.util.Scanner;



class StackException extends Exception {

private String message;

public StackException(String message) {
this.message =  message;
}

public String getMessage() {
return message;
}

}

class Stack<T> {

int size_s ;
int max_size ;
T[] arr;


Stack( int max_size ) {

this.size_s = 0;
this.max_size = max_size;
// T arr[] = new T[max_size];                     // generic array creation error 
arr =  (T[]) new Object[this.max_size];                     // but only objects can be placed init not variable 

}

void push_front(T data ) {

try {

	if(this.size_s == this.max_size ) throw new StackException(" your stack is full ");
this.arr[size_s] = data;
this.size_s++;

}catch (Exception e ) {
System.out.println( e.getMessage());
}

}


void pop() throws Exception  {                                                                          // nothing happns 

try {
this.size_s--;
	 if(this.size_s < 1 ) throw new StackException(" Stack under flow  Exception ");
this.arr[size_s - 1 ] = null;
}catch (Exception e){ System.out.println( e.getMessage());  }

}


// void display() {
								// Assi_8.java:49: error: unreported exception Exception; must be caught or declared to be thrown
	                                           // if(this.size_s == 0 ) throw new Exception( "Stack is empty ");
	                                                                   //  ^
void display() throws Exception {
	int x = 0;

	if(this.size_s == 0 ) throw new Exception( "Stack is empty ");
while(x != max_size ) {
System.out.println( this.arr[max_size - x - 1] ); 
x++;
}

}





}



public class Assi_8 {

public static void main( String [] args ) {

	Stack<Integer> s = new Stack<Integer>(5);
Scanner sc = new Scanner(System.in);

int x = 0;
while(x != 4 ) {

System.out.print(" ************ menu *************  \n 1. push \n 2. pop \n 3. display \n 4. exit \n\n enter your choice : " );
	x = sc.nextInt();

switch(x) {
	case 1: {
			int data_int;
			data_int = sc.nextInt();
			Integer  data  = new Integer(data_int);
			s.push_front(data); 
	
		};
		break;
	case 2: {
			try{
			s.pop();
			}catch( Exception e) { System.out.println( e.getMessage());}
		};
		break;
	case 3: {
			try{
			s.display();
			}catch( Exception e) { System.out.println(e.getMessage());}
		};
		break;
	case 4: {
			System.out.println("\n\n exittinggggggg........... \n\n");
	
		};
		break;
	default: {
	
		};
		break;

}

}

}


}


















/* 


 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 1
2
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 1
2
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 1
2
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 1
2
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 1
2
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 1 
2
 your stack is full 
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 3
2
2
2
2
2
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 2
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 2
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 2
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 2
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 2
 Stack under flow  Exception 
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 2
 Stack under flow  Exception 
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 2
 Stack under flow  Exception 
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 3
2
null
null
null
null
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 5
 ************ menu *************  
 1. push 
 2. pop 
 3. display 
 4. exit 

 enter your choice : 4


 exittinggggggg........... 


*/


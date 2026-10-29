
import java.util.Scanner;



class Multi extends Thread {

int[] arr;
int[][] arr2;
int[] arr3;
public static int[][] arr4;
int r;

Multi(int arr[] , int arr2[][] , int r ) {
this.arr = arr;
this.arr2 = arr2;
this.arr3 = new int[arr2.length];
this.arr4 = new int[arr.length][arr2[0].length];
//this.arr4 = new int[arr.length][arr2[0].length];                                                   // in java if it is possible to initialize unlikely in cppp but it crrates seprate copy for it  also if i do this then its length is already 3 and give error or if i gonna fix it with -1 then it replaces only second possition 
this.r = r;
}

public void run() {

// int sum = 0;
// int[] arr3; 
for(int x = 0 ; x < arr2.length ; x++ ) {
int sum = 0;
for(int y = 0 ; y < arr2[x].length ; y++ ) {
	sum = sum + arr[y]*arr2[x][y];
}

arr3[x] = sum;

}
// try{
this.arr4[r] = this.arr3; 
// for(int x = 0 ; x < 3 ; x++ ) System.out.print(arr3[x] + " " );
// System.out.println();
// }catch(Exception e){}
}

}



public class Assi_9 {

public static void main(String [] args ) throws InterruptedException{

// int[][] arr = new int[3][4];
// int[][] arr1 = new int[3][4];

int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
int[][] arr2 = new int[arr.length][arr1[0].length]; 

for(int x = 0; x < arr1.length; x++ ) {
for(int y = 0; y < arr1[x].length ; y++ ) {
	// System.out.println(arr1[y][x] + " ");
	arr2[x][y] = arr1[y][x];
}
}



Multi m1 = new Multi(arr[0],arr2,0);
Multi m2 = new Multi(arr[1],arr2,1);
Multi m3 = new Multi(arr[2],arr2,2);
// Multi m1 = new Multi(arr[0],arr2);
m1.start();
m2.start();
m3.start();

m1.join();                                                                 // i cant directly join all threads            Assi_9.java:71: error: unreported exception InterruptedException; must be caught or declared to be thrown
																			// Assi_9.java:72: error: unreported exception InterruptedException; must be caught or declared to be thrown
																			// m2.join();
																			//        ^
																			// Assi_9.java:73: error: unreported exception InterruptedException; must be caught or declared to be thrown
																			// m3.join();
																			//        ^
																			// 3 errors
																			// error: compilation failed
m2.join();
m3.join();
System.out.println( " matrix 1 : ");
for(int x = 0; x < 3 ; x++ ) {

	for(int z = 0 ; z < 3 ; z++ ) {                          // y 
		System.out.print( " " + arr[x][z]);
	}
	System.out.println();

}
	System.out.println();
System.out.println( " matrix 2 : ");
for(int x = 0; x < 3 ; x++ ) {

	for(int z = 0 ; z < 3 ; z++ ) {                          // y 
		System.out.print(" " + arr1[x][z]);
	}
	System.out.println();

}
	System.out.println();

System.out.println( " resultant matrix  : ");

try {
for(int x = 0; x < 3 ; x++ ) {

	for(int z = 0 ; z < 3 ; z++ ) {                          // y 
		System.out.print(" " + m3.arr4[x][z]);
	}
	System.out.println();

}
	System.out.println();
// for(int x = 0; x < 3 ; x++ ) {

// 	for(int z = 0 ; z < 3 ; z++ ) {                          // y 
// 		System.out.print(m2.arr4[x][z] + " ");
// 	}
// 	System.out.println();

// }
// 	System.out.println();
// for(int x = 0; x < 3 ; x++ ) {

// 	for(int z = 0 ; z < 3 ; z++ ) {                          // y 
// 		System.out.print(m1.arr4[x][z] + " ");
// 	}
// 	System.out.println();

// }
// 	System.out.println();

}catch(Exception e) {}


}

}






/*\

 ************ output  *************

  matrix 1 : 
 1 2 3
 4 5 6
 7 8 9

 matrix 2 : 
 1 2 3
 4 5 6
 7 8 9

 resultant matrix  : 
 30 36 42
 66 81 96
 102 126 150


*/ 

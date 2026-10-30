
class node {

}

class circularQueue<T> extends node {

int front;
int capacity_c;
int size_c;
// Integer data1 = 10;
T data;
T[] det;

    circularQueue() {
        this.front = 0;
        this.capacity_c = 1;
        this.size_c = 0;
        // Integer i = new Integer(20);
        // // System.out.println(this);
        // // System.out.println(data);
//         // this.data = i;



//         // T arr[] = new T[max_size];                     // generic array creation error 
// arr =  (T[]) new Object[this.max_size];                     // but only objects can be placed init not variable 



        this.det =  (T[]) new Object[3];
    }

    circularQueue<T> ref() {
        return this;
    }
}


class Soham extends Thread {

    Soham() {
        this.run();
    }

    void run() {
        System.out.println("soham");
    }
}

public class Solution {
    

    // public void main() {
        
    // }

    public static void main() {
        // circularQueue<int> c = new circularQueue<int>(); -----------------------          invalid 
        circularQueue c = new circularQueue();                                    
        circularQueue<Integer> c1 = new circularQueue<Integer>();                 
        // circularQueue<Integer> c2 = new circularQueue<Integer>(); ---------------------- invalid 

        System.out.println(c);
        System.out.println(c.ref());

        circularQueue rittu = c.ref();
        size_c = 10;
        rittu.size_c = 20;

        System.out.println(c.size_c + rittu.size_c);
        System.out.println(c.data);
        // c.s;

        Integer i = new Integer(10);
        c1.data = i;
        c.data = i;

        String s = new String("pratham");
        c.data  = s;

        System.out.println(c1.data);
        System.out.println(c.data);

        c.det[0] = i;
        c.det[1] = s;
        // c.det[3] = 12;
        c.det[2] = 12;

        System.out.println(c.det[0] + " " + c.det[1] + " " + c.det[2]);


//         pratham@pratham-Swift-SFG14-71:~/all/java$ javac Solution.java
// Note: Solution.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.
// Note: Solution.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// pratham@pratham-Swift-SFG14-71:~/all/java$ 


// also if i not definr waht should be stored or type of object then it dosent care about object type then stores object of different kind 

// pratham@pratham-Swift-SFG14-71:~/all/java$ java Solution.java 
// Solution.java:31: warning: [unchecked] unchecked cast
//         this.det =  (T[]) new Object[3];
//                           ^
//   required: T[]
//   found:    Object[]
//   where T is a type-variable:
//     T extends Object declared in class circularQueue
// Solution.java:64: warning: [deprecation] Integer(int) in Integer has been deprecated
//         Integer i = new Integer(10);
//                     ^
// Solution.java:66: warning: [unchecked] unchecked assignment to variable data as member of raw type circularQueue
//         c.data = i;
//          ^
// Solution.java:69: warning: [unchecked] unchecked assignment to variable data as member of raw type circularQueue
//         c.data  = s;
//          ^
// 4 warnings
// circularQueue@45b9a632
// circularQueue@45b9a632
// 40
// null
// 10
// pratham
// 10 pratham 12
// pratham@pratham-Swift-SFG14-71:~/all/java$ 
        
        // node rittuuu = new circularQueue();
        // System.out.println(rittuuu.ref());

    int[] arr = new int[10];

    Object n = new Object();
    System.out.println(n);
    n = 1;
    System.out.println(n);

    System.out.println(s.getClass());
    System.out.println(i.getClass());


    Thread t = new Thread();
    t.start();

    Soham so = new Soham();

    so.start();
    
    
    
    }

    
}
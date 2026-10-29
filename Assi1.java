
class Person {

String name;
int age;

Person() {

}

Person(String name , int age) {
this.name = name;
this.age = age;
}

Person(Person p) {
this.name = p.name;
this.age = p.age;

}


void display() {
System.out.println("name : " + this.name );
System.out.println("age  : " + this.age + '\n');
}

}


public class Assi1 {

public static void main(String[] args) {

Person p1 = new Person();
p1.name = "pratham";
p1.age = 19;

Person p2 = new Person("rituja",19);
Person p3 = new Person(p2);

p1.display();
p2.display();
p3.display();

} 

}
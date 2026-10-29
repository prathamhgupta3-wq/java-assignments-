import java.util.Scanner;


class City {

String city_name;
long population;

City() {

}

City(String name , long population) {
this.city_name = name;
this.population = population;
}

City(City c) {
this.city_name = c.city_name;
this.population = c.population;
}



void display() {
System.out.println("city name   : " + this.city_name );
System.out.println("pupulation  : " + this.population + '\n');
}

}

public class Assi2 {

public static void main(String[] args) {

City []c = new City[5];

/*
c[0].city_name = null;
c[0].population = 987654;
c[0].display();
*/

c[0] = new City();
c[0].display();
c[0].city_name = "mustang";
c[0].population = 765432;

c[1] = new City("Delhi ",23546);
c[2] = new City("Mumbai ",132456);
c[3] = new City(c[1]);
c[4] = new City(c[2]);


int x = 0;
while(x != 5) {
	c[x].display();
	x++;
}


} 

}

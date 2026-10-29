

import java.io.FileReader;
import java.io.IoException;
import java.util.Scanner;



public class Assi_10 {

public static void main() {
try{
	FileReader re = new FileReader("rittu.txt");
	int ch;
	while((ch = re.read()) != -1) {
	System.out.print((char)ch);
	}
}catch(Exception e){
System.out.println(" file not found ");
}


}

}

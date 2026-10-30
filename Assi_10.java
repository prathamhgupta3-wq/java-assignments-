

import java.io.*;
// import java.io.IOException;
import java.util.Scanner;


public class Assi_10 {
	public static void main(String[] args) {

try {
		BufferedReader br = new BufferedReader(new FileReader("main.log"));
		BufferedWriter re = new BufferedWriter(new FileWriter("render.txt",true));
		int count = 0;
		String line;
		while( (line  = br.readLine()) != null) {
			if(line.contains("[warn]")) {count++;
			System.out.println(line);
			re.write(line + '\n');
			}
		}
re.close();
		System.out.println(count);

		// BufferedWriter re = new BufferedWriter(new FileWriter("render.txt"));
br = new BufferedReader(new FileReader("render.txt"));

		while((line = br.readLine() ) != null ) {
			System.out.println(line);
		}

}catch(Exception e ){
System.out.println(e.getClass() + e.getMessage());

}



	}
}
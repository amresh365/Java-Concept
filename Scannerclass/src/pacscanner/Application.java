package pacscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws FileNotFoundException {
		String myFile="text.txt";
		File file =new File(myFile);
		Scanner text=new Scanner(file);
		int value =text.nextInt();
		System.out.println("value is :"+value);
		while(text.hasNextLine())
		{
			String line=text.nextLine();
			System.out.println(line);
		}
		text.close();
					
	}

}

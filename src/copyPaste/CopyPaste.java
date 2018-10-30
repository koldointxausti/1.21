package copyPaste;

import java.io.*;
import java.util.Scanner;

public class CopyPaste {
	public static void main(String[] args) {
		if (args.length == 2) {
			try {
				String copyFrom = args[0];
				String copyTo = args[1];
				Scanner sc = new Scanner(System.in);
				BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
			    writer.write();
				sc.close();
			//if it doesn't find the file will show this:
			} catch (FileNotFoundException e) {
				System.out.println("You have to enter the path of one text file.");
				System.out.println("You can try with the example I made: example.txt");
			}
		}else {
			System.out.println("Define from what text file to what text file you want to copy-paste the text.");
		}
	}
}

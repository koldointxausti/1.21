package copyPaste;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class CopyPaste {
	public static void main(String[] args) {
		try {
				FileInputStream out = new FileInputStream("originFileToCopy.txt");
				FileOutputStream in = new FileOutputStream("estinyFileToCopy.txt");		
		}catch (FileNotFoundException e){
			System.out.println("File not found");
		}
	}
}

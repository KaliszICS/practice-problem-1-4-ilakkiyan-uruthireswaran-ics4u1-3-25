import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class PracticeProblem {

	public static String getName(int Line, String file) {
		try {
			File newFile = new File(file);
			Scanner scanner = new Scanner(newFile);
			int count = 1;
			while (scanner.hasNextLine()) {
				String nextLine = scanner.nextLine();
				if (count == Line) {
					String[] words = nextLine.split(" ");
					return words[0] + " " + words[1];
				} 
				count++;
			} 
			scanner.close();
		} catch (FileNotFoundException e) {
			return "File Not Found";
		} catch (Exception e) {
			return "Error reading File";
		}
		return "";
	}

	public static int getNumber(int Line, String file) {
		try {
			File newFile = new File(file);
			Scanner scanner = new Scanner(newFile);
			int count = 1;
			while (scanner.hasNextLine()) {
				String nextLine = scanner.nextLine();
				if (count == Line) {
					String[] studentNumber = nextLine.split("\\s+");
					return Integer.parseInt(studentNumber[3]);
				}
				count++;
			} 
			scanner.close();
		} catch (FileNotFoundException e) {
			return -1;
		} catch (Exception e) {
			return -1;
		}
		return -1;
	}

	public static int getAge(int Line, String file) {
		try{
			File newFile = new File(file);
			Scanner newScanner = new Scanner(newFile);
			int count = 1;
			while (newScanner.hasNextLine()) {
				String nextLine = newScanner.nextLine();
				if (count == Line) {
					String[] Age = nextLine.split("\\s+");
					return Integer.parseInt(Age[2]);
				}
				count++;
			}
			newScanner.close();
		} catch (FileNotFoundException e) {
			return -1;
		} catch (Exception e) {
			return -1;
		}
		return -1;
	}

	public static void fileAppend(String output, String filename) {
		try (PrintWriter newWriter = new PrintWriter(new FileWriter(filename, true))){
			
			newWriter.print(output);

			} 
			catch (IOException e) {
				
		}
	}
	
	


	public static void main(String args[]) {
		String result = getName(1, "file.txt");
		System.out.println(result);

		int result2 = getAge(1, "file.txt");
		System.out.println(result2);

		int result3 = getNumber(1, "file.txt");
		System.out.println(result3);

		fileAppend("Hello", "fileAppend.txt");
		
	
	}
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingCSVFiles {

	public static void main(String[] args) {
		
		File dataFile = new File("URL\Countries.csv");
		try {
			Scanner input = new Scanner(dataFile);
			input.useDelimiter(",|\\s+");
			String column1 = input.next();
			String column2 = input.next();
			System.out.printf("%-11s%12s%n", column1, column2);
			while (input.hasNextLine()) {
				String Country = input.next();
				int Population = input.nextInt();
				System.out.printf("%-11s%, 12d%n", Country, Population);
				}
			
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
}

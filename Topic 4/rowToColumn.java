//Noah Canepa, the following code is mine

import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Paths;
	import java.util.Arrays;
	public class rowToColumn {

		public static void main(String[] args) throws IOException {
//creates the array and fills in empty characters with the @ symbol
			String[][] randomText = new String[20][45];
			for (String[] row : randomText)
				Arrays.fill(row, "@");
//gets the input from the following text file
			String input = new String(Files.readAllBytes(Paths.get("C:/Users/Noah C/Downloads/Translate.txt")));
			String[] characters = input.split("");
			int length = characters.length;
			int characterCount = 0, rows = 0, columns = 0, mixCount =0;
			
//uses characters from the text file in order to fill in the array
			while (rows < 20) {
				while (columns < 45 && characterCount != length) {
					randomText[rows][columns] = characters[characterCount];
					columns++;
					characterCount++;
				}
				columns = 0;
				rows++;
			}
			
			rows = 0;
			String[] mix = new String[900];
			String outArray = new String();
			
//fills a new array from the old one in order to mix the output appropriately
			while (columns < 45) {
				while (rows <20) {
					mix[mixCount] = randomText[rows][columns];
					rows++;
					mixCount++;
				}
				rows = 0;
				columns++;
			}
			
			mixCount = 0;
			outArray = mix[mixCount];
			mixCount++;
			
//turns the new array into a string in order to print out later
			while (mixCount < 900) {
				outArray = outArray + mix[mixCount];
				mixCount++;
			}
			
//prints out contents of the text file
			System.out.println(outArray);
		}
	}

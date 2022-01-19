import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteInFile {

	public static void main(String[] args) throws IOException {

		String text = "My name is Pranav. I am 21 years old";

		Path filename = Path.of("C:\\Users\\Pranav\\OneDrive\\Desktop\\New folder\\File\\pranav.txt");

		Files.writeString(filename, text);

		String fileReading = Files.readString(filename);

		System.out.println(fileReading);
	}


}
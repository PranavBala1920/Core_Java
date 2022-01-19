import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {

		try {
			String data = "Hey my name is Pranav Barot. I am 21 years old";
			File file = new File("C:\\Users\\Pranav\\OneDrive\\Desktop\\New folder\\File\\abc.txt");
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fileWritter = new FileWriter(file.getName(), true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWritter);
			bufferedWriter.write(data);
			bufferedWriter.close();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
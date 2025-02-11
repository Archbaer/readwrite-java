import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IdeaReader {
    public String readIdea(String filePath) {
        String fileContents = "";
        File file = new File(filePath);
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] fileContentsAsBytes = inputStream.readAllBytes();
            fileContents = new String(fileContentsAsBytes);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found! Please check the file path and try again!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
        return fileContents;
    }
}

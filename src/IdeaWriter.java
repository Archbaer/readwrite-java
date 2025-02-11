import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IdeaWriter {
    public void writeIdea(String filePath, String fileContents) {
        File file = new File(filePath);
        byte[] fileContentsAsBytes = fileContents.getBytes();
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(fileContentsAsBytes);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found! Please check the path and try again!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}

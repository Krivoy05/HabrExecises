package strings;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public interface ReadFromFile {
    ArrayList<String> readFromTextFile(Path path) throws IOException;
    ArrayList<String> writeToTextFile(Path path) throws IOException;
}

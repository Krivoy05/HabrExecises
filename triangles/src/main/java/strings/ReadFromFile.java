package strings;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public interface ReadFromFile {
    ArrayList<String> readFromTextFile(String path) throws IOException;
    void writeToTextFile(String path) throws IOException;
}

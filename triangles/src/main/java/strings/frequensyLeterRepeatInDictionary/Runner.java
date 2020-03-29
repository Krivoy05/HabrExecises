package strings.frequensyLeterRepeatInDictionary;

import strings.findBiggestStringInArray.Text;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;


public class Runner {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        String filePath = "triangles/src/Dictionary.txt";
        dictionary.readFromTextFile(filePath);
        dictionary.countFrequencyOfLeterRepeat();
        System.out.println(dictionary);

    }

}

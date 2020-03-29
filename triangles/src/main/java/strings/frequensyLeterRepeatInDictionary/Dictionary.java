package strings.frequensyLeterRepeatInDictionary;

import strings.ReadFromFile;

import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Dictionary implements ReadFromFile {
    public ArrayList<String> getDictionary() {
        return dictionary;
    }

    private ArrayList<String> dictionary = new ArrayList<>();
    private HashMap<Character, Integer> leterMap = new HashMap<>();

    public Dictionary() {
    }

    public void setDictionary(ArrayList<String> dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public ArrayList<String> readFromTextFile(String path) {
        try {
            Files.lines(Paths.get(path), StandardCharsets.UTF_8).forEach(dictionary::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dictionary;
    }

    @Override
    public void writeToTextFile(String path) {
        ArrayList<String> letterRepeatFrequencyArray = getLetterRepeatFrequencyArray();
        try {
            Files.write(Paths.get(path),(Iterable<String>) letterRepeatFrequencyArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<Character, Integer> countFrequencyOfLeterRepeat() {
        HashMap<Character, Integer> leterMap = new HashMap<>();
        for (String s : dictionary) {
            String word = s.toLowerCase().trim();
            for (int j = 0; j < word.length(); j++) {
                char letter = word.charAt(j);
                if (!leterMap.containsKey(letter)) {
                    leterMap.put(letter, 1);
                } else {
                    Integer leterRepetCounrter = leterMap.get(letter);
                    leterRepetCounrter++;
                    leterMap.remove(letter);
                    leterMap.put(letter, leterRepetCounrter);
                }
            }
        }

        this.leterMap=leterMap;
        return leterMap;
    }

    private ArrayList<String> getLetterRepeatFrequencyArray(){
        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry entry : leterMap.entrySet()) {
            result.add(entry.getKey() + " " + entry.getValue());
        }
        return result;

    }

    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder();
        for (Map.Entry entry : leterMap.entrySet()) {
            resultString.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
        }
        return resultString.toString();
    }


}

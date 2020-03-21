package strings.frequensyLeterRepeatInDictionary;

import strings.ReadFromFile;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;

public class Dictionary implements ReadFromFile {
    private ArrayList<String> dictionary = new ArrayList<>();
    private  HashMap<Character,Integer> leterMap = new HashMap<>();

    public HashMap<Character, Integer> getLeterMap() {
        return leterMap;
    }

    public void setLeterMap(HashMap<Character, Integer> leterMap) {
        this.leterMap = leterMap;
    }

    public ArrayList<String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(ArrayList<String> dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public ArrayList<String> readFromTextFile(Path path) throws IOException {
        throw new IOException("To do");
    }

    @Override
    public ArrayList<String> writeToTextFile(Path path) throws IOException {
        throw new IOException("To do");
    }

   public HashMap<Character,Integer> countFrequencyOfLeterRepeat(){
       HashMap<Character,Integer> leterMap = new HashMap<>();
        for (int i = 0; i < dictionary.size(); i++) {
            String word = dictionary.get(i).toLowerCase().trim();
            for (int j = 0; j < word.length(); j++) {
                char letter = word.charAt(j);
                if (!leterMap.containsKey(letter)){
                    leterMap.put(letter,1);
                } else {
                    Integer leterRepetCounrter = leterMap.get(letter);
                    leterRepetCounrter++;
                    leterMap.remove(letter);
                    leterMap.put(letter,leterRepetCounrter);
                }
            }
        }

        return leterMap;
    }

    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder();
        for (Map.Entry entry: leterMap.entrySet()) {
            resultString.append (entry.getKey()+" "+entry.getValue());
        }
        return resultString.toString();
    }


}

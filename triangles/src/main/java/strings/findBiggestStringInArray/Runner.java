package strings.findBiggestStringInArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        Text text = new Text();
       //text.setInputedText(text.generateRandomText(1000));
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Ala","ma","kota","sowa"));
        text.setInputedText(arrayList);
        System.out.println(text.findBiggestStrings());

    }
}

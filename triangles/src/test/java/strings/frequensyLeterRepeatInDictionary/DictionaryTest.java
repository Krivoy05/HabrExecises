package strings.frequensyLeterRepeatInDictionary;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {
    @Test
    public void countFrequencyOfLeterRepeatTest(){
        //set
        Dictionary dictionary = new Dictionary();
        //when
        ArrayList<String> dictionaryArray= new ArrayList<>(Arrays.asList("ABC","aaa","b"));
        dictionary.setDictionary(dictionaryArray);
        HashMap<Character, Integer> frequencyOfRepeat = dictionary.countFrequencyOfLeterRepeat();
        //then
        Assertions.assertEquals(4,frequencyOfRepeat.get('a')); //check for a
        Assertions.assertEquals(2,frequencyOfRepeat.get('b')); //check for b
        Assertions.assertEquals(1,frequencyOfRepeat.get('c')); //check for c

    }

}
package strings.findBiggestStringInArray;


import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

class TextTest {
    Text text = null;

    @BeforeEach
    public void BeforeeachTest() {
        text = new Text();
    }

    @Test
    public void findBiggestStrings() {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Ala", "ma", "kota", "sowa"));
        text.setInputedText(arrayList);
        ArrayList biggestStrings = text.findBiggestStrings();
        ArrayList exeptedArray = new ArrayList<>(Arrays.asList("kota", "sowa"));
        Assertions.assertArrayEquals(exeptedArray.toArray(), biggestStrings.toArray());
        // text.setInputedText(text.generateRandomText(1000)); //maks 1024symbols in line
    }

    @Test
    void generateRandomText() {
        text.setInputedText(text.generateRandomText(1000)); //maks 1024symbols in line
        Assertions.assertEquals(1000, text.getInputedText().size());
    }

    @Test
    void isPalindromTest() {
        boolean palingromWithSameCase = text.isPalindrom("AgA",true);
        boolean palingromWithDifferentCase = text.isPalindrom("Aga",false);
        Assertions.assertTrue(palingromWithDifferentCase);
        Assertions.assertTrue(palingromWithSameCase);
    }
}
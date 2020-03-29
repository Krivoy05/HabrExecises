package strings.findBiggestStringInArray;

import java.util.*;

public class Text {
    private ArrayList<String> inputedText = new ArrayList<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return inputedText.equals(text.inputedText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputedText);
    }

    public ArrayList<String> findBiggestStrings() {
        Map<Integer, ArrayList<String>> mapOfStrings = new HashMap<>();
        for (String str : inputedText) {
            Integer strLength = str.length();
            if (!mapOfStrings.containsKey(strLength)) {
                ArrayList<String> buff = new ArrayList<>();
                buff.add(str);
                mapOfStrings.put(strLength, buff);
            } else {
                ArrayList<String> bufferArray = (ArrayList<String>) mapOfStrings.get(strLength).clone();
                bufferArray.add(str);
                mapOfStrings.remove(strLength);
                mapOfStrings.put(strLength, bufferArray);
            }
        }
        Integer key = Collections.max(mapOfStrings.entrySet(), Map.Entry.comparingByKey()).getKey();
        return mapOfStrings.get(key);

    }

    public boolean isPalindrom(String inputString,boolean caseSensitive) {
        String reversedString="";
        if (!caseSensitive){
            inputString=inputString.toLowerCase();
        }
        for (int i = inputString.length()-1; i >=0; i--) {
            reversedString+=inputString.charAt(i);
        }
    return inputString.contentEquals(reversedString);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (String text : inputedText) {
            System.out.println(text + "\n");
            stringBuffer.append(text + "\n");
        }
        return stringBuffer.toString();
    }

    public ArrayList<String> getInputedText() {
        return inputedText;
    }

    public void setInputedText(ArrayList<String> inputedText) {
        this.inputedText = inputedText;
    }

    public ArrayList<String> generateRandomText(int lineNumber) {
        ArrayList<String> resultRandomList = new ArrayList<>();
        for (int i = 0; i < lineNumber; i++) {
            resultRandomList.add(generateSomeRandomText());
        }
        return resultRandomList;
    }

    private String generateSomeRandomText() {
        Random random = new Random();
        int randomNumberOfSymbols = random.nextInt(1024);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < randomNumberOfSymbols; i++) {
            stringBuilder.append((char) random.nextInt(255));
        }
        return stringBuilder.toString();
    }


}

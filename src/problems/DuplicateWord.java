package problems;
import java.util.HashMap;
import java.util.Map;


public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Map<String, Integer> wordMap = new HashMap<>();
        String[] splitWords = st.split(" ");

        for (String word : splitWords) {
            Integer count = wordMap.get(splitWords);
            if (count == null) {
                count = 0;
            }
            wordMap.put(word, count + 1);
        }

        for (Map.Entry<String, Integer> j : wordMap.entrySet()) {
            System.out.println(j.getKey() + " : " + j.getValue() + " time(s)");

        }

    }
}

package treemapexample;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class WordCountWithTreeMap {
    public static void main(String[] args) {
        String text = "Java is great and Java is powerful. I love Java programming.";

        text = text.toLowerCase();

        text = text.replaceAll("[^a-zA-Z0-9\\s]", "");

        String[] words = text.split("\\s+");

        Map<String, Integer> wordMap = new TreeMap<>();

        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        System.out.println("Từ\t\tSố lần xuất hiện");
        System.out.println("___________________________");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.printf("%-10s : %d%n", entry.getKey(), entry.getValue());
        }
    }
}

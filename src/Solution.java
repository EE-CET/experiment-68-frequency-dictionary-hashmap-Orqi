import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().trim();
        String[] words = text.split("\\s+");

        TreeMap<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String key : map.keySet()) {
            System.out.print(key + ": " + map.get(key));
            if (!key.equals(map.lastKey())) {
                System.out.print("\n");
            }
        }

        scanner.close();
    }
}
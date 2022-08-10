import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WorksWithCharacter {

    public Map<Character, Long> countDuplecateCharcter(String str){ //Задача №1
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }
    public char firstNonRepeartedCharacter(String str){ //Задача №2
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            chars.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        for(Map.Entry<Character, Integer> entry : chars.entrySet()){
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return  Character.MIN_VALUE;
    }
    public String reverseWords(String str){ //Задача №3
        Pattern pattern = Pattern.compile(" +");
        return  pattern.splitAsStream(str)
                .map(w -> new StringBuffer(w).reverse())
                .collect(Collectors.joining(" "));
    }
}

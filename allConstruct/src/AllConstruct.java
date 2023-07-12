import java.util.ArrayList;
import java.util.List;

public class AllConstruct {
    

    public static List<List<String>> add(String target, String[] wordBank) {
        List<List<String>> result = new ArrayList<>();

        if (target.equals("")) {
            result.add(new ArrayList<>());
            return result;
        }

        for (String word : wordBank) {
            if (target.indexOf(word) == 0) {
                String suffix = target.substring(word.length());
                List<List<String>> suffixWays = add(suffix, wordBank);
                for (List<String> way : suffixWays) {
                    List<String> targetWays = new ArrayList<>(way);
                    targetWays.add(0, word);
                    result.add(targetWays);
                }
            }
        }

        return result;
    }
}

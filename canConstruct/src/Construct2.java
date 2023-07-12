import java.util.HashMap;

public class Construct2 {
    
    // hmmm how to memoize this

    public static boolean canConstruct(String target, String[] wordBank, HashMap<String, Boolean> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target.equals("")) return true;

        for (String i : wordBank) {
            if (target.indexOf(i) == 0) {
                String suffix = target.substring(i.length());
                if (canConstruct(suffix, wordBank, memo)) {
                    memo.put(target, true);
                    return true;
                }
            }
        }

        memo.put(target, false);
        return false;
    }    
}   


import java.util.HashMap;
import java.util.Map;

public class GridTraveler {

    private static Map<String, Long> memo = new HashMap<>();

    public static long grid(int m, int n) {

        String key = m + "," + n;
        
        if (memo.containsKey(key)) return memo.get(key);
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;

        long result = grid(m - 1, n) + grid(m, n - 1);
        memo.put(key, result);
        return result;
    }
}

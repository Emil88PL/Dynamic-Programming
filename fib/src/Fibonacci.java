import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fib(int n) {
        if (memo.containsKey(n))
            return memo.get(n);

        if (n <= 2)
            return 1;

        int result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }

}

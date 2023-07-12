import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {


        String[] wordBank = {"ab", "abc", "cd", "def", "abcd"};
        System.out.println(Construct.canConstruct("abcdef", wordBank));
        System.out.println(countConstruct.count("abcdef", wordBank));


        String[] wordBank2 = {"bo", "rd","ate", "t","ska", "sk", "boar"};
        System.out.println(Construct.canConstruct("skateboard", wordBank2));

        String[] wordBank3 = {"nu", "ull", "ll"};
        System.out.println(Construct.canConstruct("null", wordBank3));

        String[] wordBank333 = {"e", "ee", "eee", "eeee", "eeeee", "eeeeee"};
        System.out.println(Construct.canConstruct("eeeeeeeeeeeeeeef", wordBank333));
        System.out.println(countConstruct.count("null", wordBank333));

        HashMap<String, Boolean> memo3 = new HashMap<>();
        String[] wordBank4 = {"e", "ee", "eee", "eeee", "eeee", "eeeee", "eeeeee"};
        System.out.println(Construct2.canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", wordBank4, memo3));
        System.out.println(countConstruct.count("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", wordBank4)); // need memoization
    }
}

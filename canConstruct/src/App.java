public class App {
    public static void main(String[] args) throws Exception {


        String[] wordBank = {"ab", "abc", "cd", "def", "abcd"};
        System.out.println(Construct.canConstruct("abcdef", wordBank));


        String[] wordBank2 = {"bo", "rd","ate", "t","ska", "sk", "boar"};
        System.out.println(Construct.canConstruct("skateboard", wordBank2));

        String[] wordBank3 = {"nu", "ull", "ll"};
        System.out.println(Construct.canConstruct("null", wordBank3));
    }
}

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        String target = "example";
        String[] wordBank = {"ex", "amp", "le", "e"};

        List<List<String>> result = AllConstruct.add(target, wordBank);
        System.out.println(result);


        String[] wordBank2 = {"purp", "p", "ur", "le", "purpl"};
        List<List<String>> result2 = AllConstruct.add("purple", wordBank2);
        System.out.println(result2);




    }
    
}

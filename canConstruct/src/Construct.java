public class Construct {
    

    public static boolean canConstruct(String target, String[] wordBank) {
        if (target == "") {return true;}

        for (String i : wordBank) {
            if (target.indexOf(i) == 0) {
                String suffix = target.substring(i.length());
                if (canConstruct(suffix, wordBank)) {
                    return true;
                }
            }
        }

        return false;
    }
}

public class countConstruct {
    

    public static int count(String target, String[] wordBank) {

        if (target == "" ) return 1;

        int totalCount = 0;

        for (String word : wordBank) {
            if (target.indexOf(word) == 0) {
                int numWaysForRest = count(target.substring(word.length()), wordBank);
                totalCount += numWaysForRest;
            }
        }
        return totalCount;
    }
}

public class CanSum {
    

    public static boolean sum(int targetSum, int[] numbers) {

        if (targetSum == 0) return true;
        if (targetSum < 0) return false;

        for (int i : numbers) {
            int remainder = targetSum - i;
            if (sum(remainder, numbers) == true) {
                return true;
            }
        }
        return false;
    }
}

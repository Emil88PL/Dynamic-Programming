public class CanSum1 {
    

    public static boolean sum(int targetSum, int[] numbers) {

        if (targetSum == 0) return true;
        if (targetSum < 0) return false;
    
        for (int i : numbers) {
            int remainder = targetSum - i;
            if (sum(remainder, numbersWithExclusion(numbers, i)) == true) {
                return true;
            }
        }
        return false;
    }
    
    private static int[] numbersWithExclusion(int[] numbers, int exclude) {
        
        int[] updatedNumbers = new int[numbers.length - 1];
        int index = 0;
        for (int i : numbers) {
            if (i != exclude) {
                updatedNumbers[index] = i;
                index++;
            }
        }
        return updatedNumbers;
    }
}

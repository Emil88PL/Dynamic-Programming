public class App {
    public static void main(String[] args) throws Exception {
        

   
        int[] numbers0 = {2, 3};
        System.out.println(CanSum.sum(7, numbers0));

        int[] numbers1 = {5, 3, 4, 7};
        System.out.println(CanSum.sum(7, numbers1));

        int[] numbers2 = {2, 4};
        System.out.println(CanSum.sum(7, numbers2));

        int[] numbers3 = {2, 3, 5};
        System.out.println(CanSum.sum(8, numbers3));
        
        int[] numbers4 = {7, 14};
        System.out.println(CanSum.sum(300, numbers4));

        // Using memoization 
        System.out.println("Using memoization:");
        int[] numbers5 = {7, 14};
        System.out.println(CanSum1.sum(300, numbers5));
        int[] numbers6 = {7, 14, 15};
        System.out.println(CanSum1.sum(500, numbers6));
    }
}

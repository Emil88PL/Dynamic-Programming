public class App {
    public static void main(String[] args) throws Exception {
        
        final long startTime = System.nanoTime();
        System.out.println("Start clean");
        int count = 20;  // The number of Fibonacci numbers to print
        for (int i = 0; i < count; i++) {
            int fibNumber = Fibionacci0.fib(i);
            System.out.print(fibNumber + " ");
        }
        System.out.println("Done clean one");
        final long duration = System.nanoTime() - startTime;

        final long startTime2 = System.nanoTime();
        System.out.println("Start with memo");
        int n = 60;  // The number to calculate Fibonacci for
        for (int i = 1; i <= n; i++) {
            int fibNumber = Fibonacci.fib(i);
            System.out.print(fibNumber + " ");
        }
        System.out.println("Done memo one");

        // final long duration2 = System.nanoTime() - startTime2;
        // System.out.println(duration);
        // System.out.println(duration2);

        

    }
  

}

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class SockMerchand {

    // Complete the sockMerchant function below.
    static long sockMerchant(int n, int[] ar) {
        
        // Predicate<Integer> sockCondition = new Predicate<Integer>() 
        // {
        //     @Override
        //     public boolean test(Integer a, Integer b ) {
        //         if (a % 2 == 0) {
        //             return true;
        //         }
        //         return false;
        //     }
        // };
        List<Integer> lstPairs = Arrays.stream(ar).boxed().collect(Collectors.toList());
        Map<Object, Long> map = lstPairs.stream()
      .collect( Collectors.groupingBy (i -> i, Collectors.counting() ) );
        long count = 0;
        System.out.println("map..");
        System.out.println(map);
        // count = (long) lstPairs.stream().sorted()
        // .collect( Collectors.groupingBy (i -> i, Collectors.counting() ) ).values().
        // stream().filter(i->(float)i/2>1.1).peek(System.out::println).
        // collect(ArrayList::new, ArrayList::add, ArrayList::addAll).get(0);

count = (long) lstPairs.stream().sorted()
.collect( Collectors.groupingBy (i -> i, Collectors.counting() ) ).values().
stream().mapToLong(a-> a/2).sum();

        return (int)count;
    }

    // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        // int n = 9;
        int n = 10;
        // int n = 15;
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        // int[] arItems = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
        int[] arItems = { 1, 1, 3, 1, 2, 1, 3, 3, 3, 3 };
        // int[] arItems = { 6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            ar[i] = arItems[i];
        }

        long result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayManipulation {

    public static void main(String[] args) throws Exception {


        int[] arr = new int[]{2,4,3,1,6,8,7,1};

        int secondMin = Arrays.stream(arr)
        .distinct().sorted().skip(1).findFirst()
                .orElseThrow(() -> new Exception("Second Smallest not found"));
        System.out.println("Second smallest element "+secondMin);

        System.out.println("find common element between two arrays");
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        Arrays.stream(arr1).filter(n -> Arrays.stream(arr2).anyMatch(n2 -> n == n2))
                .forEach(System.out::println);

        System.out.println("reverse an array");

        IntStream.range(0,arr1.length/2).forEach( i -> {
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = temp;
        });

        System.out.println("Reverse array "+Arrays.toString(arr1));

        System.out.println("Length of longest string in array");

        String[] fruits = new String[]{"Apple","Banana", "Mango", "Pineapple"};

        int maxLength = Arrays.stream(fruits).mapToInt(s -> s.length()).max().orElse(0);
        System.out.println("Max lenght "+maxLength);







    }


}

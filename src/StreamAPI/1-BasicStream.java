import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class A{
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4,5,9,8,6);
        nums.forEach(n -> System.out.println(n));


        Stream<Integer> data = nums.stream();
        //data.forEach(n->System.out.println(n));

        //Once we consume it (terminal operation is done),
        //we can not reuse the stream 

        //long cnt = data.count(); //terminal op
        //System.out.println(cnt);

        System.out.println("Sort data");
        Stream<Integer> sortedData = data.sorted();
        sortedData.forEach(n -> System.out.println(n));

        //sort + double values 
        System.out.println("Double entries");
        Stream<Integer> data2 = nums.stream();
        data2.sorted()
        .map(n -> n*2)
        .forEach(n -> System.out.println(n));

        //Distinct values 
        System.out.println("Distinct ");
        List<Integer> list = Arrays.asList(1,2,3,4,3,5,6,8,7,6);
        Stream<Integer> str2 = list.stream();
        List<Integer> disticntStr = str2.distinct().collect(Collectors.toList());
        disticntStr.forEach(n -> System.out.println(n));

        Set<Integer> s = new HashSet<Integer>();
        list.stream()
        .filter(n -> s.add(n))
        .forEach(n -> System.out.println("Distinct "+n));
    

        //Filter Values Odd Numbers 
        System.out.println("Filter Odd numbers");
        List<Integer> list3 = Arrays.asList(1,2,3,4,3,5,6,8,7,6);
        list3.stream()
        .filter(n -> n%2 == 1)
        .forEach(n -> System.out.println(n));

        //Sum of all elements
        int sum = list3.stream()
        .reduce(0, (c,e) -> c+e);
        System.out.println("Sum of all in list3 is " + sum);

    }
}
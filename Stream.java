import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main (String []args) {

    // 1 task
    List <String> myList = new ArrayList<String>();
    myList.add("april");
    myList.add("august");
    myList.add("may");
    myList.add("october");
    myList.add("december");

    myList.stream().filter(x-> x.startsWith("a")).map(String::toUpperCase).forEach(System.out::println);

    // 2 task

        List <Integer> myListWithNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long count = myListWithNumbers.stream().filter(x-> x%2==0).count();
        System.out.println(count);

}}

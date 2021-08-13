package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task1Collection {

    public static void main (String []args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("лето");
        list.add("море");
        list.add("красота");
        list.add("любовь");
        list.add("июль");
        list.add("лабиринт");

        ListIterator<String> listIter = list.listIterator();

        while (listIter.hasNext() ) {
            String str = listIter.next();
            boolean isL = str.contains("л");
            boolean isR = str.contains("р");
            boolean isRandL = str.contains("р") && str.contains("л");
            if (isR && !isRandL) {
             listIter.remove();
            } else if (isL && !isRandL) {
            listIter.add(str); }

        }for (String item : list) {
            System.out.println(item); } }}




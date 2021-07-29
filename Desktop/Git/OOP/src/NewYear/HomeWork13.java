package NewYear;


import static NewYear.Sweet.count;

public class HomeWork13 {

    public static void main(String[] args) {

// 1ый вариант
        Sweet sweet8 = new Lollipop("Wow", 115.00, "WowShop", false, false);
        Sweet sweet4 = new Sweet("Candyworld", 88.20, "CC");
        Sweet sweet5 = new Sweet("Candy", 20.56, "Candy");
        Sweet sweet6 = new Sweet("Candy", 20.56, "Candy");
        Sweet sweet7 = new Sweet("Candy", 20.56, "Candy");

        Sweet[] array1 = new Sweet[count];
        System.out.println("длина массива " + array1.length);

        array1[0] = sweet8;
        array1[1] = sweet4;
        array1[2] = sweet5;
        array1[3] = sweet6;
        array1[4] = sweet7;

// 2ой вариант
       /* Sweet sweet = new Sweet("Candy", 20.56, "Candy");
        Sweet[] array = new Sweet[count];
        array [count-1] = sweet;
        System.out.println("длина массива "+array.length);
        System.out.println(array[count-1].toString());


        Sweet sweet2 = new Candy("BonBon", 60.00, "Lolpop", true);
        array = new Sweet[count];
        array [count-2] = sweet;
        array [count-1] = sweet2;
        System.out.println("длина массива "+ array.length);
        System.out.println(array[count-1].toString());

        Sweet sweet1 = new Lollipop("ChupaChups", 15.00, "Rocho", true, true);
        array = new Sweet[count];
        array [count-3] = sweet;
        array [count-2] = sweet2;
        array [count-1] = sweet1;
        System.out.println("длина массива "+ array.length);
        System.out.println(array[count-3].toString());
        System.out.println(array[count-2].toString());
        System.out.println(array[count-3].toString());

        Sweet sweet3 = new Lollipop("ChupaChups", 15.00, "Rocho", true, true);
        array = new Sweet[count];
        array [count-4] = sweet3;
        array [count-3] = sweet;
        array [count-2] = sweet2;
        array [count-1] = sweet1;
        System.out.println("длина массива "+ array.length);
        System.out.println(array[count-4].toString());
        System.out.println(array[count-3].toString());
        System.out.println(array[count-2].toString());
        System.out.println(array[count-3].toString());*/


        }
    }


package Homework_Files;

import java.util.Comparator;

public class HouseCompare implements Comparator <House> {

    public int compare (House o1, House os){
        if (o1.area == os.area){
            return 0;
        } else if (o1.area < os.area){
            return -1;
        } else
            return 1;
    }


    }



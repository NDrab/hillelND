package NewYear;

public class Main {

        public  static void main (String [] args){
            Candy candyA = new Candy("Cow", 100.00, "Koko", true);
            Candy candyB = new Candy("Crown", 120.20, "Rafl", false);
            Sweet sweetA = new Sweet("Beauty", 120.10, "NewLife");
            Sweet sweetB = new Sweet("Mars", 20.00, "Sweet");
            Lollipop lollipopA = new Lollipop("Chupa", 55.50, "ASV", true, true);
            Lollipop lollipopB = new Lollipop("Chups", 70.10, "TTT", false, false);

       double totalWeight = candyA.weight+ candyB.weight+sweetA.weight+ sweetB.weight+ lollipopA.weight+ lollipopB.weight;
         String format = String.format("Общий вес конфет %1$,.2f грамм ",totalWeight );
            System.out.println(format);
        }

    }



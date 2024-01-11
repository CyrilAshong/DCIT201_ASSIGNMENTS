import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car myHybrid = new Car(50);

        myHybrid.addGas(40);
        myHybrid.drive(50);

        Student cyril = new Student("Cyril", 90);

        cyril.addQuiz(75);
        cyril.getAverageScore();

//        ArrayList<Country> countries = new ArrayList<>();
//
//        countries.add(new Country("USA", 100000, 3500));
//        countries.add(new Country("Ghana", 30000, 350));
//
//        Country largestAreaCountry = findLargest(countries, "area");
//        System.out.println("Country with the largest area: " + largestAreaCountry.getCountryName());
//    }

      }
}

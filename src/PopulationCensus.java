import java.util.HashMap;
import java.util.Map;

public class PopulationCensus {
    public static Map<String, String> createMap() {
        Map<String, String> population = new HashMap<>();
            String firstName[] = {"Max", "Ivan", "Fedor", "Artur", "Egor", "Stepan", "Solan", "Nepal", "Krot", "Pop"};
            String lastName[] = {"Nejev", "Evnov", "Trors", "Forov", "Ivanov", "Stepanov", "Igov", "Egov", "Stepanov1", "Popov"};
            for(int i = 0; i < 10; i++) {
                population.put(lastName[i], firstName[i]);
            }
        System.out.println(population);
        return population;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countSFN = 0;
        for (String key: map.keySet()) {
            if (map.get(key) == name) {
                countSFN++;
            }
        }
        return countSFN;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countSLN = 0;
        for (String key: map.keySet()) {
            if (key == lastName) {
                countSLN++;
            }
        }
        return countSLN;
    }

    public static void main(String[] args) {
        createMap();
    }
}

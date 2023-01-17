import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MinimunNumbersInList {

        public static void main(String[] args) throws Exception {
            List<Integer> integerList = getIntegerList();
            try {
                System.out.println(getMinimum(integerList));
                System.out.println("Размер " + integerList.size());
            } catch (IndexOutOfBoundsException e) {
                throw new IndexOutOfBoundsException("Индекс явно меньше 1 точно " + e);
            }
        }

        public static int getMinimum(List<Integer> array) {
            int minimum = array.get(0);
            for (Integer integer : array) {
                if (integer < minimum) {
                    minimum = integer;
                }
            }
            return minimum;
        }

        public static List<Integer> getIntegerList() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int N = Integer.parseInt(reader.readLine());
                ArrayList<Integer> numbers = new ArrayList<>();
                if (N > 0) {
                    for (int i = 0; i < N; i++) {
                        int number = Integer.parseInt(reader.readLine());
                        numbers.add(number);
                    }
                } else {
                    System.out.println("Count of numbs in list less than 0 " + numbers);
                }
                return numbers;
        }
}
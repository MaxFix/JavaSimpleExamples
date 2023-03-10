import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseSortNumbers {

/*
Пять победителей
*/
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int[] array = new int[20];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(reader.readLine());
            }

            sort(array);

            System.out.println(array[0]);
            System.out.println(array[1]);
            System.out.println(array[2]);
            System.out.println(array[3]);
            System.out.println(array[4]);
        }
        public static void sort(int[] array) {
            Arrays.sort(array);
            for(int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        }
}

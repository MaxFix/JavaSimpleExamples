import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());


        ArrayList<String> words = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            String word = reader.readLine();
            words.add(word);
        }

        for(int i = 0; i < M; i++) {
            words.add(words.get(0));
            words.remove(0);
        }

        for(String word: words) {
            System.out.println(word);
        }
    }
}

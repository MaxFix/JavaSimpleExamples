import java.util.ArrayList;

public class IncludeLetters {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        String letterR = "р";
        String letterL = "л";

        ArrayList<String> result = new ArrayList<>();
        for(String string: strings) {
            if(string.contains(letterR)&&!(string.contains(letterL))){
                continue;
            } else if(string.contains(letterL)&&!string.contains(letterR)){
                result.add(string);
            }
                result.add(string);
        }
        return result;
    }
}

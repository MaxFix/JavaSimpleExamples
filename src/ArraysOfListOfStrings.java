import java.util.ArrayList;

public class ArraysOfListOfStrings {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList[] createList() {
        ArrayList<String>[] array = new ArrayList[3];
        array[0] = new ArrayList<>();
        array[1] = new ArrayList<>();
        array[2] = new ArrayList<>();

        array[0].add("lom");
        array[1].add("proso");
        array[2].add("gnom");

        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}

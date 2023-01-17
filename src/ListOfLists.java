import java.util.ArrayList;

public class ListOfLists {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> a = new ArrayList<>();

        a.add(new int[] {2, 3, 1, 0, 4});
        a.add(new int[] {22, 33});
        a.add(new int[] {22, 23, 21, 23});
        a.add(new int[] {27, 63, 41, 70, 64, 12, 44});
        a.add(new int[] {});

        return a;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}

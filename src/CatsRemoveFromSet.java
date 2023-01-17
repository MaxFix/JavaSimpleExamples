import java.util.HashSet;
import java.util.Set;

public class CatsRemoveFromSet {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.iterator().next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> myHashSet = new HashSet<>();
        myHashSet.add(new Cat());
        myHashSet.add(new Cat());
        myHashSet.add(new Cat());
        return myHashSet;
    }

    public static void printCats(Set<Cat> cats) {
        for(Cat text: cats) {
            System.out.println(text);
        }
    }
    public static class Cat {
    }
}
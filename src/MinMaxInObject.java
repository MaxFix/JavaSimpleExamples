public class MinMaxInObject {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        int max = 0;
        int min = 0;
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        } else {
            for (int j : inputArray) {
                if (j > max) {
                    max = j;
                } else if (j < min) {
                    min = j;
                }
            }
        }
        return new Pair(min, max);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}

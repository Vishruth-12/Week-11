public class QueueInOrder {
    static int firstBreak(int[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i] < tokens[i - 1]) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 5, 8, 6, 9};
        System.out.println(firstBreak(a));

        int[] b = {1, 2, 2, 7};
        System.out.println(firstBreak(b));

        int[] c = {2, 4, 3, 5}; // Own test
        System.out.println(firstBreak(c));
    }
}

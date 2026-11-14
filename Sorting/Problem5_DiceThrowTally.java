import java.util.Arrays;

public class DiceThrowTally {
    static int[] diceSort(int[] rolls) {
        int[] count = new int[7];

        for (int roll : rolls) {
            if (roll < 1 || roll > 6)
                throw new IllegalArgumentException("Each roll must be from 1 to 6");
            count[roll]++;
        }

        System.out.print("Counts: ");
        for (int i = 1; i <= 6; i++)
            System.out.print(i + ":" + count[i] + (i == 6 ? "\n" : " "));

        int[] sorted = new int[rolls.length];
        int index = 0;
        for (int value = 1; value <= 6; value++) {
            for (int j = 0; j < count[value]; j++)
                sorted[index++] = value;
        }
        return sorted;
    }

    public static void main(String[] args) {
        System.out.println("Sorted: " + Arrays.toString(
            diceSort(new int[]{4, 1, 6, 4, 2, 1, 4})));

        System.out.println("Sorted: " + Arrays.toString(
            diceSort(new int[]{6, 3, 3, 1, 5}))); // Own test
    }
}

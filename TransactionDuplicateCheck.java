import java.util.HashSet;

public class TransactionDuplicateCheck {
    static boolean hasDuplicate(String[] transactionIds) {
        HashSet<String> seen = new HashSet<>();
        for (String id : transactionIds)
            if (!seen.add(id)) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicate(new String[]{
            "TXN1001", "TXN1002", "TXN1003", "TXN1002", "TXN1004"}));
        System.out.println(hasDuplicate(new String[]{
            "TXN2001", "TXN2002", "TXN2003"}));
        System.out.println(hasDuplicate(new String[]{"A", "B", "C", "A"})); // Own test
    }
}
// Average: O(n) time and O(n) space. Sorting uses O(n log n) time and can use less
// auxiliary memory; nested loops use O(n^2) time and O(1) extra space.

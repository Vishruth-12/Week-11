import java.util.HashMap;
import java.util.Map;

public class EmployeeIdLookup {
    static Map<String, String> buildLookup(String[][] records) {
        Map<String, String> lookup = new HashMap<>();
        for (String[] record : records) lookup.put(record[0], record[1]);
        return lookup;
    }

    static String getDepartment(Map<String, String> lookup, String employeeId) {
        return lookup.getOrDefault(employeeId, "Unknown");
    }

    public static void main(String[] args) {
        String[][] records = {
            {"E245", "Finance"}, {"E110", "Engineering"},
            {"E390", "Marketing"}, {"E101", "Engineering"}
        };
        Map<String, String> lookup = buildLookup(records);
        System.out.println(getDepartment(lookup, "E390"));
        System.out.println(getDepartment(lookup, "E999"));
        System.out.println(getDepartment(lookup, "E245")); // Own test
    }
}
// Building: O(n) average time; each lookup: O(1) average time; space: O(n).

import java.util.HashMap;
import java.util.Map;

public class MapTester {
    private Map<String, String> students;

    public MapTester() {
        students = new HashMap<>();
    }

    public void enterNumber(String name, String number) {
        students.put(name, number);
    }

    public String toString() {
        return students.toString();
    }

    public boolean hasStudent(String name) {
        if (!students.containsKey(name)) {
            return false;
        }
        return true;
    }

    public void printStudentsName() {
        System.out.println(students.keySet());
    }

    public String lookupNumber(String name) {
        return students.get(name);
    }

}

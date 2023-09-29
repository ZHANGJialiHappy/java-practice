import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab {
    private String name;
    private int capacity;
    private Set<String> availableEquipment;
    private Map<Student, Set<String>> studentEquipment;

    public Lab(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        availableEquipment = new HashSet<>();
        studentEquipment = new HashMap<>();
    }

    public void addEquipment(String equipment) {
        availableEquipment.add(equipment);
    }

    public boolean bookEquipment(Student student, String equipmentName) {
        if (!availableEquipment.contains(equipmentName)) {
            return false;
        }
        if (studentEquipment.containsKey(student)) {
            studentEquipment.get(student).add(equipmentName);
            availableEquipment.remove(equipmentName);
            return true;
        } else {
            Set<String> booked = new HashSet<>();
            booked.add(equipmentName);
            studentEquipment.put(student, booked);
            return true;
        }
    }

    public void returnEquipment(Student student) {
        if (studentEquipment.containsKey(student)) {
            Set<String> bookedEquipment = studentEquipment.get(student);
            for (String equipment : bookedEquipment) {
                availableEquipment.add(equipment);
                studentEquipment.remove(student);
            }
        }
    }

    public String checkEquipment(Student student) {
        Set<String> aStudentEquipment = studentEquipment.get(student);
        if (aStudentEquipment == null)
            return "no equipment";
        return aStudentEquipment.toString();
    }
}

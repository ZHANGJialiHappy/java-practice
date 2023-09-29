public class Main {
    public static void main(String[] args) {
        Lab lab1 = new Lab("lab1", 20);
        Student jiali = new Student("jiali");
        lab1.addEquipment("p");
        lab1.addEquipment("s");
        lab1.bookEquipment(jiali, "p");
        lab1.returnEquipment(jiali);
        System.out.println(lab1.checkEquipment(jiali));
    }

}

public class Main {
    public static void main(String[] args) {
        Lab lab1 = new Lab("lab1", 20);
        lab1.addEquipment("p");
        lab1.addEquipment("s");
        lab1.bookEquipment(new Student("jiali"), "p");
    }

}

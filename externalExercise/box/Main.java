public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(15, "a");
        Box box2 = new Box(4, "b");
        Box box3 = new Box(7, "c");
        Robot robot1 = new Robot();
        robot1.addToTransferList(box1);
        robot1.addToTransferList(box2);
        robot1.addToTransferList(box3);
        robot1.moveForward(box1, 2);
        robot1.printTransferList();
    }

}

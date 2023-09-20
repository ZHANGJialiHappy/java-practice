import java.util.ArrayList;

public class Robot {

    private ArrayList<Box> transferList;

    public Robot() {
        transferList = new ArrayList<>();
    }

    public void addToTransferList(Box box) {
        transferList.add(box);
    }

    public void printTransferList() {
        for (Box box : transferList) {
            System.out.println(box.toString());
        }
    }

    public void moveForward(Box box, int steps) {
        int position = box.getPosition();
        int destination = box.getDestination();
        if (position < destination) {
            int newPosition = position + steps;
            if (newPosition > destination) {
                box.setPosition(destination);
            } else {
                box.setPosition(newPosition);
            }
        }
    }
}

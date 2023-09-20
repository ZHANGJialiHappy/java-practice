public class Box {
    private int position;
    private int destination;
    private String label;

    public Box(int destination, String label) {
        this.destination = destination;
        this.label = label;
        position = 0;
    }

    public int getPosition() {
        return position;
    }

    public int getDestination() {
        return destination;
    }

    public String getLabel() {
        return label;
    }

    public void setPosition(int position) {
        if (position < 0 || position > destination)
            return;
        this.position = position;
    }

    public String toString() {
        return "position: " + position + ", label: " + label;
    }

}

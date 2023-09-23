import java.util.Random;

public class RandomTester {
    private Random number;

    public RandomTester() {
        number = new Random();
    }

    public int throwDie(int min, int max) {
        return this.number.nextInt(max - min + 1) + min;
    }

}

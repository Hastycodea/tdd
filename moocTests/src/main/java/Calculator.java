public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void add(int value) {
        this.value += value;
    }

    public void subtract(int value) {
        this.value -= value;
    }

    public int getValue() {
        return value;
    }
}

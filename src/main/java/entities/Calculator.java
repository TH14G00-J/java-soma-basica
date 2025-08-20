package entities;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public boolean isValidAnswer(Character answer) {
        return answer == 'N' || answer == 'Y';
    }
}

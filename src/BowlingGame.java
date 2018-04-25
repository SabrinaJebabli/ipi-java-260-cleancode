public class BowlingGame {

    private int score;

    public int score() {
        return score;
    }

    public void roll(int numberPins) {
        score += numberPins;
    }
}
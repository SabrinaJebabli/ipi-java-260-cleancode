import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BowlingGameTest {

    BowlingGame game = new BowlingGame();

    @Test
    public void queDesGoutieresDonne0Points() {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void uneSeuleQuille(){
        game.roll(1);
        rollMany(19, 0);
        assertEquals(1, game.score());
    }

    @Test
    public void bonusDuSpare(){
        game.roll(8);
        game.roll(2);
        game.roll(1);
        rollMany(17, 0);
        assertEquals(12, game.score());
    }

    @Test
    public void bonusDuStrike(){
        game.roll(10);
        game.roll(5);
        game.roll(2);
        rollMany(15,0);
        assertEquals(24,game.score());
    }

    @Test
    public void queDesStrikes(){
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        rollMany(22,0);
        assertEquals(300,game.score());

    }

    private void rollMany(int numberRolls, int numberPins) {
        for (int i = 0; i < numberRolls; i++) {
            game.roll(numberPins);
        }
    }
}
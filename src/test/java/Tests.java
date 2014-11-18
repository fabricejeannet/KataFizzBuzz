import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by fabricejeannet on 18/11/14.
 */
public class Tests {

    @Test
    public void recognizeTheGivenNumberIsMultipleOfThree() {
        Game game = new Game();

        game.currentNumber = 9;

        assertThat(game.currentNumberIsMultipleOfThree()).isTrue();
    }


    @Test
    public void recognizeTheGivenNumberisNotMultipleOfThree() {
        Game game = new Game();

        game.currentNumber = 7;

        assertThat(game.currentNumberIsMultipleOfThree()).isFalse();
    }


    @Test
    public void recognizeTheGivenNumberisMultipleOfFive() {
        Game game = new Game();

        game.currentNumber = 5;

        assertThat(game.currentNumberIsMultipleOfFive()).isTrue();
    }

    @Test
    public void recognizeTheGivenNumberIsNotMultipleOfFive() {
        Game game = new Game();

        game.currentNumber = 4;

        assertThat(game.currentNumberIsMultipleOfFive()).isFalse();

    }


    @Test
    public void recognizeTheGivenNumberIsNotMultipleOfThreeAndFive() {
        Game game = new Game();

        game.currentNumber = 15;

        assertThat(game.currentNumberIsMultipleOfThree()).isTrue();
        assertThat(game.currentNumberIsMultipleOfFive()).isTrue();
    }

    @Test
    public void returnsFizzForMultipleOfThree() {
        Game game = new Game();

        game.currentNumber = 3;

        assertThat(game.stringToDisplay()).isEqualTo("Fizz");
    }

    @Test
    public void returnsBuzzForMultipleOfFive() {
        Game game = new Game();

        game.currentNumber = 5;

        assertThat(game.stringToDisplay()).isEqualTo("Buzz");
    }

    @Test
    public void returnsFizzBuzzForMultipleOfThreeAndFive() {
        Game game = new Game();

        game.currentNumber = 15;

        assertThat(game.stringToDisplay()).isEqualTo("FizzBuzz");
    }
}

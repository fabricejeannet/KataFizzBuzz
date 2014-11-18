import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by fabricejeannet on 18/11/14.
 */
public class Tests {

    @Test
    public void recognizeTheGivenNumberIsMultipleOfThree() {
        Game game = new Game();

        boolean threeIsMultipleOfThree = game.isMultipleOfThree(3);
        boolean sixIsMultipleOfThree = game.isMultipleOfThree(6);
        boolean nineIsMultipleOfThree = game.isMultipleOfThree(9);

        assertThat(threeIsMultipleOfThree).isTrue();
        assertThat(sixIsMultipleOfThree).isTrue();
        assertThat(nineIsMultipleOfThree).isTrue();
    }


    @Test
    public void recognizeTheGivenNumberisNotMultipleOfThree() {
        Game game = new Game();

        boolean sevenIsMultipleOfThree = game.isMultipleOfThree(7);

        assertThat(sevenIsMultipleOfThree).isFalse();
    }


    @Test
    public void recognizeTheGivenNumberisMultipleOfFive() {
        Game game = new Game();

        boolean fiveIsMultipleOfFive = game.isMultipleOfFive(5);
        boolean tenIsMultipleOfFive = game.isMultipleOfFive(10);

        assertThat(fiveIsMultipleOfFive).isTrue();
        assertThat(tenIsMultipleOfFive).isTrue();
    }

    @Test
    public void recognizeTheGivenNumberIsNotMultipleOfFive() {
        Game game = new Game();

        boolean fourIsMultipleOfFive = game.isMultipleOfFive(4);
        boolean sevenIsMultipleOfFive = game.isMultipleOfFive(7);

        assertThat(fourIsMultipleOfFive).isFalse();
        assertThat(sevenIsMultipleOfFive).isFalse();
    }


    @Test
    public void recognizeTheGivenNumberIsNotMultipleOfThreeAndFive() {
        Game game = new Game();

        boolean fithteenIsMultipleOfThree = game.isMultipleOfThree(15);
        boolean fithteenIsMultipleOfFive = game.isMultipleOfFive(15);

        assertThat(fithteenIsMultipleOfThree).isTrue();
        assertThat(fithteenIsMultipleOfFive).isTrue();
    }

    @Test
    public void returnsFizzForMultipleOfThree() {
        Game game = new Game();

        String stringToDisplay = game.getStringToDisplayFor(3);

        assertThat(stringToDisplay).isEqualTo("Fizz");
    }

    @Test
    public void returnsBuzzForMultipleOfFive() {
        Game game = new Game();

        String stringToDisplay = game.getStringToDisplayFor(5);

        assertThat(stringToDisplay).isEqualTo("Buzz");
    }

    @Test
    public void returnsFizzBuzzForMultipleOfThreeAndFive() {
        Game game = new Game();

        String stringToDisplay = game.getStringToDisplayFor(15);

        assertThat(stringToDisplay).isEqualTo("FizzBuzz");
    }
}
